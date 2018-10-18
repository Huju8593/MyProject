package cn.huatek.spring.service;

import java.util.List;
import java.util.Map;

import cn.huatek.spring.entity.Project;
import cn.huatek.spring.entity.Time;
import cn.huatek.spring.entity.User;

public interface IUserService {

	/**
	 * ��ѯ�����û���Ϣ
	 * 
	 * @return 
	 */
	List<User> finAllUser();
	
	/**
	 * ��ѯ���в���
	 * @return
	 */
	List<Project> finAllProject();
	
	/**
	 * ��ѯ���й�������
	 * @return
	 */
	
	List<Time> finAllTime();
	
	/**
	 * ��ѯÿ��������ÿ����һ�ܵ�ÿ�칤��ʱ�� 
	 * @return
	 */
	List<Map<String,Object>> findPersonHour(); 

}
