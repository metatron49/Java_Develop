package com.metatron.example;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-03 17:30
 * @Description:
 *
 * 比较 StringBuilder 和 StringBuffer 的区别
 *
 */
public class StringTest implements Runnable{

    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void run() {
        //System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            stringBuilder.append("a");
        }
        System.out.println(stringBuilder.length());
    }

    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        for (int i = 0; i < 10; i++) {
            new Thread(stringTest).start();
        }
    }

}
