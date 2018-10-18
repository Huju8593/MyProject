package cn.huatek.spring.mapper;

import java.util.List;
import java.util.Map;

import cn.huatek.spring.entity.Section;

public interface UserMapper {

	
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
	List<Map<String,Object>> finAllHourByUsername(); 
	
	
}
