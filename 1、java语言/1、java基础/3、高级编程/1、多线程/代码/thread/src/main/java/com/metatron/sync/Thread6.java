package com.metatron.sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-03 13:59
 * @Description:
 *
 *  线程同步的方式三：Lock锁
 *  使用Lock 接口的实现类 提供的 lock() 和 unlock() 实现线程同步
 *
 *
 */
public class Thread6 implements Runnable{
    private Lock lock = new ReentrantLock(true);

    private int ticket = 100;

    @Override
    public void run() {
        while (true) {

            try {
                lock.lock();
                if(ticket >0 ){
                    System.out.println(Thread.currentThread().getName() + ":" + ticket);
                    ticket--;
                }else{
                    break;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        Thread6 thread6 = new Thread6();
        new Thread(thread6).start();
        new Thread(thread6).start();
        new Thread(thread6).start();
    }
}
