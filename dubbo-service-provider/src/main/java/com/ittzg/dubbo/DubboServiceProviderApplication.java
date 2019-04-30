package com.ittzg.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @email: tazhigang095@163.com
 * @author: ittzg
 * @date: 2019/4/25 22:54
 * @describe:
 */
@SpringBootApplication
@ImportResource({"classpath:dubbo-provider.xml"})
public class DubboServiceProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboServiceProviderApplication.class,args);
    }
}
