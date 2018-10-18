package cn.huatek.spring.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.huatek.spring.entity.Section;
import cn.huatek.spring.entity.User;
import cn.huatek.spring.service.IUserService;

@Controller("userController")
public class UserController {
//wqewqe
	@Resource(name = "userService")
	private IUserService userService;

	@RequestMapping(value = "/show.do", method = RequestMethod.GET)
	public String Show() {
		return "user/show";
	}

	@RequestMapping(value = "/list_user.do")
	public String showListUser(ModelMap modelMap,String sectionname) {
		System.out.println(sectionname);
		List<Map<String, Object>> users = userService.finAllHourByUsername();
		List<Map<String, Object>> dates = userService.finAllDate();
		List<Section> sections = userService.finAllSection();
		List<Map<String, Object>> maps1 = userService.finAllUserBysectionname(sectionname);
		modelMap.addAttribute("users", users);
		modelMap.addAttribute("dates", dates);
		modelMap.addAttribute("sections", sections);
		modelMap.addAttribute("maps1", maps1);
		System.out.println(maps1);
		return "../list3";
	}

}
