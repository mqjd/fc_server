package com.api.model;
// Generated 2018-8-1 22:30:02 by Hibernate Tools 5.0.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

import com.base.framework.model.BaseModel;

/**
 * SysUser generated by hbm2java
 */
@Entity
@Table(name = "sys_user", catalog = "mm")
public class SysUser extends BaseModel{

	private static final long serialVersionUID = 1515309430958336586L;
	private Integer userId;
	private String userCode;
	private String userName;
	private String comments;

	public SysUser() {
	}

	public SysUser(String userName) {
		this.userName = userName;
	}

	public SysUser(String userCode, String userName, String comments) {
		this.userCode = userCode;
		this.userName = userName;
		this.comments = comments;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "USER_ID", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "USER_CODE", length = 40)
	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	@Column(name = "USER_NAME", nullable = false, length = 100)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "COMMENTS", length = 400)
	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}