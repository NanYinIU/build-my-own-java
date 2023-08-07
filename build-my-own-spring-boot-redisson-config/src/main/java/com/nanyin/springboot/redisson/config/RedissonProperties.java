package com.nanyin.springboot.redisson.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "redisson")
@Component
@Getter
@Setter
public class RedissonProperties {
    private String addresses;
    private String password;

    private int dataBase;
}
