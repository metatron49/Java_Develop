package com.metatron.threadpool;

import java.util.concurrent.*;

/**
 * @Author: Metatron
 * @CreateTime: 2020-06-03 17:16
 * @Description:
 * 创建线程池
 *
 *
 *
 */

class Num implements Callable<String>{

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i+=2) {
            sum += i;
        }
        return sum + "";
    }
}

public class ThreadPoolTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 使用Executors 工具类构造线程池 ,线程池对象是ExecutorService接口 的实现类
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;

        //使用submit 方法把线程放入线程并启动线程，返回Future对象
        Future<String> submit = threadPoolExecutor.submit(new Num());
        Future<String> submit2 = threadPoolExecutor.submit(new Num());

        String s = submit.get();
        String s1 = submit2.get();
        System.out.println(s);
        System.out.println(s1);
        threadPoolExecutor.shutdown();
    }

}
