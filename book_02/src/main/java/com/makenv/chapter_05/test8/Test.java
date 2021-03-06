package com.makenv.chapter_05.test8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        MyCallable myCallable = new MyCallable();
        ExecutorService service = Executors.newCachedThreadPool();
        Future<String> future = service.submit(myCallable);
        // 没有输出线程运行
        // cancel中断正在运行的线程
        // true true
        // 在线程运行之前取消
        System.out.println(future.cancel(true) + " " + future.isCancelled());
    }
}
