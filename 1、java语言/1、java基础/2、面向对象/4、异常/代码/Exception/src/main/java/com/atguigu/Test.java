package com.atguigu;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-29 16:38
 * @Description: ${Description}
 */
public class Test {

    public static void main(String[] args) {

        try {
            System.out.println(new int[]{1,23,12,3}[4]);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){

        }
        System.out.println(1111);

    }
}
