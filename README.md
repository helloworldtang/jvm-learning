#jvm-learning

##### VM options
```bash
-Xmx1m -Xms1m  
```

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
        }
        System.out.println("hello");
    }
```

执行结果：
```text
抛异常了
java.lang.OutOfMemoryError: Java heap space
at com.tangcheng.jvm.oom.OOMCatcher.main(OOMCatcher.java:28)
hello
```


![微信扫描二维码，关注我的公众号](https://user-images.githubusercontent.com/13701989/50696841-8c288b80-107b-11e9-9fbf-2b9e20adc166.jpg)
 <center>微信扫描二维码，关注我的公众号</center>
