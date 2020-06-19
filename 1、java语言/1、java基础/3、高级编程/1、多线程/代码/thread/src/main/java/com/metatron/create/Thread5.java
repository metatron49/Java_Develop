package com.metatron.create;

import java.util.concurrent.*;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-03 16:15
 * @Description:
 *
 * 创建线程的方式三：使用callable 接口
 *  1、实现callable接口 重写call方法
 *  2、将实现类作为参数传入 FutureTask的构造方法中
 *  3、将FutureTask 对象作为参数传入Thread 的构造方法中 并调用Thread的start方法
 *  4、使用 FutureTask的get方法获得 call方法的返回值
 *
 */
public class Thread5 implements Callable<String> {


    @Override
    public String call() throws Exception {

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum+"";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread5 thread5 = new Thread5();
        FutureTask<String> futureTask = new FutureTask<String>(thread5);

        new Thread(futureTask).start();

        System.out.println(futureTask.get());
    }





}

