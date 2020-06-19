package com.metatron;


import java.util.concurrent.*;

import static java.lang.Thread.yield;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-01 16:00
 * @Description: ${Description}
 */
public class Test implements Callable<String> {


    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        return "hahahaha";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Test test = new Test();
        FutureTask<String> stringFutureTask = new FutureTask<String>(test);
        FutureTask<String> stringFutureTask1 = new FutureTask<String>(test);
        new Thread(stringFutureTask).start();
        new Thread(stringFutureTask1).start();

    }
}

