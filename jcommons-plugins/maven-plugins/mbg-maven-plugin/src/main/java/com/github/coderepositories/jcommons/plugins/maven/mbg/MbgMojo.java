package com.github.coderepositories.jcommons.plugins.maven.mbg;

import com.github.coderepositories.jcommons.tools.mbg.MBGTemplate;
import com.github.coderepositories.jcommons.tools.mbg.config.custom.CustomConfiguration;
import com.github.coderepositories.jcommons.tools.mbg.config.custom.CustomContent;
import com.github.coderepositories.jcommons.tools.mbg.config.custom.CustomTableConfig;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;

/**
 * Created by Administrator on 2016/2/4.
 */
@Mojo(name = "mbg", defaultPhase = LifecyclePhase.PROCESS_SOURCES)
public class MbgMojo extends AbstractMojo {

    /**
     * Mybatis Generator 配置文件
     */
    @Parameter
    private File generatorConfiguretionFile;
    
    /**
     * 自定义Table配置
     */
    @Parameter
    private CustomTableConfig tableConfig;

    /**
     * 自定义内容配置
     */
    @Parameter
    private CustomContent customContent;
    
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        
        CustomConfiguration customConfiguration = new CustomConfiguration();
        customConfiguration.setCustomContent(customContent);
        customConfiguration.setTableConfig(tableConfig);
        
        MBGTemplate.start(generatorConfiguretionFile, customConfiguration);
    }
}
