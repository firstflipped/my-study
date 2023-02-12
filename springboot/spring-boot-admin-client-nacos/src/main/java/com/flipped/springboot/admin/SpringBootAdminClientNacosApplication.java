package com.flipped.springboot.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ${DESCRIPTION}
 *
 * @author <a href="#">flipped</a>
 * @version v1.0
 * @since ${YEAR}-${MONTH}-${DAY} ${HOUR}:${MINUTE}:${SECOND}
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootAdminClientNacosApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminClientNacosApplication.class, args);
    }
}