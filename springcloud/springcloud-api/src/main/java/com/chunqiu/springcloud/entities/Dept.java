/**
 * 
 */
package com.chunqiu.springcloud.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @ClassName: Dept
 * @Description: TODO 部门实体类
 * @author Administrator
 * @date 2019年8月28日
 *
 */
@SuppressWarnings("serial")
@NoArgsConstructor // 无参数构造方法（就算再添加有参的构造方法，无法构造也不会丢失）
@Data //可以自动生成get和set方法
@Accessors(chain = true) //chain 若为true，则setter方法返回当前对象
public class Dept implements Serializable {

	private Long deptno; // 主键
	private String dname; // 部门名称
	private String db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

	public Dept(String dname) {
		super();
		this.dname = dname;
	}

}
