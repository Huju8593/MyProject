package cn.huatek.spring.mapper;

import java.util.List;
import java.util.Map;

import cn.huatek.spring.entity.Section;

public interface UserMapper {

	
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
	List<Map<String,Object>> finAllHourByUsername(); 
	
	
}
