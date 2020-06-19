package com.metatron;

import java.util.*;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-10 16:04
 * @Description: ${Description}
 */
public class Wildcard<T extends List> {

    public void test(T t){
        System.out.println(t);
    }


    public static void main(String[] args) {

        Wildcard<ArrayList> abstractListWildcard = new Wildcard<>();

        abstractListWildcard.test(new ArrayList());

    }
}
