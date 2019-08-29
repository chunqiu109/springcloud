/**
 * 
 */
package com.chunqiu.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chunqiu.springcloud.dao.DeptDao;
import com.chunqiu.springcloud.entities.Dept;
import com.chunqiu.springcloud.service.DeptService;

/**
* @ClassName: DeptServiceImpl
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2019年8月28日
*
*/
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept) {
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Dept> list() {
		return dao.findAll();
	}

}
