package com.metatron.communication;

import javax.sound.midi.Soundbank;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-03 15:00
 * @Description:
 *  三个方法：
 *      1、wait() 一旦使用此方法，当前线程会立即阻塞, 并会释放锁（同步监视器）
 *      2、notify() 使用此方法会唤醒被wait的一个线程，如果有多个线程wait，就唤醒优先级高的哪个线程。
 *      3、notifyAll() 唤醒所有被wait的线程
 *  说明：
 *      1、三个方法必须使用在同步代码块和同步方法中
 *      2、方法的调用者必须是同步代码块或同步方法中的同步监视器对象
 *
 *   sleep 和 wait 的区别
 *   一、sleep 在 Thread 类中声明，wait 在object中的声明。
 *   二、sleep可以在任何场景下使用，wait只能在同步代码块中使用。
 *   三、sleep不会释放同步锁，wait会释放同步锁。
 *
 */

public class Test1 {
    public static void main(String[] args) {
        Number number = new Number();
        new Thread(number).start();
        new Thread(number).start();
        new Thread(number).start();
    }

}

class Number implements Runnable{

    private int num = 100;
    Object object = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (object) {
                object.notifyAll();
                if(num > 0){
                    System.out.println(Thread.currentThread().getName()+":"+num);
                    num --;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }
    }
}