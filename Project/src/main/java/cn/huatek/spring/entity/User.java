package cn.huatek.spring.entity;
/**
 * �û�
 * @author Huju
 *
 */
public class User {
	
	private Integer id;
	//����id
	private Integer sid;
	//�û���
	private String username;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", sid=" + sid + ", username=" + username + "]";
	}
	
	
	

	
}
