package cn.huatek.spring.service.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.huatek.spring.entity.Section;
import cn.huatek.spring.mapper.UserMapper;
import cn.huatek.spring.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource(name = "userMapper")
	private UserMapper userMapper;



	public List<Section> finAllSection() {
		return userMapper.finAllSection();
	}

	public List<Map<String, Object>> finAllUserBysectionname(String sectionname) {
		List<Map<String, Object>> list = userMapper.finAllUserBysectionname(sectionname);
		return list;
	}

	public List<Map<String, Object>> finAll(String empname) {
		return userMapper.finAll(empname);
	}




}
