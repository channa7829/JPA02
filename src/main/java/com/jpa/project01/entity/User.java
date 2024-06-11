package com.jpa.project01.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "User_Info")
public class User{
	
	@Id
	private int userId;
	
	private String userName;
	
	private String userLocattaion;
	
	private int userage;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserLocattaion() {
		return userLocattaion;
	}

	public void setUserLocattaion(String userLocattaion) {
		this.userLocattaion = userLocattaion;
	}

	public int getUserage() {
		return userage;
	}

	public void setUserage(int userage) {
		this.userage = userage;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userLocattaion=" + userLocattaion + ", userage="
				+ userage + "]";
	}

	public User(int userId, String userName, String userLocattaion, int userage) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userLocattaion = userLocattaion;
		this.userage = userage;
	}

	public User() {
		
	}

	
}
