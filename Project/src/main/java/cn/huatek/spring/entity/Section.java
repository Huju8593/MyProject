package cn.huatek.spring.entity;
/**
 * ����
 * @author Huju
 *
 */
public class Section {
	
	private Integer id;
	//������
	private String sectionname;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSectionname() {
		return sectionname;
	}
	public void setSectionname(String sectionname) {
		this.sectionname = sectionname;
	}
	@Override
	public String toString() {
		return "Section [id=" + id + ", sectionname=" + sectionname + "]";
	}
	
	
}
