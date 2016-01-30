package com.github.coderepositories.jcommons.tools.mgb;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import com.github.coderepositories.jcommons.core._;
import com.google.common.io.Files;

@SuppressWarnings("all")
public class MybatisGeneratorUtil {

	static Logger logger = Logger.getLogger(MybatisGeneratorUtil.class.getName());

	/**
	 * 工作空间目录
	 */
	static final String WORKSPACE = System.getProperty("user.dir");

	/**
	 * 正则匹配：Entity.java, EntityMapper.java, Mapper.xml
	 */
	static final String ENTITY_MAPPER_REGEX = ".*(Entity|EntityMapper)(.java|.xml)";

	static final String CUSTOM_CODE_START_REGEX = ".*CUSTOM_CODE_START.*";

	static final String CUSTOM_CODE_END_REGEX = ".*CUSTOM_CODE_END.*";

	static final Charset DEFAULT_CHARSET = Charset.defaultCharset();

	private static List<File> findFiles(File dir) {
		return loopDir(dir);
	}

	/**
	 * 遍历目录
	 * 
	 * @param dir
	 * @return
	 */
	private static List<File> loopDir(File dir) {
		return loopDir(dir, new ArrayList<File>());
	}

	/**
	 * 遍历目录，把过滤出来的文件添加到列表中
	 * 
	 * @param dir
	 * @param appendTo
	 * @return
	 */
	private static List<File> loopDir(File dir, List<File> appendTo) {
		if (dir.isDirectory()) {
			File[] files = dir.listFiles();
			String fileName = null;
			for (File file : files) {
				fileName = file.getName();
				if (file.isDirectory()) {
					// 过滤classes目录的文件
					if (fileName.equals("classes")) {
						continue;
					}
					loopDir(file, appendTo);
				} else {
					if (matched(file.getName())) {
						appendTo.add(file);
					}
				}
			}
		}
		return appendTo;
	}

	/**
	 * 匹配Entity.java EntityMapper.java Mapper.xml 格式的文件
	 * 
	 * @param fileName
	 * @return
	 */
	private static boolean matched(String fileName) {
		return fileName.matches(ENTITY_MAPPER_REGEX);
	}

	/**
	 * 获取自定义代码内容
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	private static String findCustomCodeContent(File file) throws IOException {
		List<String> lines = Files.readLines(file, DEFAULT_CHARSET);
		StringBuilder content = new StringBuilder();
		boolean flag = false;
		for (String line : lines) {
			if (line.matches(".*CUSTOM_CODE_START.*")) {
				flag = true;
			}
			if (flag) {
				content.append(line).append(System.lineSeparator());
			}
			if (line.matches(".*CUSTOM_CODE_END.*")) {
				flag = false;
			}
		}
		return content.toString();
	}

	/**
	 * 保存自定义代码内容
	 * 
	 * @param fromDir
	 *            扫描目录
	 * @param saveTo
	 *            自定义代码内容保存文件
	 * @throws IOException
	 */
	private static void saveCustomCodeContent(File fromDir, File saveTo) throws IOException {
		StringBuilder allCustomCodeContent = new StringBuilder();
		List<File> list = findFiles(fromDir);
		for (File file : list) {
			String codeContent = findCustomCodeContent(file);
			if (codeContent.length() > 0) {
				allCustomCodeContent.append("#" + file.getAbsolutePath()).append(System.lineSeparator())
						.append(codeContent).append(System.lineSeparator());
			}
		}
		Files.write(allCustomCodeContent, saveTo, DEFAULT_CHARSET);
	}

	/**
	 * <pre>
	 * 保存自定义代码内容
	 * 扫描目录默认为当前项目路径
	 * </pre>
	 * 
	 * @param saveTo
	 *            自定义代码内容保存文件
	 * @throws IOException
	 */
	private static void saveCustomCodeContent(File saveTo) throws IOException {
		File fromDir = new File(WORKSPACE);
		saveCustomCodeContent(fromDir, saveTo);
	}

	/**
	 * 加载自定义代码
	 * 
	 * @param from
	 *            自定义代码内容文件
	 * @throws IOException
	 */
	private static void loadCustomCodeContent(File from) throws IOException {
		List<String> lines = Files.readLines(from, DEFAULT_CHARSET);
		File file = null;
		StringBuilder customCodeContent = new StringBuilder();
		for (String line : lines) {
			if (line.matches("^#.*")) {
				if (null != file) {
					appendCustomCodeContentTo(file, customCodeContent.toString());
					customCodeContent.setLength(0);
				}
				file = new File(line.replace("#", ""));
				continue;
			}
			customCodeContent.append(line).append(System.lineSeparator());
		}
		appendCustomCodeContentTo(file, customCodeContent.toString());
	}

	/**
	 * 追加自定义代码到一个文件
	 * 
	 * @param to
	 *            追加到这个文件
	 * @param customCodeContent
	 *            自定义代码内容
	 * @throws IOException
	 */
	private static void appendCustomCodeContentTo(File to, String customCodeContent) throws IOException {
		// 添加自定义代码后的内容
		StringBuilder appendCustomCodeContent = new StringBuilder();
		List<String> lines = Files.readLines(to, DEFAULT_CHARSET);
		String line = null;
		int lineCount = lines.size();
		for (int i = 0; i < lineCount; i++) {
			line = lines.get(i);
			// 文件的最后一行
			if (i == (lineCount - 1)) {
				appendCustomCodeContent.append(System.lineSeparator()).append(customCodeContent);
				// 这里把文件末尾多余的空行移除
				String content = appendCustomCodeContent.toString().replaceAll("(\r\n){1,}$", "");
				appendCustomCodeContent.setLength(0);
				appendCustomCodeContent.append(content).append(System.lineSeparator()).append(line);
				break;
			}
			appendCustomCodeContent.append(line).append(System.lineSeparator());
		}
		Files.write(appendCustomCodeContent, to, DEFAULT_CHARSET);
	}

	/**
	 * 删除自动生成的文件
	 * 
	 * @param fromFolder
	 */
	private static void removeAutoGeneratorFile(File fromFolder) {
		List<File> files = findFiles(fromFolder);
		for (File file : files) {
			file.delete();
		}
	}

	/**
	 * 自动生成文件
	 * 
	 * @param toFolder
	 */
	private static void doAutoGeneratorFile(File toFolder) {
		File pomFile = new File(toFolder, "pom.xml");
		_.execCmd(Arrays.asList("mvn -f " + pomFile.getAbsolutePath() + " mybatis-generator:generate"));
	}
	
	/**
	 * 更新Mybatis生成的代码
	 * @throws IOException
	 */
	public static void doUpdateMybatisGenerator() throws IOException {
		File workspace = new File(WORKSPACE);
		File customCodeContent = new File(WORKSPACE, String.valueOf(System.currentTimeMillis()));

		// 保存自定义代码内容
		logger.info("保存自定义代码内容...");
		saveCustomCodeContent(customCodeContent);

		// 删除Mybatis自定生成的文件
		logger.info("删除Mybatis自定生成的文件...");
		removeAutoGeneratorFile(workspace);

		// Mybatis自动生成文件
		logger.info("Mybatis自动生成文件...");
		doAutoGeneratorFile(workspace);

		// 加载自定义代码内容
		logger.info("加载自定义代码内容...");
		loadCustomCodeContent(customCodeContent);
	}

	public static void main(String[] args) {
		try {
			doUpdateMybatisGenerator();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
