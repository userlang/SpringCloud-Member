package com.godnan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
/*@EnableHystrix*/
public class SpringCloudMemberApplication {
	// @EnableEurekaClient
	// 将当前服务注册到Eureka上
	public static void main(String[] args) {

		SpringApplication.run(SpringCloudMemberApplication.class, args);
	}

}
