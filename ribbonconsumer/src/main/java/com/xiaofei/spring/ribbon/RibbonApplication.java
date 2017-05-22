package com.xiaofei.spring.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 创建RestTemplate实例，并通过@LoadBalanced注解开启均衡负载能力。
 * @EnableCircuitBreaker注解开启断路器功能
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/5/19 0019 ProjectName: spring-cloud-tets
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class RibbonApplication {

    /**
     * LoadBalanced用做负载
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate instance(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class,args);
    }

}
