

package com.iscas.cloud.quickframe.deamon.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 分布式任务调度模块
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DaemonApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaemonApplication.class, args);
    }

}
