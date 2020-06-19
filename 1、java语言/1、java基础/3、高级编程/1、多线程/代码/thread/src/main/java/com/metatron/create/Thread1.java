package com.metatron.create;

/**
 * @Author: Metatron
 * @CreateTime: 2020-05-29 17:29
 * @Description:
 *
 *      多线程的创建
 *      方式一:
 *           一、继承thread 类 重写run方法， 将此线程执行的操作生命在 run方法的方法体中
 *           二、调用start 方法执行
 */
public class Thread1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i+=2) {
            System.out.println(i);
            yield();
        }
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();


        //匿名子类的写法
      /*  new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }.start();*/

    /*    new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }.start();
    */
        for (int i = 1; i < 99; i+=2) {
          System.out.println(i+"------------");
          yield();
        }
    }
}
