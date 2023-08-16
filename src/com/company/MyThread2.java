package com.company;

public class MyThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("备胎"+i);
        }
    }
}
