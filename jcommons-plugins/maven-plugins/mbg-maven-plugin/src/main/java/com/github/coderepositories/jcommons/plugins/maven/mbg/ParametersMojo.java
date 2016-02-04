package com.github.coderepositories.jcommons.plugins.maven.mbg;

import com.github.coderepositories.jcommons.tools.mbg.config.custom.CustomContent;
import com.github.coderepositories.jcommons.tools.mbg.config.custom.CustomTableConfig;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/2/4.
 */
@Mojo(name = "param", defaultPhase = LifecyclePhase.PROCESS_SOURCES)
public class ParametersMojo extends AbstractMojo {
    
    /* Parameter Type With One Value */

    // boolean
    @Parameter
    private boolean myBoolean;

    // fixed-point numbers
    @Parameter
    private Integer myInteger;

    // floating-point number
    @Parameter
    private Double myDouble;

    // dates
    @Parameter
    private Date myDate;

    // files and directories
    @Parameter(defaultValue = "${project.build.directory}", property = "outputDir", required = true)
    private File outputDirectory;

    // urls

    // plain text

    // enums
    
    /* Parameter Type With Multiple Values */

    // arrays

    @Parameter
    private String[] myArray;

    // collections
    @Parameter
    private List myList;

    // maps

    // properties

    // other object class


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

        System.out.println("myBoolean : " + myBoolean);

        System.out.println("myInteger : " + myInteger);

        System.out.println("myDate : " + myDate);

        System.out.println("myArray : " + Arrays.toString(myArray));

        System.out.println("myList : " + myList);

        System.out.println("tableConfig : " + tableConfig.getPropsInfo());
        
        System.out.println("customContent : " + customContent.getStartLimit());

    }
}
