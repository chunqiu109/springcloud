/**
 * 
 */
package com.chunqiu.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.chunqiu.springcloud.entities.Dept;

/**
 * @ClassName: DeptDao
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @date 2019年8月28日
 *
 */

@Mapper
public interface DeptDao {

	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();

}
