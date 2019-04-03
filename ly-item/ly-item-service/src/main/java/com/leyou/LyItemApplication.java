package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author the one
 * @create 2019-01-17 15:06
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.leyou.item.mapper") // 扫描mapper包
public class LyItemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LyItemApplication.class);
    }
}
