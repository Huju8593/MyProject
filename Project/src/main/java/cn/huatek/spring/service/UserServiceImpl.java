package cn.huatek.spring.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.huatek.spring.entity.Hours;
import cn.huatek.spring.entity.Section;
import cn.huatek.spring.entity.User;
import cn.huatek.spring.mapper.UserMapper;

@Service("userService")
public  class UserServiceImpl implements IUserService {

	@Resource(name = "userMapper")
	private UserMapper userMapper;

	public List<User> finAll() {
		return userMapper.finAll();
	}
	
	public List<Map<String, Object>> finAllDate() {
		return userMapper.finAllDate();
	}
	
	public List<Section> finAllSection() {
		return userMapper.finAllSection();
	}
	
	public List<Map<String,Object>> finAllUserBysectionname(String sectionname) {
		return userMapper.finAllUserBysectionname(sectionname);
	}
	
	
	
	public List<Map<String, Object>> finAllHourByUsername(String username) {
		return userMapper.finAllHourByUsername(username);
	}

	public Integer finAllHourByUsernameSum(String username) {
		return userMapper.finAllHourByUsernameSum(username);
	}
	
	public Integer finAllHourSum() {
		return userMapper.finAllHourSum();
	}
	
	public Hours openShow(Integer id) {
		return userMapper.openShow(id);
	}



	





}
