package com.ssm.maven.core.domain;

import java.util.Date;


public class Userifo {
    private Integer userId;

    private String userAccount;

    private String userName;

    private String userPassword;

    private String userRealname;

    private String userSex;

    private Date userBirth;

    private String userEducation;

    private String userEmail;

    private String userTel;

    private String userQq;

    private String userAddress;

    private String userDescriptoin;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname == null ? null : userRealname.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public Date getUserBirth() {
        return userBirth;
    }

    @Override
	public String toString() {
		return "Userifo [userId=" + userId + ", userAccount=" + userAccount
				+ ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userRealname=" + userRealname + ", userSex=" + userSex
				+ ", userBirth=" + userBirth + ", userEducation="
				+ userEducation + ", userEmail=" + userEmail + ", userTel="
				+ userTel + ", userQq=" + userQq + ", userAddress="
				+ userAddress + ", userDescriptoin=" + userDescriptoin + "]";
	}

	public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }

    public String getUserEducation() {
        return userEducation;
    }

    public void setUserEducation(String userEducation) {
        this.userEducation = userEducation == null ? null : userEducation.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq == null ? null : userQq.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserDescriptoin() {
        return userDescriptoin;
    }

    public void setUserDescriptoin(String userDescriptoin) {
        this.userDescriptoin = userDescriptoin == null ? null : userDescriptoin.trim();
    }
}