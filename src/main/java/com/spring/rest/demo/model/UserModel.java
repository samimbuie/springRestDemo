package com.spring.rest.demo.model;

public class UserModel {
	
	private String userId;
	private String userName;
	
	public UserModel(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("userId:").append(userId).append("#").append("userName:").append(userName);
		return sb.toString();
	}
}
