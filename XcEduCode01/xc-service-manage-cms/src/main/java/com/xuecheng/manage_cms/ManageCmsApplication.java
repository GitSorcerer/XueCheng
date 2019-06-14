package com.xuecheng.manage_cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: GH
 * @Date: 2019/6/13 22:41
 * @Version 1.0
 * @EntityScan("com.xuecheng.framework.domain") 扫描实体类
 * @ComponentScan(basePackages = {"com.xuecheng.api"}) 扫描接口层
 */
@SpringBootApplication
@EntityScan("com.xuecheng.framework.domain")
@ComponentScan(basePackages = {"com.xuecheng.api", "com.xuecheng.manage_cms"})
public class ManageCmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageCmsApplication.class, args);
    }
}
