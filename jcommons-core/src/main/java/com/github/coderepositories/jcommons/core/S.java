package com.github.coderepositories.jcommons.core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import com.github.coderepositories.jcommons.core.date.Dates;
import com.google.common.collect.Lists;

/**
 * <p>
 * 最常用的工具API汇总，比如：判断非空、前置条件验证<br>
 * 为了调用方方便所以就用特殊符号命名了
 * </p>
 * 
 * @author zhangguangyong
 * 
 *         2016年1月21日 下午10:14:35
 */
public abstract class S {

	static final String LINE_SEPARATOR = System.lineSeparator();

	/**
	 * 断言一个对象的值为Null
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean isNull(Object obj) {
		return null == obj;
	}

	/**
	 * 断言一个对象的值不为Null
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean notNull(Object obj) {
		return null != obj;
	}

	/**
	 * 断言一个对象的值为空
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean isEmpty(Object obj) {
		return !notEmpty(obj);
	}

	/**
	 * 断言一个对象的值为非空
	 * 
	 * <pre>
	 * 
	 * 	obj 为Null, 返回 false
	 * 	obj 为{@code CharSequence}(字符序列)，{@code obj.toString().trim().length()==0}, 返回 false
	 * 	obj 为{@code Array}(数组), {@code obj.length == 0}, 返回 false
	 * 	obj 为{@code Iterable}(可迭代), {@code obj.iterator().hasNext()==false}, 返回 false
	 * 	obj 为{@code Map}(键值对), {@code obj.isEmpty()==true}, 返回 false
	 * </pre>
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean notEmpty(Object obj) {
		if (isNull(obj)) {
			return false;
		}
		// 传入对象的类型
		Class<? extends Object> cls = obj.getClass();

		// 字符序列
		if (CharSequence.class.isAssignableFrom(cls)) {
			return ((CharSequence) obj).toString().trim().length() > 0;
		}

		// 数组
		if (cls.isArray()) {
			return Array.getLength(obj) > 0;
		}

		// 可迭代的
		if (Iterable.class.isAssignableFrom(cls)) {
			return ((Iterable<?>) obj).iterator().hasNext();
		}

		// 键值对
		if (Map.class.isAssignableFrom(cls)) {
			return !((Map<?, ?>) obj).isEmpty();
		}

		// 其他类型
		return true;
	}

	/**
	 * 检查Null值，如果 reference 为Null，则抛出{@code NullPointerException}异常
	 * 
	 * @param reference
	 * @return
	 */
	public static <T> T checkNotNull(T reference) {
		if (reference == null) {
			throw new NullPointerException();
		}
		return reference;
	}

	/**
	 * 检查Null值，如果 reference 为Null，则抛出{@code NullPointerException}异常
	 * 
	 * @param reference
	 * @param errorMessage
	 *            错误消息描述
	 * @return
	 */
	public static <T> T checkNotNull(T reference, Object errorMessage) {
		if (reference == null) {
			throw new NullPointerException(String.valueOf(errorMessage));
		}
		return reference;
	}

	/**
	 * 检查Null值，如果 reference 为Null，则抛出{@code NullPointerException}异常
	 * 
	 * @param reference
	 * @param errorMessageTemplate
	 *            错误消息模板
	 * @param errorMessageArgs
	 *            错误消息参数
	 * @return
	 */
	public static <T> T checkNotNull(T reference, String errorMessageTemplate, Object... errorMessageArgs) {
		if (reference == null) {
			throw new NullPointerException(String.format(errorMessageTemplate, errorMessageArgs));
		}
		return reference;
	}

	/**
	 * 检查空值，如果 reference 为空，则抛出{@code EmptyValueException}异常
	 * 
	 * @param reference
	 * @return
	 */
	public static <T> T checkNotEmpty(T reference) {
		if (isEmpty(reference)) {
			throw new EmptyValueException();
		}
		return reference;
	}

	/**
	 * 检查空值，如果 reference 为空，则抛出{@code EmptyValueException}异常
	 * 
	 * @param reference
	 * @param errorMessage
	 *            自定义错误消息描述
	 * @return
	 */
	public static <T> T checkNotEmpty(T reference, Object errorMessage) {
		if (reference == null) {
			throw new EmptyValueException(String.valueOf(errorMessage));
		}
		return reference;
	}

	/**
	 * 检查空值，如果 reference 为空，则抛出{@code EmptyValueException}异常
	 * 
	 * @param reference
	 * @param errorMessageTemplate
	 *            错误消息模板
	 * @param errorMessageArgs
	 *            错误消息参数
	 * @return
	 */
	public static <T> T checkNotEmpty(T reference, String errorMessageTemplate, Object... errorMessageArgs) {
		if (reference == null) {
			throw new EmptyValueException(String.format(errorMessageTemplate, errorMessageArgs));
		}
		return reference;
	}

