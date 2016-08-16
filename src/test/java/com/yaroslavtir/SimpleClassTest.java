package com.yaroslavtir;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author ymolodkov on 16.08.16.
 */
public class SimpleClassTest {

    private SimpleClass simpleClass;

    @Before
    public void setUp(){
        simpleClass = new SimpleClass();
    }

    @Test
    public void simpleUnitTest(){
        Assert.assertTrue(true);
    }

}
