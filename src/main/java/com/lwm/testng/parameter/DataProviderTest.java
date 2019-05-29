package com.lwm.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
            System.out.println("哎哟name="+name+",age="+age);
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1方法 name="+name+",age="+age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2方法 name="+name+",age="+age);
    }
    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o=new Object[][]{
                {"zhangsan",17},
                {"lisi",18},
                {"wangwu",20}
        };
        return o;
    }

    @DataProvider(name = "methodData")
    public Object[][] providerData(Method method){
        Object[][] result=null;

        if(method.getName().equals("test1")){
            result=new Object[][]{
                    {"qiaofeng",29},
                    {"azhu",23}
            };
        }else if(method.getName().equals("test2")){
            result=new Object[][]{
                    {"guojing",33},
                    {"huangrong",32}
            };
        }
        return result;
    }
}
