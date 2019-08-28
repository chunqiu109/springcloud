/**
 * 
 */
package com.chunqiu.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 
* @Description: TODO resttemplate
* @Configuration注解用来定义配置类，可以替换xml文件，被注解的类内部包含一个或者多个的@bean注解的方法，
* 用于构建bean定义，初始化spring容器。@Configuration相当于原始的xml文件中的<beans>标签，而@bean注解
* 相当于<bean>标签。
* @author Administrator
* @date 2019年8月28日
*
 */
@Configuration
public class ConfigBean {

	@Bean
	public RestTemplate geTemplate() {
		return new RestTemplate();
	}
	
}
