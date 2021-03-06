package com.wenren.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-05-07-16:09
 */
//多environment下关闭，不然会在服务器启动时默认加载Top Level的RabbitMQ配置，会报错，但不影响会使用。
@SpringBootApplication(exclude = {RabbitAutoConfiguration.class})
public class StreamMQMain8801 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8801.class, args);
    }
}
