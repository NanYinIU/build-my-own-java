package com.nanyin.springboot.starter.hello;

/**
 * Description:
 *
 * @author: gaoguoxing
 * @date: 2023/8/4 17:09
 * @version: 1.0
 */
public class HelloService {
    HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    // 方法调用验证属性是否其作用。也就是自动配置是否生效
    public String sayHello(){
        return helloProperties.getPrefix() + " hello world !";
    }
}
