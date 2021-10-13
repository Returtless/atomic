package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.LongAdder;

class MyRunnable implements Runnable {
    public static int ARRAY_MAX_COUNT = 100;
    public static int ARRAY_MAX_VALUE = 10000;
    private final LongAdder sum;

    public MyRunnable(LongAdder sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        int[] array = new Random().ints(new Random().nextInt(ARRAY_MAX_COUNT), 0, ARRAY_MAX_VALUE).toArray();
        System.out.println(Arrays.stream(array).sum());
        Arrays.stream(array).forEach(sum::add);
    }

}