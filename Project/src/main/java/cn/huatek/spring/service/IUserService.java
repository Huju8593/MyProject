package cn.huatek.spring.service;

import java.util.List;
import java.util.Map;

import cn.huatek.spring.entity.Section;

public interface IUserService {

	
	
	
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
	
	
	List<Map<String,Object>> finAll(String empname);

	
}
