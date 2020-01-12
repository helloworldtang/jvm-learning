/**
 * @Auther: cheng.tang
 * @Date: 2019/3/19
 * @Description:
 */
package com.tangcheng.jvm.oom;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: cheng.tang
 * @Date: 2019/3/19
 * @Description:
 */
public class OOMCatcher {

    /**
     * -Xmx1m -Xms1m
     * 抛异常了
     * java.lang.OutOfMemoryError: Java heap space
     * at com.tangcheng.jvm.oom.OOMCatcher.main(OOMCatcher.java:29)
     * run finally
     * end
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            byte[] _10M = new byte[1024 * 1024 * 1024];
            TimeUnit.SECONDS.sleep(20);
            System.out.println("sleep 20s 了");
        } catch (Throwable e) {
            System.out.println("抛异常了");
            e.printStackTrace();
        } finally {
            /**
             *java.lang.OutOfMemoryError 异常后，finally中的语句会被执行
             * 不论是否catch，finally的语句块都会执行
             */
            System.out.println("run finally");
        }
        /**
         * java.lang.OutOfMemoryError 异常被catch后,下面打印会正常执行
         * 如果没有catch，则不会打印
         */
        System.out.println("end");
    }


}
