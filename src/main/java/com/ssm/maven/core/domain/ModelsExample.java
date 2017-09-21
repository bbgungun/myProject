package com.ssm.maven.core.domain;

import java.util.ArrayList;
import java.util.List;

public class ModelsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModelsExample() {
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

        public Criteria andModelsIdIsNull() {
            addCriterion("models_id is null");
            return (Criteria) this;
        }

        public Criteria andModelsIdIsNotNull() {
            addCriterion("models_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelsIdEqualTo(Integer value) {
            addCriterion("models_id =", value, "modelsId");
            return (Criteria) this;
        }

        public Criteria andModelsIdNotEqualTo(Integer value) {
            addCriterion("models_id <>", value, "modelsId");
            return (Criteria) this;
        }

        public Criteria andModelsIdGreaterThan(Integer value) {
            addCriterion("models_id >", value, "modelsId");
            return (Criteria) this;
        }

        public Criteria andModelsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("models_id >=", value, "modelsId");
            return (Criteria) this;
        }

        public Criteria andModelsIdLessThan(Integer value) {
            addCriterion("models_id <", value, "modelsId");
            return (Criteria) this;
        }

        public Criteria andModelsIdLessThanOrEqualTo(Integer value) {
            addCriterion("models_id <=", value, "modelsId");
            return (Criteria) this;
        }

        public Criteria andModelsIdIn(List<Integer> values) {
            addCriterion("models_id in", values, "modelsId");
            return (Criteria) this;
        }

        public Criteria andModelsIdNotIn(List<Integer> values) {
            addCriterion("models_id not in", values, "modelsId");
            return (Criteria) this;
        }

        public Criteria andModelsIdBetween(Integer value1, Integer value2) {
            addCriterion("models_id between", value1, value2, "modelsId");
            return (Criteria) this;
        }

