package com.company;

import java.util.concurrent.atomic.LongAdder;

public class Main {
    public static int THREADS_COUNT = 3;
    public static int TIMEOUT = 3000;

    public static void main(String[] args) throws InterruptedException {
        LongAdder sum = new LongAdder();

        for (int i = 0; i < THREADS_COUNT; i++) {
            new Thread(new MyRunnable(sum)).start();
        }
        Thread.sleep(TIMEOUT);
        System.out.printf("Результат сложения: %s", sum.sum());
    }
}