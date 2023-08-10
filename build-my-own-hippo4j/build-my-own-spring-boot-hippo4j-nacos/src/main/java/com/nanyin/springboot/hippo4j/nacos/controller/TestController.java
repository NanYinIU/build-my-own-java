package com.nanyin.springboot.hippo4j.nacos.controller;

import cn.hippo4j.core.executor.DynamicThreadPoolExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Description:
 *
 * @author: gaoguoxing
 * @date: 2023/8/9 16:44
 * @version: 1.0
 */
@RestController
public class TestController {

    @Autowired
    @Qualifier("messageConsumeTtlDynamicThreadPool")
    Executor customExecutor;

    @GetMapping("/test")
    public String test() {
        customExecutor.execute(new MyOwnThread());
        DynamicThreadPoolExecutor threadPoolExecutor = (DynamicThreadPoolExecutor) customExecutor;
        System.out.println("threadPool ActiveCount:" + threadPoolExecutor.getActiveCount() +
                " threadPool CompletedTaskCount:" + threadPoolExecutor.getCompletedTaskCount() +
                " threadPool size:" + threadPoolExecutor.getCorePoolSize()
                + " threadPool max size:" + threadPoolExecutor.getMaximumPoolSize());
        System.out.println("threadPoolExecutor.getQueue().size():" + threadPoolExecutor.getQueue().size()
                + " threadPool Id:" + threadPoolExecutor.getThreadPoolId());
        return "test";
    }

    static class MyOwnThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+": test");
        }
    }

}
