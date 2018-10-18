package cn.huatek.spring.entity;

public class Time {
	
	private Integer id;
	
	//星期
	private String week;
	
	//日期
	private String date;
	
	//工作时间
	private String hour;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	@Override
	public String toString() {
		return "Time [id=" + id + ", week=" + week + ", date=" + date + ", hour=" + hour + "]";
	}

	
	
	
	
}
