package com.ssm.maven.core.domain;


public class Studentpageifo {
    private Integer pId;

	private String pName;

    private String pNickname;

    private Boolean pPicture;

    private String pSex;

    private String pBirthday;

    private String pInteresting;

    private String pTel;

    private String pEmail;

    private String pQq;

    private String pWeibo;

    private String pAddress;

    private String pConstellation;

    private String pIdol;

    private String pLuckcolor;

    private String pWishes;

    @Override
	public String toString() {
		return "Studentpageifo [pId=" + pId + ", pName=" + pName
				+ ", pNickname=" + pNickname + ", pPicture=" + pPicture
				+ ", pSex=" + pSex + ", pBirthday=" + pBirthday
				+ ", pInteresting=" + pInteresting + ", pTel=" + pTel
				+ ", pEmail=" + pEmail + ", pQq=" + pQq + ", pWeibo=" + pWeibo
				+ ", pAddress=" + pAddress + ", pConstellation="
				+ pConstellation + ", pIdol=" + pIdol + ", pLuckcolor="
				+ pLuckcolor + ", pWishes=" + pWishes + "]";
	}

	public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpNickname() {
        return pNickname;
    }

    public void setpNickname(String pNickname) {
        this.pNickname = pNickname == null ? null : pNickname.trim();
    }

    public Boolean getpPicture() {
        return pPicture;
    }

    public void setpPicture(Boolean pPicture) {
        this.pPicture = pPicture;
    }

    public String getpSex() {
        return pSex;
    }

    public void setpSex(String pSex) {
        this.pSex = pSex == null ? null : pSex.trim();
    }

    public String getpBirthday() {
        return pBirthday;
    }

    public void setpBirthday(String pBirthday) {
        this.pBirthday = pBirthday == null ? null : pBirthday.trim();
    }

    public String getpInteresting() {
        return pInteresting;
    }

    public void setpInteresting(String pInteresting) {
        this.pInteresting = pInteresting == null ? null : pInteresting.trim();
    }

    public String getpTel() {
        return pTel;
    }

    public void setpTel(String pTel) {
        this.pTel = pTel == null ? null : pTel.trim();
    }

    public String getpEmail() {
        return pEmail;
    }

    public void setpEmail(String pEmail) {
        this.pEmail = pEmail == null ? null : pEmail.trim();
    }

    public String getpQq() {
        return pQq;
    }

    public void setpQq(String pQq) {
        this.pQq = pQq == null ? null : pQq.trim();
    }

    public String getpWeibo() {
        return pWeibo;
    }

    public void setpWeibo(String pWeibo) {
        this.pWeibo = pWeibo == null ? null : pWeibo.trim();
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress == null ? null : pAddress.trim();
    }

    public String getpConstellation() {
        return pConstellation;
    }

    public void setpConstellation(String pConstellation) {
        this.pConstellation = pConstellation == null ? null : pConstellation.trim();
    }

    public String getpIdol() {
        return pIdol;
    }

    public void setpIdol(String pIdol) {
        this.pIdol = pIdol == null ? null : pIdol.trim();
    }

    public String getpLuckcolor() {
        return pLuckcolor;
    }

    public void setpLuckcolor(String pLuckcolor) {
        this.pLuckcolor = pLuckcolor == null ? null : pLuckcolor.trim();
    }

    public String getpWishes() {
        return pWishes;
    }

    public void setpWishes(String pWishes) {
        this.pWishes = pWishes == null ? null : pWishes.trim();
    }
}