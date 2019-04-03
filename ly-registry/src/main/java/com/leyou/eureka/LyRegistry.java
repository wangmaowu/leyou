package com.leyou.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author the one
 * @create 2019-01-17 10:52
 */
@SpringBootApplication
@EnableEurekaServer
public class LyRegistry {

    public static void main(String[] args) {
        SpringApplication.run(LyRegistry.class);
    }
}
