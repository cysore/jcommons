package com.github.coderepositories.jcommons.plugins.maven.mbg;

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
@Mojo(name = "param", defaultPhase = LifecyclePhase.PROCESS_SOURCES)
public class ParametersMojo extends AbstractMojo{
    
    /* Parameter Type With One Value */
    
    // boolean
    @Parameter(defaultValue = "false", required = true)
    private boolean myBoolean;
    
    // fixed-point numbers
    @Parameter(defaultValue = "100", required = false)
    private Integer myInteger;
    
    // floating-point number
    @Parameter(defaultValue = "100.1")
    private Double myDouble;
    
    // dates
    
    
    // files and directories
    
    // urls
    @Parameter(defaultValue = "${project.build.directory}", property = "outputDir", required = true)
    private File outputDirectory;
    
    // plain text
    
    // enums
    
    /* Parameter Type With Multiple Values */
    
    // arrays
    
    // collections
    
    // maps
    
    // properties
    
    // other object class
    
    
    
    
    
    
    
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        
        System.out.println("myBoolean : " + myBoolean);
        
        System.out.println("myInteger : " + myInteger);
        
    }
}
