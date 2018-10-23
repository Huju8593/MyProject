package cn.huatek.spring.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.huatek.spring.entity.Hours;
import cn.huatek.spring.entity.Section;
import cn.huatek.spring.entity.User;
import cn.huatek.spring.service.IUserService;

@Controller("userController")
public class UserController {
	@Resource(name = "userService")
	private IUserService userService;

	@RequestMapping(value = "/show.do", method = RequestMethod.GET)
	public String Show() {
		return "user/show";
	}

	@RequestMapping(value = "/list_user.do")
	public String showList(ModelMap modelMap) {
/*		int ms = userService.changeHour().intValue();
		int hour=ms/3600;
		String s = String.valueOf(hour);
		Hours h=new Hours();
		h.setHour(s);*/
		List<User> userlist = userService.finAll();
		int size = userlist.size();
		List<Map<String, Object>> dates = userService.finAllDate();
		// 查询出所有部门
		List<Section> sections = userService.finAllSection();
		for (Section section : sections) {
			String sectionname = section.getSectionname();
			// 根据部门名称查询每个部门中对应的员工
			section.setList(userService.finAllUserBysectionname(sectionname));
			List<Map<String, Object>> list = section.getList();
			for (Map<String, Object> map : list) {
				String username = (String) map.get("username");
				map.put("hours", userService.finAllHourByUsername(username));
				map.put("sums", userService.finAllHourByUsernameSum(username).intValue());
			}
// Section [id=1, sectionname=研发部, list=[{sectionname=研发部, username=张三}, {sectionname=研发部, username=王五}]]
// Section [id=2, sectionname=设计部, list=[{sectionname=设计部, username=李四}]]
		}
		int sum = userService.finAllHourSum().intValue();

		modelMap.addAttribute("size", size);
		modelMap.addAttribute("dates", dates);
		modelMap.addAttribute("sections", sections);
		modelMap.addAttribute("sum", sum);
		return "../list";
	}

	@RequestMapping(value = "/open.do")
	public String openShow(ModelMap modelMap, Integer id) {
		Hours h = userService.openShow(id);
		modelMap.addAttribute("h", h);
		return "../hello";
	}

}
