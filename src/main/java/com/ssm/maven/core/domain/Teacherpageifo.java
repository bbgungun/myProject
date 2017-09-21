package com.ssm.maven.core.domain;




public class Teacherpageifo {
    private Integer teacherpageifoId;

    private String tName;

    private String tSex;

    private String tBirth;

    private String tEmail;

    private String tQq;

    private String tTel;

    private String address;

    private Integer courseId;

    private Integer cId;

    @Override
	public String toString() {
		return "Teacherpageifo [teacherpageifoId=" + teacherpageifoId
				+ ", tName=" + tName + ", tSex=" + tSex + ", tBirth=" + tBirth
				+ ", tEmail=" + tEmail + ", tQq=" + tQq + ", tTel=" + tTel
				+ ", address=" + address + ", courseId=" + courseId + ", cId="
				+ cId + "]";
	}

	public Integer getTeacherpageifoId() {
        return teacherpageifoId;
    }

    public void setTeacherpageifoId(Integer teacherpageifoId) {
        this.teacherpageifoId = teacherpageifoId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettSex() {
        return tSex;
    }

    public void settSex(String tSex) {
        this.tSex = tSex == null ? null : tSex.trim();
    }

    public String gettBirth() {
        return tBirth;
    }

    public void settBirth(String tBirth) {
        this.tBirth = tBirth;
    }

    public String gettEmail() {
        return tEmail;
    }

    public void settEmail(String tEmail) {
        this.tEmail = tEmail == null ? null : tEmail.trim();
    }

    public String gettQq() {
        return tQq;
    }

    public void settQq(String tQq) {
        this.tQq = tQq == null ? null : tQq.trim();
    }

    public String gettTel() {
        return tTel;
    }

    public void settTel(String tTel) {
        this.tTel = tTel == null ? null : tTel.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }
}