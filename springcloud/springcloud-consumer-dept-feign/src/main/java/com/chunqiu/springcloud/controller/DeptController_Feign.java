/**
 * 
 */
package com.chunqiu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.chunqiu.springcloud.entities.Dept;
import com.chunqiu.springcloud.service.DeptClientService;

/**
 * @ClassName: DeptController_Consumer
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @date 2019年8月28日
 *
 */

@RestController
public class DeptController_Feign {

//	private static final String REST_URL_PREFIX = "http://localhost:8001";

	// 在配置类restTemplate中加入了注解@LoadBalanced之后，restTemplate调用的url的时候
	// 不能直接访问地址，需要把地址改成你所调用的url在eureka上注册的application.name
	private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-DEPT";

//	@Autowired
//	private RestTemplate restTemplate;

	@Autowired
	private DeptClientService service = null;

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return this.service.get(id);
	}

	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list() {
		return this.service.list();
	}

	@RequestMapping(value = "/consumer/dept/add")
	public Object add(Dept dept) {
		return this.service.add(dept);
	}

}
