#jvm-learning

##### VM options
```bash
-Xmx1m -Xms1m  
```
IDEA中配置：  
![VM options](https://user-images.githubusercontent.com/13701989/72151747-fccb5c00-33e3-11ea-8013-a3661c2681b4.png)

测试代码：
```java
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
```

执行结果：
```text
抛异常了
java.lang.OutOfMemoryError: Java heap space
	at com.tangcheng.jvm.oom.OOMCatcher.main(OOMCatcher.java:29)
run finally
end
```


![微信扫描二维码，关注我的公众号](https://user-images.githubusercontent.com/13701989/50696841-8c288b80-107b-11e9-9fbf-2b9e20adc166.jpg)
 <center>微信扫描二维码，关注我的公众号</center>
