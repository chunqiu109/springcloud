/**
 * 
 */
package com.chunqiu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
* @ClassName: EurekaServer7001_App
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2019年8月28日
*
*/
@SpringBootApplication
@EnableEurekaServer //EuerkaServer服务器端启动类，接受其他微服务注册进来
public class EurekaServer7003_App {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args    参数
	* @return void    返回类型
	* @throws
	*/
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7003_App.class, args);
	}

}
