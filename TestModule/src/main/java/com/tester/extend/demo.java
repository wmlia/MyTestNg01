package com.tester.extend;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo {

    @Test
    public void test1(){
        System.out.println("这个是为了测试报告");
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void test3(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test4(){
        Assert.assertEquals("小仙女", "小仙女");
    }

    @Test
    public void logDemo(){
        Reporter.log("这是我们自己写的日志");
        throw new RuntimeException("这是我自己的运行时异常");
    }

}
