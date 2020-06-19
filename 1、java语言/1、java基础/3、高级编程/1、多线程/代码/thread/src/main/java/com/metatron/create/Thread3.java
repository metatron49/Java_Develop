package com.metatron.create;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-01 16:54
 * @Description:
 *
 *      多线程的创建：
 *          方式二：1、创建一个实现了runnable 接口的类，实现run（）方法
 *                 2、创建该类的对象
 *                 3、将该类作为参数传入 Thread 的构造方法中

        优先使用实现runnable接口的方法
        原因一、java 单继承的局限性
        原因二、多个线程间共享数据的问题

 */


public class Thread3 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread3 thread3 = new Thread3();

        new Thread(thread3).start();
    }
}
