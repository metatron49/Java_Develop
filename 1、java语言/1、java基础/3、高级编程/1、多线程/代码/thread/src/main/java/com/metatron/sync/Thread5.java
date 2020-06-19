package com.metatron.sync;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-03 10:33
 * @Description:
 *  方式二：同步方法
 *      加了synvchroized 关键字的方法同一时间只有一个线程可以执行
 *      不用显式的写出锁来，非静态方法锁默认的是this，静态方法的锁默认的是 class对象
 *
 *
 */
public class Thread5 implements Runnable{

    private int ticket = 100;
    Object object = new Object();

    @Override
    public void run() {
        while (true){
            saleTicket();
        }
    }

    private synchronized void saleTicket(){
        if(ticket > 0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ":" + ticket);
            ticket-- ;
        }
    }

    public static void main(String[] args) {
        Thread5 thread5 = new Thread5();

        Thread thread = new Thread(thread5);
        Thread thread1 = new Thread(thread5);
        Thread thread2 = new Thread(thread5);
        new StringBuffer();
        new StringBuilder();
        thread.start();
        thread1.start();
        thread2.start();

    }
}
