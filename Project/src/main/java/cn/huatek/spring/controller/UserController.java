package cn.huatek.spring.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.huatek.spring.entity.Section;
import cn.huatek.spring.service.IUserService;

@Controller("userController")
public class UserController {
	//1111111111
	@Resource(name = "userService")
	private IUserService userService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String Show() {
		return "hello";
	}
	
	@RequestMapping(value = "/list")
	public String showList(ModelMap modelMap) {
		// 查询出所有部门
		List<Section> sections = userService.finAllSection();
		for (Section section : sections) {
			String sectionname = section.getSectionname();
			// 根据部门名称查询每个部门中对应的员工
			section.setList(userService.finAllUserBysectionname(sectionname));
			List<Map<String, Object>> list = section.getList();
			for (Map<String, Object> map : list) {
				String empname = (String) map.get("empname");
				map.put("list", userService.finAll(empname));
			}
		}
		modelMap.addAttribute("sections", sections);
		return "../list";
		
	}
		
	@RequestMapping(value = "/show")
	public String openShow(ModelMap modelMap, Integer id) {
		return "../show";
	}
	
	
	
}
