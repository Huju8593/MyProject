package cn.huatek.spring.entity;

import java.util.List;
import java.util.Map;

/**
 * 部门
 * @author Huju
 *
 */
public class Section {
	
	private Integer id;
	//部门名
	private String sectionname;
	
	private List<Map<String,Object>> list;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Map<String, Object>> getList() {
		return list;
	}
	public void setList(List<Map<String, Object>> list) {
		this.list = list;
	}
	public String getSectionname() {
		return sectionname;
	}
	public void setSectionname(String sectionname) {
		this.sectionname = sectionname;
	}
	
	@Override
	public String toString() {
		return "Section [id=" + id + ", sectionname=" + sectionname + ", list=" + list + "]";
	}
	
	
}
