package com.metatron;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-10 11:44
 * @Description:
 *
 * 测试泛型方法
 *
 */
public class GenerictiyClass<S> {

    private String a ;

    public void a (S e){
        System.out.println(e);
    }

    public static void main(String[] args) {
        GenerictiyClass<String> stringUser = new GenerictiyClass<String>();
        stringUser.a("1");

        GenerictiyClass stringUser1 = new GenerictiyClass();
        stringUser1.a(1);
    }
}

