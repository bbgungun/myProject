package com.ssm.maven.core.domain;

import java.util.ArrayList;
import java.util.List;

public class StudentpageifoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentpageifoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2017-09-07
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPNameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNicknameIsNull() {
            addCriterion("p_nickname is null");
            return (Criteria) this;
        }

        public Criteria andPNicknameIsNotNull() {
            addCriterion("p_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andPNicknameEqualTo(String value) {
            addCriterion("p_nickname =", value, "pNickname");
            return (Criteria) this;
        }

        public Criteria andPNicknameNotEqualTo(String value) {
            addCriterion("p_nickname <>", value, "pNickname");
            return (Criteria) this;
        }

        public Criteria andPNicknameGreaterThan(String value) {
            addCriterion("p_nickname >", value, "pNickname");
            return (Criteria) this;
        }

        public Criteria andPNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("p_nickname >=", value, "pNickname");
            return (Criteria) this;
        }

        public Criteria andPNicknameLessThan(String value) {
            addCriterion("p_nickname <", value, "pNickname");
            return (Criteria) this;
        }

        public Criteria andPNicknameLessThanOrEqualTo(String value) {
            addCriterion("p_nickname <=", value, "pNickname");
            return (Criteria) this;
        }

        public Criteria andPNicknameLike(String value) {
            addCriterion("p_nickname like", value, "pNickname");
            return (Criteria) this;
        }

        public Criteria andPNicknameNotLike(String value) {
            addCriterion("p_nickname not like", value, "pNickname");
            return (Criteria) this;
        }

        public Criteria andPNicknameIn(List<String> values) {
            addCriterion("p_nickname in", values, "pNickname");
            return (Criteria) this;
        }

        public Criteria andPNicknameNotIn(List<String> values) {
            addCriterion("p_nickname not in", values, "pNickname");
            return (Criteria) this;
        }

        public Criteria andPNicknameBetween(String value1, String value2) {
            addCriterion("p_nickname between", value1, value2, "pNickname");
            return (Criteria) this;
        }

        public Criteria andPNicknameNotBetween(String value1, String value2) {
            addCriterion("p_nickname not between", value1, value2, "pNickname");
            return (Criteria) this;
        }

        public Criteria andPPictureIsNull() {
            addCriterion("p_picture is null");
            return (Criteria) this;
        }

        public Criteria andPPictureIsNotNull() {
            addCriterion("p_picture is not null");
            return (Criteria) this;
        }

        public Criteria andPPictureEqualTo(Boolean value) {
            addCriterion("p_picture =", value, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPPictureNotEqualTo(Boolean value) {
            addCriterion("p_picture <>", value, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPPictureGreaterThan(Boolean value) {
            addCriterion("p_picture >", value, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPPictureGreaterThanOrEqualTo(Boolean value) {
            addCriterion("p_picture >=", value, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPPictureLessThan(Boolean value) {
            addCriterion("p_picture <", value, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPPictureLessThanOrEqualTo(Boolean value) {
            addCriterion("p_picture <=", value, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPPictureIn(List<Boolean> values) {
            addCriterion("p_picture in", values, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPPictureNotIn(List<Boolean> values) {
            addCriterion("p_picture not in", values, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPPictureBetween(Boolean value1, Boolean value2) {
            addCriterion("p_picture between", value1, value2, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPPictureNotBetween(Boolean value1, Boolean value2) {
            addCriterion("p_picture not between", value1, value2, "pPicture");
            return (Criteria) this;
        }

        public Criteria andPSexIsNull() {
            addCriterion("p_sex is null");
            return (Criteria) this;
        }

        public Criteria andPSexIsNotNull() {
            addCriterion("p_sex is not null");
            return (Criteria) this;
        }

        public Criteria andPSexEqualTo(String value) {
            addCriterion("p_sex =", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexNotEqualTo(String value) {
            addCriterion("p_sex <>", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexGreaterThan(String value) {
            addCriterion("p_sex >", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexGreaterThanOrEqualTo(String value) {
            addCriterion("p_sex >=", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexLessThan(String value) {
            addCriterion("p_sex <", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexLessThanOrEqualTo(String value) {
            addCriterion("p_sex <=", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexLike(String value) {
            addCriterion("p_sex like", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexNotLike(String value) {
            addCriterion("p_sex not like", value, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexIn(List<String> values) {
            addCriterion("p_sex in", values, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexNotIn(List<String> values) {
            addCriterion("p_sex not in", values, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexBetween(String value1, String value2) {
            addCriterion("p_sex between", value1, value2, "pSex");
            return (Criteria) this;
        }

        public Criteria andPSexNotBetween(String value1, String value2) {
            addCriterion("p_sex not between", value1, value2, "pSex");
            return (Criteria) this;
        }

        public Criteria andPBirthdayIsNull() {
            addCriterion("p_birthday is null");
            return (Criteria) this;
        }

        public Criteria andPBirthdayIsNotNull() {
            addCriterion("p_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andPBirthdayEqualTo(String value) {
            addCriterion("p_birthday =", value, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPBirthdayNotEqualTo(String value) {
            addCriterion("p_birthday <>", value, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPBirthdayGreaterThan(String value) {
            addCriterion("p_birthday >", value, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("p_birthday >=", value, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPBirthdayLessThan(String value) {
            addCriterion("p_birthday <", value, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPBirthdayLessThanOrEqualTo(String value) {
            addCriterion("p_birthday <=", value, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPBirthdayLike(String value) {
            addCriterion("p_birthday like", value, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPBirthdayNotLike(String value) {
            addCriterion("p_birthday not like", value, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPBirthdayIn(List<String> values) {
            addCriterion("p_birthday in", values, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPBirthdayNotIn(List<String> values) {
            addCriterion("p_birthday not in", values, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPBirthdayBetween(String value1, String value2) {
            addCriterion("p_birthday between", value1, value2, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPBirthdayNotBetween(String value1, String value2) {
            addCriterion("p_birthday not between", value1, value2, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPInterestingIsNull() {
            addCriterion("p_interesting is null");
            return (Criteria) this;
        }

        public Criteria andPInterestingIsNotNull() {
            addCriterion("p_interesting is not null");
            return (Criteria) this;
        }

        public Criteria andPInterestingEqualTo(String value) {
            addCriterion("p_interesting =", value, "pInteresting");
            return (Criteria) this;
        }

        public Criteria andPInterestingNotEqualTo(String value) {
            addCriterion("p_interesting <>", value, "pInteresting");
            return (Criteria) this;
        }

        public Criteria andPInterestingGreaterThan(String value) {
            addCriterion("p_interesting >", value, "pInteresting");
            return (Criteria) this;
        }

        public Criteria andPInterestingGreaterThanOrEqualTo(String value) {
            addCriterion("p_interesting >=", value, "pInteresting");
            return (Criteria) this;
        }

        public Criteria andPInterestingLessThan(String value) {
            addCriterion("p_interesting <", value, "pInteresting");
            return (Criteria) this;
        }

        public Criteria andPInterestingLessThanOrEqualTo(String value) {
            addCriterion("p_interesting <=", value, "pInteresting");
            return (Criteria) this;
        }

        public Criteria andPInterestingLike(String value) {
            addCriterion("p_interesting like", value, "pInteresting");
            return (Criteria) this;
        }

        public Criteria andPInterestingNotLike(String value) {
            addCriterion("p_interesting not like", value, "pInteresting");
            return (Criteria) this;
        }

        public Criteria andPInterestingIn(List<String> values) {
            addCriterion("p_interesting in", values, "pInteresting");
            return (Criteria) this;
        }

        public Criteria andPInterestingNotIn(List<String> values) {
            addCriterion("p_interesting not in", values, "pInteresting");
            return (Criteria) this;
        }

        public Criteria andPInterestingBetween(String value1, String value2) {
            addCriterion("p_interesting between", value1, value2, "pInteresting");
            return (Criteria) this;
        }

        public Criteria andPInterestingNotBetween(String value1, String value2) {
            addCriterion("p_interesting not between", value1, value2, "pInteresting");
            return (Criteria) this;
        }

        public Criteria andPTelIsNull() {
            addCriterion("p_tel is null");
            return (Criteria) this;
        }

        public Criteria andPTelIsNotNull() {
            addCriterion("p_tel is not null");
            return (Criteria) this;
        }

        public Criteria andPTelEqualTo(String value) {
            addCriterion("p_tel =", value, "pTel");
            return (Criteria) this;
        }

        public Criteria andPTelNotEqualTo(String value) {
            addCriterion("p_tel <>", value, "pTel");
            return (Criteria) this;
        }

        public Criteria andPTelGreaterThan(String value) {
            addCriterion("p_tel >", value, "pTel");
            return (Criteria) this;
        }

        public Criteria andPTelGreaterThanOrEqualTo(String value) {
            addCriterion("p_tel >=", value, "pTel");
            return (Criteria) this;
        }

        public Criteria andPTelLessThan(String value) {
            addCriterion("p_tel <", value, "pTel");
            return (Criteria) this;
        }

        public Criteria andPTelLessThanOrEqualTo(String value) {
            addCriterion("p_tel <=", value, "pTel");
            return (Criteria) this;
        }

        public Criteria andPTelLike(String value) {
            addCriterion("p_tel like", value, "pTel");
            return (Criteria) this;
        }

        public Criteria andPTelNotLike(String value) {
            addCriterion("p_tel not like", value, "pTel");
            return (Criteria) this;
        }

        public Criteria andPTelIn(List<String> values) {
            addCriterion("p_tel in", values, "pTel");
            return (Criteria) this;
        }

        public Criteria andPTelNotIn(List<String> values) {
            addCriterion("p_tel not in", values, "pTel");
            return (Criteria) this;
        }

        public Criteria andPTelBetween(String value1, String value2) {
            addCriterion("p_tel between", value1, value2, "pTel");
            return (Criteria) this;
        }

        public Criteria andPTelNotBetween(String value1, String value2) {
            addCriterion("p_tel not between", value1, value2, "pTel");
            return (Criteria) this;
        }

        public Criteria andPEmailIsNull() {
            addCriterion("p_email is null");
            return (Criteria) this;
        }

        public Criteria andPEmailIsNotNull() {
            addCriterion("p_email is not null");
            return (Criteria) this;
        }

        public Criteria andPEmailEqualTo(String value) {
            addCriterion("p_email =", value, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailNotEqualTo(String value) {
            addCriterion("p_email <>", value, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailGreaterThan(String value) {
            addCriterion("p_email >", value, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailGreaterThanOrEqualTo(String value) {
            addCriterion("p_email >=", value, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailLessThan(String value) {
            addCriterion("p_email <", value, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailLessThanOrEqualTo(String value) {
            addCriterion("p_email <=", value, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailLike(String value) {
            addCriterion("p_email like", value, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailNotLike(String value) {
            addCriterion("p_email not like", value, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailIn(List<String> values) {
            addCriterion("p_email in", values, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailNotIn(List<String> values) {
            addCriterion("p_email not in", values, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailBetween(String value1, String value2) {
            addCriterion("p_email between", value1, value2, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailNotBetween(String value1, String value2) {
            addCriterion("p_email not between", value1, value2, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPQqIsNull() {
            addCriterion("p_qq is null");
            return (Criteria) this;
        }

        public Criteria andPQqIsNotNull() {
            addCriterion("p_qq is not null");
            return (Criteria) this;
        }

        public Criteria andPQqEqualTo(String value) {
            addCriterion("p_qq =", value, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqNotEqualTo(String value) {
            addCriterion("p_qq <>", value, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqGreaterThan(String value) {
            addCriterion("p_qq >", value, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqGreaterThanOrEqualTo(String value) {
            addCriterion("p_qq >=", value, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqLessThan(String value) {
            addCriterion("p_qq <", value, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqLessThanOrEqualTo(String value) {
            addCriterion("p_qq <=", value, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqLike(String value) {
            addCriterion("p_qq like", value, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqNotLike(String value) {
            addCriterion("p_qq not like", value, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqIn(List<String> values) {
            addCriterion("p_qq in", values, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqNotIn(List<String> values) {
            addCriterion("p_qq not in", values, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqBetween(String value1, String value2) {
            addCriterion("p_qq between", value1, value2, "pQq");
            return (Criteria) this;
        }

        public Criteria andPQqNotBetween(String value1, String value2) {
            addCriterion("p_qq not between", value1, value2, "pQq");
            return (Criteria) this;
        }

        public Criteria andPWeiboIsNull() {
            addCriterion("p_weibo is null");
            return (Criteria) this;
        }

        public Criteria andPWeiboIsNotNull() {
            addCriterion("p_weibo is not null");
            return (Criteria) this;
        }

        public Criteria andPWeiboEqualTo(String value) {
            addCriterion("p_weibo =", value, "pWeibo");
            return (Criteria) this;
        }

        public Criteria andPWeiboNotEqualTo(String value) {
            addCriterion("p_weibo <>", value, "pWeibo");
            return (Criteria) this;
        }

        public Criteria andPWeiboGreaterThan(String value) {
            addCriterion("p_weibo >", value, "pWeibo");
            return (Criteria) this;
        }

        public Criteria andPWeiboGreaterThanOrEqualTo(String value) {
            addCriterion("p_weibo >=", value, "pWeibo");
            return (Criteria) this;
        }

        public Criteria andPWeiboLessThan(String value) {
            addCriterion("p_weibo <", value, "pWeibo");
            return (Criteria) this;
        }

        public Criteria andPWeiboLessThanOrEqualTo(String value) {
            addCriterion("p_weibo <=", value, "pWeibo");
            return (Criteria) this;
        }

        public Criteria andPWeiboLike(String value) {
            addCriterion("p_weibo like", value, "pWeibo");
            return (Criteria) this;
        }

        public Criteria andPWeiboNotLike(String value) {
            addCriterion("p_weibo not like", value, "pWeibo");
            return (Criteria) this;
        }

        public Criteria andPWeiboIn(List<String> values) {
            addCriterion("p_weibo in", values, "pWeibo");
            return (Criteria) this;
        }

        public Criteria andPWeiboNotIn(List<String> values) {
            addCriterion("p_weibo not in", values, "pWeibo");
            return (Criteria) this;
        }

        public Criteria andPWeiboBetween(String value1, String value2) {
            addCriterion("p_weibo between", value1, value2, "pWeibo");
            return (Criteria) this;
        }

        public Criteria andPWeiboNotBetween(String value1, String value2) {
            addCriterion("p_weibo not between", value1, value2, "pWeibo");
            return (Criteria) this;
        }

        public Criteria andPAddressIsNull() {
            addCriterion("p_address is null");
            return (Criteria) this;
        }

        public Criteria andPAddressIsNotNull() {
            addCriterion("p_address is not null");
            return (Criteria) this;
        }

        public Criteria andPAddressEqualTo(String value) {
            addCriterion("p_address =", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotEqualTo(String value) {
            addCriterion("p_address <>", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressGreaterThan(String value) {
            addCriterion("p_address >", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressGreaterThanOrEqualTo(String value) {
            addCriterion("p_address >=", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLessThan(String value) {
            addCriterion("p_address <", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLessThanOrEqualTo(String value) {
            addCriterion("p_address <=", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLike(String value) {
            addCriterion("p_address like", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotLike(String value) {
            addCriterion("p_address not like", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressIn(List<String> values) {
            addCriterion("p_address in", values, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotIn(List<String> values) {
            addCriterion("p_address not in", values, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressBetween(String value1, String value2) {
            addCriterion("p_address between", value1, value2, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotBetween(String value1, String value2) {
            addCriterion("p_address not between", value1, value2, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPConstellationIsNull() {
            addCriterion("p_constellation is null");
            return (Criteria) this;
        }

        public Criteria andPConstellationIsNotNull() {
            addCriterion("p_constellation is not null");
            return (Criteria) this;
        }

        public Criteria andPConstellationEqualTo(String value) {
            addCriterion("p_constellation =", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationNotEqualTo(String value) {
            addCriterion("p_constellation <>", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationGreaterThan(String value) {
            addCriterion("p_constellation >", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationGreaterThanOrEqualTo(String value) {
            addCriterion("p_constellation >=", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationLessThan(String value) {
            addCriterion("p_constellation <", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationLessThanOrEqualTo(String value) {
            addCriterion("p_constellation <=", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationLike(String value) {
            addCriterion("p_constellation like", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationNotLike(String value) {
            addCriterion("p_constellation not like", value, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationIn(List<String> values) {
            addCriterion("p_constellation in", values, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationNotIn(List<String> values) {
            addCriterion("p_constellation not in", values, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationBetween(String value1, String value2) {
            addCriterion("p_constellation between", value1, value2, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPConstellationNotBetween(String value1, String value2) {
            addCriterion("p_constellation not between", value1, value2, "pConstellation");
            return (Criteria) this;
        }

        public Criteria andPIdolIsNull() {
            addCriterion("p_idol is null");
            return (Criteria) this;
        }

        public Criteria andPIdolIsNotNull() {
            addCriterion("p_idol is not null");
            return (Criteria) this;
        }

        public Criteria andPIdolEqualTo(String value) {
            addCriterion("p_idol =", value, "pIdol");
            return (Criteria) this;
        }

        public Criteria andPIdolNotEqualTo(String value) {
            addCriterion("p_idol <>", value, "pIdol");
            return (Criteria) this;
        }

        public Criteria andPIdolGreaterThan(String value) {
            addCriterion("p_idol >", value, "pIdol");
            return (Criteria) this;
        }

        public Criteria andPIdolGreaterThanOrEqualTo(String value) {
            addCriterion("p_idol >=", value, "pIdol");
            return (Criteria) this;
        }

        public Criteria andPIdolLessThan(String value) {
            addCriterion("p_idol <", value, "pIdol");
            return (Criteria) this;
        }

        public Criteria andPIdolLessThanOrEqualTo(String value) {
            addCriterion("p_idol <=", value, "pIdol");
            return (Criteria) this;
        }

        public Criteria andPIdolLike(String value) {
            addCriterion("p_idol like", value, "pIdol");
            return (Criteria) this;
        }

        public Criteria andPIdolNotLike(String value) {
            addCriterion("p_idol not like", value, "pIdol");
            return (Criteria) this;
        }

        public Criteria andPIdolIn(List<String> values) {
            addCriterion("p_idol in", values, "pIdol");
            return (Criteria) this;
        }

        public Criteria andPIdolNotIn(List<String> values) {
            addCriterion("p_idol not in", values, "pIdol");
            return (Criteria) this;
        }

        public Criteria andPIdolBetween(String value1, String value2) {
            addCriterion("p_idol between", value1, value2, "pIdol");
            return (Criteria) this;
        }

        public Criteria andPIdolNotBetween(String value1, String value2) {
            addCriterion("p_idol not between", value1, value2, "pIdol");
            return (Criteria) this;
        }

        public Criteria andPLuckcolorIsNull() {
            addCriterion("p_luckcolor is null");
            return (Criteria) this;
        }

        public Criteria andPLuckcolorIsNotNull() {
            addCriterion("p_luckcolor is not null");
            return (Criteria) this;
        }

        public Criteria andPLuckcolorEqualTo(String value) {
            addCriterion("p_luckcolor =", value, "pLuckcolor");
            return (Criteria) this;
        }

        public Criteria andPLuckcolorNotEqualTo(String value) {
            addCriterion("p_luckcolor <>", value, "pLuckcolor");
            return (Criteria) this;
        }

        public Criteria andPLuckcolorGreaterThan(String value) {
            addCriterion("p_luckcolor >", value, "pLuckcolor");
            return (Criteria) this;
        }

        public Criteria andPLuckcolorGreaterThanOrEqualTo(String value) {
            addCriterion("p_luckcolor >=", value, "pLuckcolor");
            return (Criteria) this;
        }

        public Criteria andPLuckcolorLessThan(String value) {
            addCriterion("p_luckcolor <", value, "pLuckcolor");
            return (Criteria) this;
        }

        public Criteria andPLuckcolorLessThanOrEqualTo(String value) {
            addCriterion("p_luckcolor <=", value, "pLuckcolor");
            return (Criteria) this;
        }

        public Criteria andPLuckcolorLike(String value) {
            addCriterion("p_luckcolor like", value, "pLuckcolor");
            return (Criteria) this;
        }

        public Criteria andPLuckcolorNotLike(String value) {
            addCriterion("p_luckcolor not like", value, "pLuckcolor");
            return (Criteria) this;
        }

        public Criteria andPLuckcolorIn(List<String> values) {
            addCriterion("p_luckcolor in", values, "pLuckcolor");
            return (Criteria) this;
        }

        public Criteria andPLuckcolorNotIn(List<String> values) {
            addCriterion("p_luckcolor not in", values, "pLuckcolor");
            return (Criteria) this;
        }

        public Criteria andPLuckcolorBetween(String value1, String value2) {
            addCriterion("p_luckcolor between", value1, value2, "pLuckcolor");
            return (Criteria) this;
        }

        public Criteria andPLuckcolorNotBetween(String value1, String value2) {
            addCriterion("p_luckcolor not between", value1, value2, "pLuckcolor");
            return (Criteria) this;
        }

        public Criteria andPWishesIsNull() {
            addCriterion("p_wishes is null");
            return (Criteria) this;
        }

        public Criteria andPWishesIsNotNull() {
            addCriterion("p_wishes is not null");
            return (Criteria) this;
        }

        public Criteria andPWishesEqualTo(String value) {
            addCriterion("p_wishes =", value, "pWishes");
            return (Criteria) this;
        }

        public Criteria andPWishesNotEqualTo(String value) {
            addCriterion("p_wishes <>", value, "pWishes");
            return (Criteria) this;
        }

        public Criteria andPWishesGreaterThan(String value) {
            addCriterion("p_wishes >", value, "pWishes");
            return (Criteria) this;
        }

        public Criteria andPWishesGreaterThanOrEqualTo(String value) {
            addCriterion("p_wishes >=", value, "pWishes");
            return (Criteria) this;
        }

        public Criteria andPWishesLessThan(String value) {
            addCriterion("p_wishes <", value, "pWishes");
            return (Criteria) this;
        }

        public Criteria andPWishesLessThanOrEqualTo(String value) {
            addCriterion("p_wishes <=", value, "pWishes");
            return (Criteria) this;
        }

        public Criteria andPWishesLike(String value) {
            addCriterion("p_wishes like", value, "pWishes");
            return (Criteria) this;
        }

        public Criteria andPWishesNotLike(String value) {
            addCriterion("p_wishes not like", value, "pWishes");
            return (Criteria) this;
        }

        public Criteria andPWishesIn(List<String> values) {
            addCriterion("p_wishes in", values, "pWishes");
            return (Criteria) this;
        }

        public Criteria andPWishesNotIn(List<String> values) {
            addCriterion("p_wishes not in", values, "pWishes");
            return (Criteria) this;
        }

        public Criteria andPWishesBetween(String value1, String value2) {
            addCriterion("p_wishes between", value1, value2, "pWishes");
            return (Criteria) this;
        }

        public Criteria andPWishesNotBetween(String value1, String value2) {
            addCriterion("p_wishes not between", value1, value2, "pWishes");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2017-09-07
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}