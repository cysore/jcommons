package com.github.coderepositories.jcommons.plugins.maven.mbg;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;

import java.io.File;

/**
 * Created by Administrator on 2016/2/3.
 */
public class MyMojoTest extends AbstractMojoTestCase {

    /**
     * {@inheritDoc}
     */
    protected void setUp()
            throws Exception {
        // required
        super.setUp();
    }

    /**
     * {@inheritDoc}
     */
    protected void tearDown()
            throws Exception {
        // required
        super.tearDown();
    }

    /**
     * @throws Exception if any
     */
    public void testSomething()
            throws Exception {

        File pom = getTestFile("src/test/resources/unit/project-to-test/pom.xml");
        assertNotNull(pom);
        assertTrue(pom.exists());

        MyMojo myMojo = (MyMojo) lookupMojo("touch", pom);
        System.out.println(myMojo.getOutputDirectory());

        assertNotNull(myMojo);
        myMojo.execute();
    }

}
