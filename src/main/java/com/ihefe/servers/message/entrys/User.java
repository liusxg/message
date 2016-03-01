package com.ihefe.servers.message.entrys;

/**
 * 用户类
 * @author liuxiaogang
 * @Date 2016年2月29日
 */
public class User {

	private Long id;

	private String name;

	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
