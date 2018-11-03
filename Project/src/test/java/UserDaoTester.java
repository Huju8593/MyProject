import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.huatek.spring.mapper.UserMapper;


public class UserDaoTester {


/*	@Test
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
	}*/

	@Test
	public void testFinAllDate() {
		AbstractApplicationContext ac
						=new ClassPathXmlApplicationContext(
								"spring-dao.xml");
		UserMapper userMapper = ac.getBean("userMapper", UserMapper.class);
		List<Map<String, Object>> dates = userMapper.finAllUserBysectionname("ÑÐ·¢²¿");
		for(Map<String, Object> map : dates) {
			System.out.println(map);
			for(String key :map.keySet()) {
				System.out.println(key);
				String username = (String) map.get("username");
				System.out.println(username);
			}
		}
		ac.close();
	}
}
