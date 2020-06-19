package com.metatron.example;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-03 14:06
 * @Description: ${Description}
 */
public class Bank implements Runnable{

    private int savings;

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            savings += 1000;
        }
        System.out.println(savings);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        new Thread(bank).start();
        new Thread(bank).start();

    }
}
