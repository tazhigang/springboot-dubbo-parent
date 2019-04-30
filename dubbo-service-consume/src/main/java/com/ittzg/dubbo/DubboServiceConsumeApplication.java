package com.ittzg.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @email: tazhigang095@163.com
 * @author: ittzg
 * @date: 2019/4/25 23:33
 * @describe:
 */
@SpringBootApplication
@ImportResource({"classpath:dubbo-consumer.xml"})
public class DubboServiceConsumeApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboServiceConsumeApplication.class,args);
    }
}
