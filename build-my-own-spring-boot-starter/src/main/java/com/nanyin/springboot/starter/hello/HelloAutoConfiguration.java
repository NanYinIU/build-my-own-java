package com.nanyin.springboot.starter.hello;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 *
 * @author: gaoguoxing
 * @date: 2023/8/4 17:07
 * @version: 1.0
 */
@Configuration
@EnableConfigurationProperties({HelloProperties.class})
public class HelloAutoConfiguration {
    private final HelloProperties helloProperties;

    public HelloAutoConfiguration(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    @Bean
    public HelloService sayHello(){
        HelloService helloService = new HelloService();
        // 设置配置属性
        helloService.setHelloProperties(helloProperties);
        return helloService;
    }

}
