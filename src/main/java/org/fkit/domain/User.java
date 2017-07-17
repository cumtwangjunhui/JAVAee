package org.fkit.domain;

public class  User{
	public int id;
	private String username; // 登录名
	private String loginnumber; // 用户名
	private String password; // 密码
	private String email;//
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String newpwd;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLoginnumber() {
		return loginnumber;
	}
	public void setLoginnumber(String loginnumber) {
		this.loginnumber = loginnumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String phone; // 电话
	private String address; // 地址
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", loginnumber=" + loginnumber + ", password=" + password
				+ ", phone=" + phone + ", address=" + address + "]";
	}
	public String getNewpwd() {
		return newpwd;
	}
	public void setNewpwd(String newpwd) {
		this.newpwd = newpwd;
	}

}
