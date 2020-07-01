package com.atguigu.exer;

import com.atguigu.java.Person;

import javax.sound.midi.Soundbank;

/**
 * 一道面试题
 * @author shkstart
 * @create 2019 上午 11:32
 */
public class StringTest {

    String str = new String("good");
    int a = 10;
    char[] ch = { 't', 'e', 's', 't' };

    public void change(String str, char ch[] ,int a) {
        str = "test ok";
        ch[0] = 'b';
        a = 11;
    }
    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str,ex.ch,ex.a);
        System.out.println(ex.str);//
        System.out.println(ex.ch);//
        System.out.println(ex.a);
    }
}

