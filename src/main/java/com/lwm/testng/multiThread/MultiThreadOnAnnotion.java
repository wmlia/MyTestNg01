package com.lwm.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {

    @Test(invocationCount = 100,threadPoolSize = 3)  //3个线程同时运行，共执行10次
//    用@Test(invocationCount = x,threadPoolSize = y)声明，
//    invocationCount表示执行次数，threadPoolSize表示线程池大小。
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
