/**
 * 
 */
package com.chunqiu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.netflix.loadbalancer.IRule;

/**
* @ClassName: MyselfRule
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2019年8月29日
*
*/
@Configuration
public class MyselfRule {

	@Bean
	public IRule myRule () {
//		return new RandomRule(); //Ribbon默认是轮询，这里指定为随机
		return new MyRandomRule(); //这里指定自定义的负载算法
	}
	
}
