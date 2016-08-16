package com.yaroslavtir;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * @author ymolodkov on 16.08.16.
 */
@Category(IntegrationTest.class)
public class ControllerClassTest {

    public ControllerClass controllerClass;

    @Before
    public void setUp(){
        controllerClass = new ControllerClass();
    }

    @Test
    public void simpleItTest(){
        Assert.assertTrue(true);
    }
}
