package com.nanyin.springboot.redisson.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(RedissonConfig.class);
    @Autowired
    RedissonProperties redisProperties;
    @Bean(name = "redissonClient")
    public RedissonClient redisson()
    {
        LOGGER.info("Redisson Configuration loaded!");

        final Config config = new Config();
        config.useSingleServer()
                .setAddress(redisProperties.getAddresses())
                .setPassword(redisProperties.getPassword())
                .setDatabase(redisProperties.getDataBase());
        return Redisson.create(config);
    }
}
