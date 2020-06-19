package com.metatron.threadpool;

import java.util.concurrent.*;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-04 14:03
 * @Description: ${Description}
 */
class Demo implements Callable{

    @Override
    public Object call() throws Exception {
        return "线程"+Thread.currentThread().getName()+"执行";
    }
}

public class ThreadPoolTest1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //线程池对象
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Demo demo = new Demo();

        Future submit = executorService.submit(demo);
        Future submit1 = executorService.submit(demo);
        Object o = submit.get();
        Object o1 = submit1.get();
        System.out.println(o);
        System.out.println(o1);
        executorService.shutdown();
    }
}
