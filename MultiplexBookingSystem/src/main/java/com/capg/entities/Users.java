package com.capg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="userid")
private int userId;
@Column(name="username")
private String userName;
@Column(name="usertype")
private String userType;
@Column(name="mobile")
private int mobile;
@Column(name="email")
private String email;

public Users() {
	super();
}
public Users(int userId, String userName, String userType, int mobile, String email) {
	
	this.userId = userId;
	this.userName = userName;
	this.userType = userType;
	this.mobile = mobile;
	this.email = email;
}
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
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
public int getMobile() {
	return mobile;
}
public void setMobile(int mobile) {
	this.mobile = mobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Users [userId=" + userId + ", userName=" + userName + ", userType=" + userType + ", mobile=" + mobile
			+ ", email=" + email + "]";
}

}
