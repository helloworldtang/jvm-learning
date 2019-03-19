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
     * <p>
     * 抛异常了
     * java.lang.OutOfMemoryError: Java heap space
     * at com.tangcheng.jvm.oom.OOMCatcher.main(OOMCatcher.java:28)
     * hello
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
        }
        System.out.println("hello");
    }


}
