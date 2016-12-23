package com.github.coderepositories.jcommons.plugins.maven.mbg;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;

import java.io.File;

/**
 * Created by Administrator on 2016/2/4.
 */
public class ParametersMojoTest extends AbstractMojoTestCase {

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

        ParametersMojo paramMojo = (ParametersMojo) lookupMojo("param", pom);

        assertNotNull(paramMojo);
        paramMojo.execute();
    }

}
