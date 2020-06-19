package com.metatron.sync;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-03 10:12
 * @Description:
 * 解决线程同步的方式一：
 *   1、同步代码块 操作共享数据的代码即为被同步的代码
 *   2、同步锁：1、可以是任意对象，但多个线程公用一把锁，也就是说这个对象对多个线程来说是唯一的


  */
public class Thread4 implements Runnable{

    private int  ticket = 100;
    Object object = new Object();
    @Override
    public void run() {
        while (true){
            synchronized(this){
                //判断的逻辑要放在synchronized 代码块里面
                if(ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ":" + ticket);
                    ticket-- ;
                }else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread4 thread4 = new Thread4();

        Thread thread = new Thread(thread4);
        Thread thread1 = new Thread(thread4);
        Thread thread2 = new Thread(thread4);

        thread.start();
        thread1.start();
        thread2.start();

    }
}
