package com.lwm.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Test
    @Parameters({"name","age"})
    public void paramterTest(String name,int age){
        System.out.println("哈哈name="+name+",age="+age);
    }
}
