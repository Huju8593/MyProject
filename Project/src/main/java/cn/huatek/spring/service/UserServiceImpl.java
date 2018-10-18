package cn.huatek.spring.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.huatek.spring.entity.Project;
import cn.huatek.spring.entity.Time;
import cn.huatek.spring.entity.User;
import cn.huatek.spring.mapper.UserMapper;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource(name = "userMapper")
	private UserMapper userMapper;

	public List<User> finAllUser() {
		return userMapper.finAllUser();
	}

	public List<Project> finAllProject() {
		return userMapper.finAllProject();
	}

	public List<Time> finAllTime() {
		return userMapper.finAllTime();
	}

	public List<Map<String, Object>> findPersonHour() {
		return userMapper.findPersonHour();
	}
}
