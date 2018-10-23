package cn.huatek.spring.service;

import java.util.List;
import java.util.Map;

import cn.huatek.spring.entity.Hours;
import cn.huatek.spring.entity.Section;
import cn.huatek.spring.entity.User;

public interface IUserService {

	
	List<User> finAll();
	
	/**
	   * ��ѯ�����ں����ڶ�Ӧ��ϵ
	 * @return
	 */
	List<Map<String,Object>> finAllDate(); 	
	
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
	
	
	
	/**
	   * �����û�����ѯ������һ����ÿ����ϰ�ʱ��
	 * @return
	 */
	List<Map<String, Object>> finAllHourByUsername(String username); 
	
	/**
	 * �����û�����ѯÿ����һ���µ��ܹ���ʱ��
	 * @param username
	 * @return
	 */
	Integer finAllHourByUsernameSum(String username);
	
	/**
	 * ȫ���������ܹ���ʱ��
	 * @return
	 */
	Integer finAllHourSum();
	
	Integer changeHour();
	
	Hours openShow(Integer id);
}
