package cn.huatek.spring.service;

import java.util.List;
import java.util.Map;

import cn.huatek.spring.entity.Project;
import cn.huatek.spring.entity.Time;
import cn.huatek.spring.entity.User;

public interface IUserService {

	/**
	 * 查询所有用户信息
	 * 
	 * @return 
	 */
	List<User> finAllUser();
	
	/**
	 * 查询所有部门
	 * @return
	 */
	List<Project> finAllProject();
	
	/**
	 * 查询所有工作日期
	 * @return
	 */
	
	List<Time> finAllTime();
	
	/**
	 * 查询每个部门中每个人一周的每天工作时间 
	 * @return
	 */
	List<Map<String,Object>> findPersonHour(); 

}
