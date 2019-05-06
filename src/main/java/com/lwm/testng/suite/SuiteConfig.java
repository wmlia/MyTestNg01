package com.lwm.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite运行了");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite运行了");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("这是配置文件中的beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("这是配置文件中的afterTest");
    }
}
