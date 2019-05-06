package com.lwm.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu21(){
        System.out.println("这是GroupsOnClass2中的stu21运行");
    }

    public void stu22(){
        System.out.println("这是GroupsOnClass2中的stu22运行");
    }
}
