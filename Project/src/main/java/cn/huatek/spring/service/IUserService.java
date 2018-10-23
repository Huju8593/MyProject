package cn.huatek.spring.service;

import java.util.List;
import java.util.Map;

import cn.huatek.spring.entity.Hours;
import cn.huatek.spring.entity.Section;
import cn.huatek.spring.entity.User;

public interface IUserService {

	
	List<User> finAll();
	
	/**
	   * 查询出星期和日期对应关系
	 * @return
	 */
	List<Map<String,Object>> finAllDate(); 	
	
	/**
	 * 查询所有的部门
	 * @return
	 */
	List<Section> finAllSection(); 
	
	/**
	 * 根据部门名称查询每个部门中对应的用户 
	 * @return
	 */
	List<Map<String,Object>> finAllUserBysectionname(String sectionname); 
	
	
	
	/**
	   * 根据用户名查询出个人一个月每天的上班时间
	 * @return
	 */
	List<Map<String, Object>> finAllHourByUsername(String username); 
	
	/**
	 * 根据用户名查询每个人一个月的总工作时间
	 * @param username
	 * @return
	 */
	Integer finAllHourByUsernameSum(String username);
	
	/**
	 * 全部人数的总工作时间
	 * @return
	 */
	Integer finAllHourSum();
	
	Integer changeHour();
	
	Hours openShow(Integer id);
}
