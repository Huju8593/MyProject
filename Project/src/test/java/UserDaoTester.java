import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.huatek.spring.entity.Project;
import cn.huatek.spring.entity.Time;
import cn.huatek.spring.entity.User;
import cn.huatek.spring.mapper.UserMapper;


public class UserDaoTester {


	@Test
	public void testFindAllUser() {
		AbstractApplicationContext ac
						=new ClassPathXmlApplicationContext(
								"spring-dao.xml");
		UserMapper userMapper = ac.getBean("userMapper", UserMapper.class);
		List<User> users = userMapper.finAllUser();
		for (User user : users) {
			System.out.println(user);
		}
		ac.close();
	}

/*	@Test
	public void testFinAllProject() {
		AbstractApplicationContext ac
						=new ClassPathXmlApplicationContext(
								"spring-dao.xml");
		UserMapper userMapper = ac.getBean("userMapper", UserMapper.class);
		List<Project> projects = userMapper.finAllProject();
		for (Project project : projects) {
			System.out.println(project);
		}
		ac.close();
	}

	@Test
	public void testFinAllTime() {
		AbstractApplicationContext ac
						=new ClassPathXmlApplicationContext(
								"spring-dao.xml");
		UserMapper userMapper = ac.getBean("userMapper", UserMapper.class);
		List<Time> times = userMapper.finAllTime();
		for (Time time : times) {
			System.out.println(time);
		}
		ac.close();
	}
	
	@Test
	public void testFindAllTime() {
		AbstractApplicationContext ac
						=new ClassPathXmlApplicationContext(
								"spring-dao.xml");
		UserMapper userMapper = ac.getBean("userMapper", UserMapper.class);
		List<Map<String, Object>> maps = userMapper.findPersonHour();
		for(Map map : maps) {
			System.out.println(map);
		}
		ac.close();
	}*/
}