	/**
	 * <pre>
	 * 	原始类型数组转换为对象类型数组
	 * 	如果参数为Null或者不是数组类型，则直接返回参数本身
	 * 	如果参数已经是对象数组类型，则直接返回参数本书
	 * 	
	 * 		toObjectArray(int[]) == Integer[]
	 * 		toObjectArray(double[]) == Double[]
	 * 		...
	 * 		toObjectArray(primitiveArray) == wrapArray
	 * 
	 * </pre>
	 * 
	 * @param primitiveArray
	 * @return
	 */
	public static Object toObjectArray(Object primitiveArray) {
		// 非空检查
		if (isNull(primitiveArray)) {
			return primitiveArray;
		}

		// 获取参数的类型
		Class<? extends Object> parameterClass = primitiveArray.getClass();

		// 判断参数类型是否为数组类型
		if (!parameterClass.isArray()) {
			return primitiveArray;
		}

		// 数组元素类型
		Class<?> componentType = parameterClass.getComponentType();

		// 判断参数是否为原始类型数组
		if (!componentType.isPrimitive()) {
			return primitiveArray;
		}

		// 原始类型数组 -> 包装类型数组
		if (byte.class == componentType) {
			byte[] src = (byte[]) primitiveArray;
			Byte[] dest = new Byte[src.length];
			for (int i = 0; i < src.length; i++) {
				dest[i] = src[i];
			}
			return dest;
		}

		if (short.class == componentType) {
			short[] src = (short[]) primitiveArray;
			Short[] dest = new Short[src.length];
			for (int i = 0; i < src.length; i++) {
				dest[i] = src[i];
			}
			return dest;
		}

		if (char.class == componentType) {
			char[] src = (char[]) primitiveArray;
			Character[] dest = new Character[src.length];
			for (int i = 0; i < src.length; i++) {
				dest[i] = src[i];
			}
			return dest;
		}

		if (int.class == componentType) {
			int[] src = (int[]) primitiveArray;
			Integer[] dest = new Integer[src.length];
			for (int i = 0; i < src.length; i++) {
				dest[i] = src[i];
			}
			return dest;
		}

		if (int.class == componentType) {
			int[] src = (int[]) primitiveArray;
			Integer[] dest = new Integer[src.length];
			for (int i = 0; i < src.length; i++) {
				dest[i] = src[i];
			}
			return dest;
		}

		if (long.class == componentType) {
			long[] src = (long[]) primitiveArray;
			Long[] dest = new Long[src.length];
			for (int i = 0; i < src.length; i++) {
				dest[i] = src[i];
			}
			return dest;
		}

		if (float.class == componentType) {
			float[] src = (float[]) primitiveArray;
			Float[] dest = new Float[src.length];
			for (int i = 0; i < src.length; i++) {
				dest[i] = src[i];
			}
			return dest;
		}

		if (double.class == componentType) {
			double[] src = (double[]) primitiveArray;
			Double[] dest = new Double[src.length];
			for (int i = 0; i < src.length; i++) {
				dest[i] = src[i];
			}
			return dest;
		}

		throw new RuntimeException("不支持的原始类型数组：" + parameterClass);
	}

	/**
	 * 执行CMD命令
	 * 
	 * @param first
	 *            第一个命令
	 * @param rest
	 *            剩余的命令
	 */
	public static void execCmd(String first, String... rest) {
		execCmd(Lists.asList(first, rest));
	}

	/**
	 * <pre>
	 * 执行多个CMD命令
	 * 处理方式：每个cmd命令都放入到一个.bat文件中，然后直接执行.bat文件
	 * </pre>
	 * 
	 * @param cmds
	 */
	public static void execCmd(Iterable<String> cmds) {
		String home = System.getProperty("user.home");
		File bat = null;
		BufferedWriter bw = null;

		try {
			StringBuilder sb = new StringBuilder("echo off" + LINE_SEPARATOR);
			Iterator<String> itera = cmds.iterator();
			while (itera.hasNext()) {
				sb.append(itera.next()).append(LINE_SEPARATOR);
			}

			bat = new File(home, System.currentTimeMillis() + ".bat");
			bw = new BufferedWriter(new FileWriter(bat));
			bw.write(sb.toString());
			bw.flush();
			bw.close();
			execCmd(bat.getPath());
			bat.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 执行CMD命令
	 * 
	 * @param cmd
	 */
	private static void execCmd(String cmd) {
		Process p = null;
		try {
			Runtime rt = Runtime.getRuntime();
			p = rt.exec(cmd);
			// 获取进程的标准输入流
			final InputStream is1 = p.getInputStream();
			// 获取进城的错误流
			final InputStream is2 = p.getErrorStream();
			// 启动两个线程，一个线程负责读标准输出流，另一个负责读标准错误流
			new Thread() {
				public void run() {
					BufferedReader br1 = new BufferedReader(new InputStreamReader(is1));
					try {
						String line1 = null;
						while ((line1 = br1.readLine()) != null) {
							if (line1 != null) {
								System.out.println(line1);
							}
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							is1.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}.start();

			new Thread() {
				public void run() {
					BufferedReader br2 = new BufferedReader(new InputStreamReader(is2));
					try {
						String line2 = null;
						while ((line2 = br2.readLine()) != null) {
							if (line2 != null) {
							}
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							is2.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}.start();

			p.waitFor();
			p.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 日期对象转换为日期字符串
	 * 
	 * @param date
	 *            日期对象
	 * @param pattern
	 *            日期字符串模式
	 * @return
	 */
	public static String dateFormat(Date date, String pattern) {
		return Dates.format(date, pattern);
	}

	/**
	 * 日期字符串转换为日期对象
	 * 
	 * @param date
	 *            日期字符串
	 * @param pattern
	 *            日期字符串模式
	 * @return
	 */
	public static Date dateParse(String date, String pattern) {
		return Dates.parse(date, pattern);
	}

}
