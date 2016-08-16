package com.yaroslavtir;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author ymolodkov on 16.08.16.
 */
public class ControllerClassIT {

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
