package com.metatron.usage;

/**
 * @Author: Metatron
 * @CreateTime: 2020-05-29 17:59
 * @Description:
 *
 *  线程常用方法
 *  start() 启动当前线程
 *  Thread.currentThread() 返回当前线程的对象
 *  Thread.currentThread().getName() 获取当前线程的线程名
 *  Thread.currentThread().setName() 设置当前线程的线程名
 *  join()  在线程a中调用另一个线程b的join方法 ，此时a会进入阻塞状态，会一直执行b这个线程到结束 ，才会执行a这个线程
 *  yield() 释放当前cpu的执行权
 *  stop() 强制结束线程
 *  isAlive() 判断线程是否存存活
 *  Thread.currentThread().getPriority()  获取当前线程的优先级
 *  Thread.currentThread().setPriority(Thread.MAX_PRIORITY) 设置当前线程的优先级
 */
public class Thread2 extends Thread{

    @Override
    public void run() {

        try {
            sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("jajajaj") ;
        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i < 99; i+=2) {
            System.out.println(i);
        }
    }

    //构造方法设置线程名
    public Thread2(String name){
        super(name);
    }

    public Thread2(){
        super();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread2 threadTest1 = new Thread2("faaaf");
        threadTest1.start();
        System.out.println(Thread.currentThread().getPriority( ));
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());
        for (int i = 0; i < 100; i+=2) {
            System.out.println(i+"-------------");
            if(i==22){
                  // 让 threadTest1 这个线程加入进来，一直到他结束。才继续执行for循环
                  threadTest1.join();
                 //Thread.currentThread().stop();

            }
        }

        Thread.currentThread().setName("主线程");
        System.out.println(Thread.currentThread().getName());
        System.out.println(threadTest1.isAlive());
    }
}
