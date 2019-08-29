/**
 * 
 */
package com.chunqiu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: DeptProvider8001_App
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @date 2019年8月28日
 *
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注入到服务端
public class DeptProvider8003_App {

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param @param args
	 *         参数 @return void 返回类型 @throws
	 */
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8003_App.class, args);
	}
}
