package com.ssm.maven.core.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TeacherpageifoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherpageifoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTeacherpageifoIdIsNull() {
            addCriterion("teacherPageIfo_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherpageifoIdIsNotNull() {
            addCriterion("teacherPageIfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherpageifoIdEqualTo(Integer value) {
            addCriterion("teacherPageIfo_id =", value, "teacherpageifoId");
            return (Criteria) this;
        }

        public Criteria andTeacherpageifoIdNotEqualTo(Integer value) {
            addCriterion("teacherPageIfo_id <>", value, "teacherpageifoId");
            return (Criteria) this;
        }

        public Criteria andTeacherpageifoIdGreaterThan(Integer value) {
            addCriterion("teacherPageIfo_id >", value, "teacherpageifoId");
            return (Criteria) this;
        }

        public Criteria andTeacherpageifoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacherPageIfo_id >=", value, "teacherpageifoId");
            return (Criteria) this;
        }

        public Criteria andTeacherpageifoIdLessThan(Integer value) {
            addCriterion("teacherPageIfo_id <", value, "teacherpageifoId");
            return (Criteria) this;
        }

        public Criteria andTeacherpageifoIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacherPageIfo_id <=", value, "teacherpageifoId");
            return (Criteria) this;
        }

        public Criteria andTeacherpageifoIdIn(List<Integer> values) {
            addCriterion("teacherPageIfo_id in", values, "teacherpageifoId");
            return (Criteria) this;
        }

        public Criteria andTeacherpageifoIdNotIn(List<Integer> values) {
            addCriterion("teacherPageIfo_id not in", values, "teacherpageifoId");
            return (Criteria) this;
        }

        public Criteria andTeacherpageifoIdBetween(Integer value1, Integer value2) {
            addCriterion("teacherPageIfo_id between", value1, value2, "teacherpageifoId");
            return (Criteria) this;
        }

        public Criteria andTeacherpageifoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacherPageIfo_id not between", value1, value2, "teacherpageifoId");
            return (Criteria) this;
        }

        public Criteria andTNameIsNull() {
            addCriterion("t_name is null");
            return (Criteria) this;
        }

        public Criteria andTNameIsNotNull() {
            addCriterion("t_name is not null");
            return (Criteria) this;
        }

        public Criteria andTNameEqualTo(String value) {
            addCriterion("t_name =", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotEqualTo(String value) {
            addCriterion("t_name <>", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThan(String value) {
            addCriterion("t_name >", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_name >=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThan(String value) {
            addCriterion("t_name <", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThanOrEqualTo(String value) {
            addCriterion("t_name <=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLike(String value) {
            addCriterion("t_name like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotLike(String value) {
            addCriterion("t_name not like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameIn(List<String> values) {
            addCriterion("t_name in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotIn(List<String> values) {
            addCriterion("t_name not in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameBetween(String value1, String value2) {
            addCriterion("t_name between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotBetween(String value1, String value2) {
            addCriterion("t_name not between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTSexIsNull() {
            addCriterion("t_sex is null");
            return (Criteria) this;
        }

        public Criteria andTSexIsNotNull() {
            addCriterion("t_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTSexEqualTo(String value) {
            addCriterion("t_sex =", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotEqualTo(String value) {
            addCriterion("t_sex <>", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexGreaterThan(String value) {
            addCriterion("t_sex >", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexGreaterThanOrEqualTo(String value) {
            addCriterion("t_sex >=", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexLessThan(String value) {
            addCriterion("t_sex <", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexLessThanOrEqualTo(String value) {
            addCriterion("t_sex <=", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexLike(String value) {
            addCriterion("t_sex like", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotLike(String value) {
            addCriterion("t_sex not like", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexIn(List<String> values) {
            addCriterion("t_sex in", values, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotIn(List<String> values) {
            addCriterion("t_sex not in", values, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexBetween(String value1, String value2) {
            addCriterion("t_sex between", value1, value2, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotBetween(String value1, String value2) {
            addCriterion("t_sex not between", value1, value2, "tSex");
            return (Criteria) this;
        }

        public Criteria andTBirthIsNull() {
            addCriterion("t_birth is null");
            return (Criteria) this;
        }

        public Criteria andTBirthIsNotNull() {
            addCriterion("t_birth is not null");
            return (Criteria) this;
        }

        public Criteria andTBirthEqualTo(Date value) {
            addCriterionForJDBCDate("t_birth =", value, "tBirth");
            return (Criteria) this;
        }

        public Criteria andTBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("t_birth <>", value, "tBirth");
            return (Criteria) this;
        }

        public Criteria andTBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("t_birth >", value, "tBirth");
            return (Criteria) this;
        }

        public Criteria andTBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_birth >=", value, "tBirth");
            return (Criteria) this;
        }

        public Criteria andTBirthLessThan(Date value) {
            addCriterionForJDBCDate("t_birth <", value, "tBirth");
            return (Criteria) this;
        }

        public Criteria andTBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_birth <=", value, "tBirth");
            return (Criteria) this;
        }

        public Criteria andTBirthIn(List<Date> values) {
            addCriterionForJDBCDate("t_birth in", values, "tBirth");
            return (Criteria) this;
        }

        public Criteria andTBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("t_birth not in", values, "tBirth");
            return (Criteria) this;
        }

        public Criteria andTBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_birth between", value1, value2, "tBirth");
            return (Criteria) this;
        }

        public Criteria andTBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_birth not between", value1, value2, "tBirth");
            return (Criteria) this;
        }

        public Criteria andTEmailIsNull() {
            addCriterion("t_email is null");
            return (Criteria) this;
        }

        public Criteria andTEmailIsNotNull() {
            addCriterion("t_email is not null");
            return (Criteria) this;
        }

        public Criteria andTEmailEqualTo(String value) {
            addCriterion("t_email =", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailNotEqualTo(String value) {
            addCriterion("t_email <>", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailGreaterThan(String value) {
            addCriterion("t_email >", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailGreaterThanOrEqualTo(String value) {
            addCriterion("t_email >=", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailLessThan(String value) {
            addCriterion("t_email <", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailLessThanOrEqualTo(String value) {
            addCriterion("t_email <=", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailLike(String value) {
            addCriterion("t_email like", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailNotLike(String value) {
            addCriterion("t_email not like", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailIn(List<String> values) {
            addCriterion("t_email in", values, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailNotIn(List<String> values) {
            addCriterion("t_email not in", values, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailBetween(String value1, String value2) {
            addCriterion("t_email between", value1, value2, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailNotBetween(String value1, String value2) {
            addCriterion("t_email not between", value1, value2, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTQqIsNull() {
            addCriterion("t_qq is null");
            return (Criteria) this;
        }

        public Criteria andTQqIsNotNull() {
            addCriterion("t_qq is not null");
            return (Criteria) this;
        }

        public Criteria andTQqEqualTo(String value) {
            addCriterion("t_qq =", value, "tQq");
            return (Criteria) this;
        }

        public Criteria andTQqNotEqualTo(String value) {
            addCriterion("t_qq <>", value, "tQq");
            return (Criteria) this;
        }

        public Criteria andTQqGreaterThan(String value) {
            addCriterion("t_qq >", value, "tQq");
            return (Criteria) this;
        }

        public Criteria andTQqGreaterThanOrEqualTo(String value) {
            addCriterion("t_qq >=", value, "tQq");
            return (Criteria) this;
        }

        public Criteria andTQqLessThan(String value) {
            addCriterion("t_qq <", value, "tQq");
            return (Criteria) this;
        }

        public Criteria andTQqLessThanOrEqualTo(String value) {
            addCriterion("t_qq <=", value, "tQq");
            return (Criteria) this;
        }

        public Criteria andTQqLike(String value) {
            addCriterion("t_qq like", value, "tQq");
            return (Criteria) this;
        }

        public Criteria andTQqNotLike(String value) {
            addCriterion("t_qq not like", value, "tQq");
            return (Criteria) this;
        }

        public Criteria andTQqIn(List<String> values) {
            addCriterion("t_qq in", values, "tQq");
            return (Criteria) this;
        }

        public Criteria andTQqNotIn(List<String> values) {
            addCriterion("t_qq not in", values, "tQq");
            return (Criteria) this;
        }

        public Criteria andTQqBetween(String value1, String value2) {
            addCriterion("t_qq between", value1, value2, "tQq");
            return (Criteria) this;
        }

        public Criteria andTQqNotBetween(String value1, String value2) {
            addCriterion("t_qq not between", value1, value2, "tQq");
            return (Criteria) this;
        }

        public Criteria andTTelIsNull() {
            addCriterion("t_tel is null");
            return (Criteria) this;
        }

        public Criteria andTTelIsNotNull() {
            addCriterion("t_tel is not null");
            return (Criteria) this;
        }

        public Criteria andTTelEqualTo(String value) {
            addCriterion("t_tel =", value, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelNotEqualTo(String value) {
            addCriterion("t_tel <>", value, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelGreaterThan(String value) {
            addCriterion("t_tel >", value, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelGreaterThanOrEqualTo(String value) {
            addCriterion("t_tel >=", value, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelLessThan(String value) {
            addCriterion("t_tel <", value, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelLessThanOrEqualTo(String value) {
            addCriterion("t_tel <=", value, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelLike(String value) {
            addCriterion("t_tel like", value, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelNotLike(String value) {
            addCriterion("t_tel not like", value, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelIn(List<String> values) {
            addCriterion("t_tel in", values, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelNotIn(List<String> values) {
            addCriterion("t_tel not in", values, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelBetween(String value1, String value2) {
            addCriterion("t_tel between", value1, value2, "tTel");
            return (Criteria) this;
        }

        public Criteria andTTelNotBetween(String value1, String value2) {
            addCriterion("t_tel not between", value1, value2, "tTel");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
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