package jdbc;

import java.io.Serializable;

public class Person implements Serializable {
	private String id;
	private String username;
	private String sex;
	private String address;
	private String phone;
	
	public Person() {
		super();
	}
	
	public Person(String id, String username, String sex, String address, String phone) {
		super();
		this.id = id;
		this.username = username;
		this.sex = sex;
		this.address = address;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", username=" + username + ", sex=" + sex
	                     + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	
}
