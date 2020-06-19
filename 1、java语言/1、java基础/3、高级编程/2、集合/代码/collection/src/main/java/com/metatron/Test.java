package com.metatron;

import java.util.*;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-05 15:42
 * @Description: ${Description}
 */
public class Test {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();
        Collection<String> collection1 = new ArrayList<String>();
        collection.add("a");
        collection.add("b");
        collection.add("c");

        collection1.add("a");
        collection1.add("b");
        collection1.add("c");

        Map map = new HashMap();
        //取两个集合的交集
        collection.retainAll(collection1);
        System.out.println(collection);
        System.out.println(collection.equals(collection1));

        //没执行一次 iterator 方法都会生成一个新的迭代器对象
        Iterator<String> iterator = collection.iterator();

        // next 指针下移  hasNext 指针不下移
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
