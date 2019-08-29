/**
 * 
 */
package com.chunqiu.springcloud.service;

import java.util.List;

import com.chunqiu.springcloud.entities.Dept;

/**
 * @ClassName: DeptService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @date 2019年8月28日
 *
 */
public interface DeptService {

	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();

}
