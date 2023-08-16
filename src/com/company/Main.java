package com.company;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//	    MyThread t1 = new MyThread();
//        t1.start();
//
//        MyThread2 myThread2 = new MyThread2();
//        Thread t2 = new Thread(myThread2);
//        t2.start();


//        //创建MyCallable的对象(表示多线程要执行的任务)
//        MyCallable myCallable = new MyCallable();
//        //创建FutureTask的对象(作用管理多线程运行的结果)
//        FutureTask<Integer> ft = new FutureTask<>(myCallable);
//        //启动线程
//        new Thread(ft).start();
//        //获取多线程运行的结果
//        Integer res = ft.get();
//        System.out.println(res);

        //将第一个线程设置为守护线程
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.setDaemon(true);
        new Thread(t2).start();
        t1.start();

    }
}
