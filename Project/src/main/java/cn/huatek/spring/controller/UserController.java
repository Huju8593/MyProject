package cn.huatek.spring.controller;

import cn.huatek.spring.entity.Project;
import cn.huatek.spring.entity.Time;
import cn.huatek.spring.entity.User;
import cn.huatek.spring.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller("userController")
public class UserController {

	@Resource(name = "userService")
	private IUserService userService;

	@RequestMapping(value = "/show.do", method = RequestMethod.GET)
	public String Show() {
		return "user/show";
	}

	@RequestMapping(value = "/list_user.do")
	public String showListUser(ModelMap modelMap) {
		// ????????งา?
		List<User> users = userService.finAllUser();
		List<Project> projects = userService.finAllProject();
		List<Time> times = userService.finAllTime();
		List<Map<String, Object>> maps = userService.findPersonHour();
		// ???????,??????
		modelMap.addAttribute("users", users);
		modelMap.addAttribute("projects", projects);
		modelMap.addAttribute("times", times);
		modelMap.addAttribute("maps", maps);
		// ??????
		return "../list2";
	}

}
