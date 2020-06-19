package com.metatron;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author: Metatron
 * @CreateTime: 2020-06-10 15:36
 * @Description:
 *
 * 测试泛型方法
 *
 */
public class GenericityMethod {

    public <E,b> List<E> test(E[] a,b b){

        ArrayList<E> es = new ArrayList<>();
        for (E e:a) {
            System.out.println(a.getClass());
            es.add(e);
        }
        return es;
    }

    public static void main(String[] args) {
        GenericityMethod genericityMethod = new GenericityMethod();
        Integer [] a = { 1,3 ,3};

        System.out.println(genericityMethod.test(a));

    }

}
