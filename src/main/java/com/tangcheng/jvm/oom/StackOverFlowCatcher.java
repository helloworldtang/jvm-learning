package com.tangcheng.jvm.oom;

import java.util.concurrent.TimeUnit;

/**
 * Error: Could not create the Java Virtual Machine.
 * Error: A fatal exception has occurred. Program will exit.
 * The stack size specified is too small, Specify at least 108k
 *
 * @author: cheng.tang
 * @date: 2020/1/10
 * @see
 * @since
 */
public class StackOverFlowCatcher {


    /**
     * -Xss108k
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            invokeStackOverflow();
        } catch (Throwable e) {
            System.out.println("抛异常了");
            e.printStackTrace();
        } finally {
            /**
             * java.lang.StackOverflowError 异常后会执行finally中的语句
             */
            System.out.println("run finally");
        }
        /**
         * java.lang.StackOverflowError 异常被catch后
         * 会执行下面的打印
         */
        System.out.println("end");
    }

    private static void invokeStackOverflow() {
        invokeStackOverflow();
    }


}
