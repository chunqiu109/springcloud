/**
 * 
 */
package com.chunqiu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.chunqiu.myrule.MyselfRule;

/**
 * @ClassName: DeptProvider8001_App
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @date 2019年8月28日
 *
 */
@SpringBootApplication
@EnableEurekaClient
//在启动微服务的时候就会去加载我们自定义的Ribbon配置类，从而使配置生效
//@RibbonClient(name = "SPRINGCLOUD-DEPT",configuration = MyselfRule.class)
@RibbonClient(name="SPRINGCLOUD-DEPT",configuration=MyselfRule.class)
public class DeptConsumer80_App {

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param @param args
	 *         参数 @return void 返回类型 @throws
	 */
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_App.class, args);
	}
}
