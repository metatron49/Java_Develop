package com.metatron.example;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-01 17:12
 * @Description: ${Description}
 */

public class BuyTicket2 implements  Runnable {

    //不用设置成static 只有一个实例
    private int ticket = 100;
    @Override
    public void run() {
        while (ticket > 0){
            ticket --;
            System.out.println(Thread.currentThread().getName()+ ":" +ticket);
            //yield();
        }
    }


    public static void main(String[] args) {
        BuyTicket2 buyTicket2 = new BuyTicket2();
        Thread thread = new Thread(buyTicket2);
        Thread thread1 = new Thread(buyTicket2);
        Thread thread2 = new Thread(buyTicket2);

        thread.start();
        thread1.start();
        thread2.start();
    }
}
