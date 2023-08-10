package com.nanyin.springboot.hippo4j.nacos;

import cn.hippo4j.core.enable.EnableDynamicThreadPool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamicThreadPool
public class BuildMyOwnSpringBootHippo4jNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuildMyOwnSpringBootHippo4jNacosApplication.class, args);
    }

}
