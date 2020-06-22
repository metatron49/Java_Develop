package com.atguigu;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-22 14:19
 * @Description: ${Description}
 */
public class Test  {

    public static void main(String[] args) {
        Test test = new Test();
        test.test( );
    }

    public void test(String ... strs){

        System.out.println(strs.getClass());


    }
}
