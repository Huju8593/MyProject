package cn.huatek.spring.service;

import java.util.List;
import java.util.Map;

import cn.huatek.spring.entity.Section;

public interface IUserService {

	
	
	
	/**
	 * ��ѯ���еĲ���
	 * @return
	 */
	List<Section> finAllSection(); 
	
	/**
	 * ���ݲ������Ʋ�ѯÿ�������ж�Ӧ���û� 
	 * @return
	 */
	List<Map<String,Object>> finAllUserBysectionname(String sectionname); 
	
	
	List<Map<String,Object>> finAll(String empname);

	
}
