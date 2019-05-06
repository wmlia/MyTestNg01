package com.lwm.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /**
     * 期望结果为某一个异常的时候。传入不合法的参数，程序抛出了异常，预期结果就是这个异常
     */

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
