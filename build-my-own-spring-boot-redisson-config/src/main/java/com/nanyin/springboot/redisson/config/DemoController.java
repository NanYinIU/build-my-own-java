package com.nanyin.springboot.redisson.config;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    RedissonClient client;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        RLock locKey = client.getLock("lock_key");
        try {
            boolean b = locKey.tryLock();
            if (!b) {
                return "did not get lock..";
            }
            Thread.sleep(10000L);
        } catch (Exception e) {
            return "error";
        }finally {
            if (locKey != null) {
                locKey.unlock();
            }
        }
        return "success get lock";
    }
}
