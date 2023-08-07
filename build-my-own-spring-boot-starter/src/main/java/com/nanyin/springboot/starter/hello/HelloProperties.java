package com.nanyin.springboot.starter.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Description:
 *
 * @author: gaoguoxing
 * @date: 2023/8/4 17:08
 * @version: 1.0
 */
@ConfigurationProperties(prefix = "spring.hello")
public class HelloProperties {
    private String prefix ;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
