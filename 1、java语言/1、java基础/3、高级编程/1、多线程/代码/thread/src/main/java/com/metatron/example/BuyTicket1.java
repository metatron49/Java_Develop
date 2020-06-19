package com.metatron.example;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-01 16:45
 * @Description:  使用继承Thread 类的方法实现三个窗口买票
 */
public class BuyTicket1 extends Thread{

    //需要设置成static变量，被三个实例共享
    private static int ticket = 100;
    private String name;

    @Override
    public void run() {

        while (ticket > 0){
            ticket --;
            System.out.println(name + ":" +ticket);
        }
    }

    public BuyTicket1(String name) {
        super();
        this.name = name;
    }

    public static void main(String[] args) {

        //三个线程类的实例
        BuyTicket1 buyTicket = new BuyTicket1("窗口一");
        BuyTicket1 buyTicket1 = new BuyTicket1("窗口二");
        BuyTicket1 buyTicket2 = new BuyTicket1("窗口三");

        buyTicket.start();
        buyTicket1.start();
        buyTicket2.start();
    }
}
