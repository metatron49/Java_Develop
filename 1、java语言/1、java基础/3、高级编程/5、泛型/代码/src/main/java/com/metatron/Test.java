package com.metatron;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-10 11:43
 * @Description: ${Description}
 */
public class Test{

    public static void main(String[] args) {

        GenerictiyClass<String> stringUser = new GenerictiyClass<String>();
        stringUser.a("1");

        GenerictiyClass stringUser1 = new GenerictiyClass();
        stringUser1.a(1);
    }
}
