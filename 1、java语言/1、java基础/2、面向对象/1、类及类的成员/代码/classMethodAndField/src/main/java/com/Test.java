package com;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-24 10:20
 * @Description: ${Description}
 */
public class Test {

     @org.junit.Test
     public void test(){
         Bank instance = Bank.getInstance();
         Bank instance1 = Bank.getInstance();
         System.out.println(instance == instance1);

         Order instance2 = Order.getInstance();
         Order instance3 = Order.getInstance();
         System.out.println(instance2 == instance3);
     }

}



//饿汉式实现
class Bank{
    private Bank(){}
    //必须声明为静态属性
    private static Bank bank = new Bank();

    //必须声明为静态方法  不然需要new 对象来调用
    public static Bank getInstance(){
        return bank;
    }
}

//lanhan
class Order{
    private Order(){}

    private static Order order;

    public synchronized static Order getInstance (){
        if(Order.order == null){
            return new Order();
        }
        return Order.order;
    }
}