        public Criteria andModelsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("models_id not between", value1, value2, "modelsId");
            return (Criteria) this;
        }

        public Criteria andIndexpageIsNull() {
            addCriterion("indexpage is null");
            return (Criteria) this;
        }

        public Criteria andIndexpageIsNotNull() {
            addCriterion("indexpage is not null");
            return (Criteria) this;
        }

        public Criteria andIndexpageEqualTo(String value) {
            addCriterion("indexpage =", value, "indexpage");
            return (Criteria) this;
        }

        public Criteria andIndexpageNotEqualTo(String value) {
            addCriterion("indexpage <>", value, "indexpage");
            return (Criteria) this;
        }

        public Criteria andIndexpageGreaterThan(String value) {
            addCriterion("indexpage >", value, "indexpage");
            return (Criteria) this;
        }

        public Criteria andIndexpageGreaterThanOrEqualTo(String value) {
            addCriterion("indexpage >=", value, "indexpage");
            return (Criteria) this;
        }

        public Criteria andIndexpageLessThan(String value) {
            addCriterion("indexpage <", value, "indexpage");
            return (Criteria) this;
        }

        public Criteria andIndexpageLessThanOrEqualTo(String value) {
            addCriterion("indexpage <=", value, "indexpage");
            return (Criteria) this;
        }

        public Criteria andIndexpageLike(String value) {
            addCriterion("indexpage like", value, "indexpage");
            return (Criteria) this;
        }

        public Criteria andIndexpageNotLike(String value) {
            addCriterion("indexpage not like", value, "indexpage");
            return (Criteria) this;
        }

        public Criteria andIndexpageIn(List<String> values) {
            addCriterion("indexpage in", values, "indexpage");
            return (Criteria) this;
        }

        public Criteria andIndexpageNotIn(List<String> values) {
            addCriterion("indexpage not in", values, "indexpage");
            return (Criteria) this;
        }

        public Criteria andIndexpageBetween(String value1, String value2) {
            addCriterion("indexpage between", value1, value2, "indexpage");
            return (Criteria) this;
        }

        public Criteria andIndexpageNotBetween(String value1, String value2) {
            addCriterion("indexpage not between", value1, value2, "indexpage");
            return (Criteria) this;
        }

        public Criteria andTeacherpageIsNull() {
            addCriterion("teacherpage is null");
            return (Criteria) this;
        }

        public Criteria andTeacherpageIsNotNull() {
            addCriterion("teacherpage is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherpageEqualTo(String value) {
            addCriterion("teacherpage =", value, "teacherpage");
            return (Criteria) this;
        }

        public Criteria andTeacherpageNotEqualTo(String value) {
            addCriterion("teacherpage <>", value, "teacherpage");
            return (Criteria) this;
        }

        public Criteria andTeacherpageGreaterThan(String value) {
            addCriterion("teacherpage >", value, "teacherpage");
            return (Criteria) this;
        }

        public Criteria andTeacherpageGreaterThanOrEqualTo(String value) {
            addCriterion("teacherpage >=", value, "teacherpage");
            return (Criteria) this;
        }

        public Criteria andTeacherpageLessThan(String value) {
            addCriterion("teacherpage <", value, "teacherpage");
            return (Criteria) this;
        }

        public Criteria andTeacherpageLessThanOrEqualTo(String value) {
            addCriterion("teacherpage <=", value, "teacherpage");
            return (Criteria) this;
        }

        public Criteria andTeacherpageLike(String value) {
            addCriterion("teacherpage like", value, "teacherpage");
            return (Criteria) this;
        }

        public Criteria andTeacherpageNotLike(String value) {
            addCriterion("teacherpage not like", value, "teacherpage");
            return (Criteria) this;
        }

        public Criteria andTeacherpageIn(List<String> values) {
            addCriterion("teacherpage in", values, "teacherpage");
            return (Criteria) this;
        }

        public Criteria andTeacherpageNotIn(List<String> values) {
            addCriterion("teacherpage not in", values, "teacherpage");
            return (Criteria) this;
        }

        public Criteria andTeacherpageBetween(String value1, String value2) {
            addCriterion("teacherpage between", value1, value2, "teacherpage");
            return (Criteria) this;
        }

        public Criteria andTeacherpageNotBetween(String value1, String value2) {
            addCriterion("teacherpage not between", value1, value2, "teacherpage");
            return (Criteria) this;
        }

        public Criteria andStudentpageIsNull() {
            addCriterion("studentpage is null");
            return (Criteria) this;
        }

        public Criteria andStudentpageIsNotNull() {
            addCriterion("studentpage is not null");
            return (Criteria) this;
        }

        public Criteria andStudentpageEqualTo(String value) {
            addCriterion("studentpage =", value, "studentpage");
            return (Criteria) this;
        }

        public Criteria andStudentpageNotEqualTo(String value) {
            addCriterion("studentpage <>", value, "studentpage");
            return (Criteria) this;
        }

        public Criteria andStudentpageGreaterThan(String value) {
            addCriterion("studentpage >", value, "studentpage");
            return (Criteria) this;
        }

        public Criteria andStudentpageGreaterThanOrEqualTo(String value) {
            addCriterion("studentpage >=", value, "studentpage");
            return (Criteria) this;
        }

        public Criteria andStudentpageLessThan(String value) {
            addCriterion("studentpage <", value, "studentpage");
            return (Criteria) this;
        }

        public Criteria andStudentpageLessThanOrEqualTo(String value) {
            addCriterion("studentpage <=", value, "studentpage");
            return (Criteria) this;
        }

        public Criteria andStudentpageLike(String value) {
            addCriterion("studentpage like", value, "studentpage");
            return (Criteria) this;
        }

        public Criteria andStudentpageNotLike(String value) {
            addCriterion("studentpage not like", value, "studentpage");
            return (Criteria) this;
        }

        public Criteria andStudentpageIn(List<String> values) {
            addCriterion("studentpage in", values, "studentpage");
            return (Criteria) this;
        }

        public Criteria andStudentpageNotIn(List<String> values) {
            addCriterion("studentpage not in", values, "studentpage");
            return (Criteria) this;
        }

        public Criteria andStudentpageBetween(String value1, String value2) {
            addCriterion("studentpage between", value1, value2, "studentpage");
            return (Criteria) this;
        }

        public Criteria andStudentpageNotBetween(String value1, String value2) {
            addCriterion("studentpage not between", value1, value2, "studentpage");
            return (Criteria) this;
        }

        public Criteria andTailpageIsNull() {
            addCriterion("tailpage is null");
            return (Criteria) this;
        }

        public Criteria andTailpageIsNotNull() {
            addCriterion("tailpage is not null");
            return (Criteria) this;
        }

        public Criteria andTailpageEqualTo(String value) {
            addCriterion("tailpage =", value, "tailpage");
            return (Criteria) this;
        }

        public Criteria andTailpageNotEqualTo(String value) {
            addCriterion("tailpage <>", value, "tailpage");
            return (Criteria) this;
        }

        public Criteria andTailpageGreaterThan(String value) {
            addCriterion("tailpage >", value, "tailpage");
            return (Criteria) this;
        }

        public Criteria andTailpageGreaterThanOrEqualTo(String value) {
            addCriterion("tailpage >=", value, "tailpage");
            return (Criteria) this;
        }

        public Criteria andTailpageLessThan(String value) {
            addCriterion("tailpage <", value, "tailpage");
            return (Criteria) this;
        }

        public Criteria andTailpageLessThanOrEqualTo(String value) {
            addCriterion("tailpage <=", value, "tailpage");
            return (Criteria) this;
        }

        public Criteria andTailpageLike(String value) {
            addCriterion("tailpage like", value, "tailpage");
            return (Criteria) this;
        }

        public Criteria andTailpageNotLike(String value) {
            addCriterion("tailpage not like", value, "tailpage");
            return (Criteria) this;
        }

        public Criteria andTailpageIn(List<String> values) {
            addCriterion("tailpage in", values, "tailpage");
            return (Criteria) this;
        }

        public Criteria andTailpageNotIn(List<String> values) {
            addCriterion("tailpage not in", values, "tailpage");
            return (Criteria) this;
        }

        public Criteria andTailpageBetween(String value1, String value2) {
            addCriterion("tailpage between", value1, value2, "tailpage");
            return (Criteria) this;
        }

        public Criteria andTailpageNotBetween(String value1, String value2) {
            addCriterion("tailpage not between", value1, value2, "tailpage");
            return (Criteria) this;
        }

        public Criteria andPictrueIsNull() {
            addCriterion("pictrue is null");
            return (Criteria) this;
        }

        public Criteria andPictrueIsNotNull() {
            addCriterion("pictrue is not null");
            return (Criteria) this;
        }

        public Criteria andPictrueEqualTo(String value) {
            addCriterion("pictrue =", value, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueNotEqualTo(String value) {
            addCriterion("pictrue <>", value, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueGreaterThan(String value) {
            addCriterion("pictrue >", value, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueGreaterThanOrEqualTo(String value) {
            addCriterion("pictrue >=", value, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueLessThan(String value) {
            addCriterion("pictrue <", value, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueLessThanOrEqualTo(String value) {
            addCriterion("pictrue <=", value, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueLike(String value) {
            addCriterion("pictrue like", value, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueNotLike(String value) {
            addCriterion("pictrue not like", value, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueIn(List<String> values) {
            addCriterion("pictrue in", values, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueNotIn(List<String> values) {
            addCriterion("pictrue not in", values, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueBetween(String value1, String value2) {
            addCriterion("pictrue between", value1, value2, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueNotBetween(String value1, String value2) {
            addCriterion("pictrue not between", value1, value2, "pictrue");
            return (Criteria) this;
        }

        public Criteria andDescripIsNull() {
            addCriterion("descrip is null");
            return (Criteria) this;
        }

        public Criteria andDescripIsNotNull() {
            addCriterion("descrip is not null");
            return (Criteria) this;
        }

        public Criteria andDescripEqualTo(String value) {
            addCriterion("descrip =", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripNotEqualTo(String value) {
            addCriterion("descrip <>", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripGreaterThan(String value) {
            addCriterion("descrip >", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripGreaterThanOrEqualTo(String value) {
            addCriterion("descrip >=", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripLessThan(String value) {
            addCriterion("descrip <", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripLessThanOrEqualTo(String value) {
            addCriterion("descrip <=", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripLike(String value) {
            addCriterion("descrip like", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripNotLike(String value) {
            addCriterion("descrip not like", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripIn(List<String> values) {
            addCriterion("descrip in", values, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripNotIn(List<String> values) {
            addCriterion("descrip not in", values, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripBetween(String value1, String value2) {
            addCriterion("descrip between", value1, value2, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripNotBetween(String value1, String value2) {
            addCriterion("descrip not between", value1, value2, "descrip");
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