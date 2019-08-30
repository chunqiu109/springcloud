/**
 * 
 */
package com.chunqiu.myrule;

import java.util.List;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

/**
* @ClassName: MyselfRule
* @Description: TODO
	自定义一个轮询算法
	需求：仍旧使用轮询，但是每次轮询服务5次
* @author Administrator
* @date 2019年8月29日
*
*/

public class MyRandomRule extends AbstractLoadBalancerRule{

	private int total = 0;  //定义一个计算轮询服务次数的计数器
	private int index = 0;  //定义一个服务的机器号
	
	public Server choose(ILoadBalancer lb, Object key){
		
		if (lb == null) {
			return null;
		}
		
		Server server =null;

		while (server ==null) {
			
			if (Thread.interrupted()) {//线程是否中断
				return null;
			}
			
			List<Server> uplist = lb.getReachableServers();
			List<Server> alist = lb.getAllServers();
			
			int serverCount = alist.size();
			
			if (serverCount == 0) {
				return null;
			}
			
			if (total < 5) {
				server = alist.get(index);
				total++;
			}else {
				total = 0;
				index ++;
				if (index >= alist.size()) {
					index = 0;
				}
			}
			
			if (server == null) {
				Thread.yield();
				continue;
			}
			
			if (server.isAlive()) {
				return server;
			}
			
			server =null;
			Thread.yield();
		}
		
		return server;
		
	}
	
	@Override
	public Server choose(Object key) {
		return choose(getLoadBalancer(), key);
	}

	@Override
	public void initWithNiwsConfig(IClientConfig clientConfig) {
		// TODO Auto-generated method stub
		
	}

	
}
