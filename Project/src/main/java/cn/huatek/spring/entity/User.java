package cn.huatek.spring.entity;

public class User {
	
	private Integer id;
	//����id
	private Integer pid;
	//�û���
	private String username;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", pid=" + pid + ", username=" + username + "]";
	}

	

	
}
