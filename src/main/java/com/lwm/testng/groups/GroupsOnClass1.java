package com.lwm.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu11(){
        System.out.println("这是GroupsOnClass1中的stu11运行");
    }

    public void stu12(){
        System.out.println("这是GroupsOnClass1中的stu12运行");
    }
}
