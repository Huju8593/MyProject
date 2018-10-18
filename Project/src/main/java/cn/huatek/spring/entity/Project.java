package cn.huatek.spring.entity;

public class Project {
	
	private Integer id;
	//≤ø√≈
	private String section;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", section=" + section + "]";
	}
	
	
}
