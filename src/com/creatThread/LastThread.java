package com.creatThread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LastThread {
    public static void main(String[] args) {
        //方式1：相当于继承了Thread类，作为子类重写run()实现
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                String name=Thread.currentThread().getName();
//                System.out.println(name);
//            }
//        }).start();


        //方式2:实现Runnable,Runnable作为匿名内部类
//        new Thread(){
//            public void run(){
//                String name=Thread.currentThread().getName();
//                System.out.println(name);
//            }
//        }.start();


//        Thread thread=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                String threadname=Thread.currentThread().getName();
//                System.out.println(threadname);
//            }
//        });
//        thread.run();

        //这么开启一个线程，在平常Android开发过程中是不允许的。
        //忽然开启一个线程，他会导致内存会抖动一下。
        //如果内存频繁的抖动，
        //就会导致触发GC频繁的回收垃圾，GC的回收会让所有线程都停止，包括主线程也会停止的，必然会导致页面的卡顿。
        //应该维护一个线程池，用线程池来执行这个异步功能。

        //以上使匿名内部类开启线程，同理的还有继承Thread/重写run（），还有实现Runnable/重写run()
        //他们都有一个弊端，就是，它什么结束，执行结果是什么，我们不知道
        //这个时候需要Callable 和 Future 的出现



    }

    //Future一般都配合线程池使用的。


    public void createfuture(){
        //创建一个线程池
        ExecutorService executorService= Executors.newSingleThreadExecutor();

        //向线程提交一个任务，返回一个Future实例
        //Future<?> future=executorService.submit();
    }

}
