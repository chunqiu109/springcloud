/**
 * 
 */
package com.chunqiu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: DeptProvider8001_App
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @date 2019年8月28日
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.chunqiu.springcloud"})
@ComponentScan("com.chunqiu.springcloud")
public class DeptConsumer80_Feign_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_Feign_App.class, args);
	}
}
