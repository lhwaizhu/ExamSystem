package com.internet.cms.model;

import java.util.ArrayList;
import java.util.List;

public class JudgeQuestionExample extends PageInfo{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table judge_question
     *
     * @mbggenerated Mon Apr 24 19:15:38 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table judge_question
     *
     * @mbggenerated Mon Apr 24 19:15:38 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table judge_question
     *
     * @mbggenerated Mon Apr 24 19:15:38 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judge_question
     *
     * @mbggenerated Mon Apr 24 19:15:38 CST 2017
     */
    public JudgeQuestionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judge_question
     *
     * @mbggenerated Mon Apr 24 19:15:38 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judge_question
     *
     * @mbggenerated Mon Apr 24 19:15:38 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judge_question
     *
     * @mbggenerated Mon Apr 24 19:15:38 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judge_question
     *
     * @mbggenerated Mon Apr 24 19:15:38 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judge_question
     *
     * @mbggenerated Mon Apr 24 19:15:38 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judge_question
     *
     * @mbggenerated Mon Apr 24 19:15:38 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judge_question
     *
     * @mbggenerated Mon Apr 24 19:15:38 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judge_question
     *
     * @mbggenerated Mon Apr 24 19:15:38 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judge_question
     *
     * @mbggenerated Mon Apr 24 19:15:38 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judge_question
     *
     * @mbggenerated Mon Apr 24 19:15:38 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table judge_question
     *
     * @mbggenerated Mon Apr 24 19:15:38 CST 2017
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

        public Criteria andQuestionIdIsNull() {
            addCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Integer value) {
            addCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Integer value) {
            addCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Integer value) {
            addCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Integer value) {
            addCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Integer> values) {
            addCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Integer> values) {
            addCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("question_id not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionNameIsNull() {
            addCriterion("question_name is null");
            return (Criteria) this;
        }

        public Criteria andQuestionNameIsNotNull() {
            addCriterion("question_name is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionNameEqualTo(String value) {
            addCriterion("question_name =", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotEqualTo(String value) {
            addCriterion("question_name <>", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameGreaterThan(String value) {
            addCriterion("question_name >", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameGreaterThanOrEqualTo(String value) {
            addCriterion("question_name >=", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameLessThan(String value) {
            addCriterion("question_name <", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameLessThanOrEqualTo(String value) {
            addCriterion("question_name <=", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameLike(String value) {
            addCriterion("question_name like", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotLike(String value) {
            addCriterion("question_name not like", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameIn(List<String> values) {
            addCriterion("question_name in", values, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotIn(List<String> values) {
            addCriterion("question_name not in", values, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameBetween(String value1, String value2) {
            addCriterion("question_name between", value1, value2, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotBetween(String value1, String value2) {
            addCriterion("question_name not between", value1, value2, "questionName");
            return (Criteria) this;
        }

        public Criteria andCorrectAnswerIsNull() {
            addCriterion("correct_answer is null");
            return (Criteria) this;
        }

        public Criteria andCorrectAnswerIsNotNull() {
            addCriterion("correct_answer is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectAnswerEqualTo(String value) {
            addCriterion("correct_answer =", value, "correctAnswer");
            return (Criteria) this;
        }

        public Criteria andCorrectAnswerNotEqualTo(String value) {
            addCriterion("correct_answer <>", value, "correctAnswer");
            return (Criteria) this;
        }

        public Criteria andCorrectAnswerGreaterThan(String value) {
            addCriterion("correct_answer >", value, "correctAnswer");
            return (Criteria) this;
        }

        public Criteria andCorrectAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("correct_answer >=", value, "correctAnswer");
            return (Criteria) this;
        }

        public Criteria andCorrectAnswerLessThan(String value) {
            addCriterion("correct_answer <", value, "correctAnswer");
            return (Criteria) this;
        }

        public Criteria andCorrectAnswerLessThanOrEqualTo(String value) {
            addCriterion("correct_answer <=", value, "correctAnswer");
            return (Criteria) this;
        }

        public Criteria andCorrectAnswerLike(String value) {
            addCriterion("correct_answer like", value, "correctAnswer");
            return (Criteria) this;
        }

        public Criteria andCorrectAnswerNotLike(String value) {
            addCriterion("correct_answer not like", value, "correctAnswer");
            return (Criteria) this;
        }

        public Criteria andCorrectAnswerIn(List<String> values) {
            addCriterion("correct_answer in", values, "correctAnswer");
            return (Criteria) this;
        }

        public Criteria andCorrectAnswerNotIn(List<String> values) {
            addCriterion("correct_answer not in", values, "correctAnswer");
            return (Criteria) this;
        }

        public Criteria andCorrectAnswerBetween(String value1, String value2) {
            addCriterion("correct_answer between", value1, value2, "correctAnswer");
            return (Criteria) this;
        }

        public Criteria andCorrectAnswerNotBetween(String value1, String value2) {
            addCriterion("correct_answer not between", value1, value2, "correctAnswer");
            return (Criteria) this;
        }

        public Criteria andPointIdIsNull() {
            addCriterion("point_id is null");
            return (Criteria) this;
        }

        public Criteria andPointIdIsNotNull() {
            addCriterion("point_id is not null");
            return (Criteria) this;
        }

        public Criteria andPointIdEqualTo(Integer value) {
            addCriterion("point_id =", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotEqualTo(Integer value) {
            addCriterion("point_id <>", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdGreaterThan(Integer value) {
            addCriterion("point_id >", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_id >=", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdLessThan(Integer value) {
            addCriterion("point_id <", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdLessThanOrEqualTo(Integer value) {
            addCriterion("point_id <=", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdIn(List<Integer> values) {
            addCriterion("point_id in", values, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotIn(List<Integer> values) {
            addCriterion("point_id not in", values, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdBetween(Integer value1, Integer value2) {
            addCriterion("point_id between", value1, value2, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotBetween(Integer value1, Integer value2) {
            addCriterion("point_id not between", value1, value2, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointNameIsNull() {
            addCriterion("point_name is null");
            return (Criteria) this;
        }

        public Criteria andPointNameIsNotNull() {
            addCriterion("point_name is not null");
            return (Criteria) this;
        }

        public Criteria andPointNameEqualTo(String value) {
            addCriterion("point_name =", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameNotEqualTo(String value) {
            addCriterion("point_name <>", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameGreaterThan(String value) {
            addCriterion("point_name >", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameGreaterThanOrEqualTo(String value) {
            addCriterion("point_name >=", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameLessThan(String value) {
            addCriterion("point_name <", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameLessThanOrEqualTo(String value) {
            addCriterion("point_name <=", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameLike(String value) {
            addCriterion("point_name like", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameNotLike(String value) {
            addCriterion("point_name not like", value, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameIn(List<String> values) {
            addCriterion("point_name in", values, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameNotIn(List<String> values) {
            addCriterion("point_name not in", values, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameBetween(String value1, String value2) {
            addCriterion("point_name between", value1, value2, "pointName");
            return (Criteria) this;
        }

        public Criteria andPointNameNotBetween(String value1, String value2) {
            addCriterion("point_name not between", value1, value2, "pointName");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Integer value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Integer value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Integer value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Integer value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Integer> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Integer> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNull() {
            addCriterion("subject_name is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNotNull() {
            addCriterion("subject_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameEqualTo(String value) {
            addCriterion("subject_name =", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotEqualTo(String value) {
            addCriterion("subject_name <>", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThan(String value) {
            addCriterion("subject_name >", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_name >=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThan(String value) {
            addCriterion("subject_name <", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("subject_name <=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLike(String value) {
            addCriterion("subject_name like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotLike(String value) {
            addCriterion("subject_name not like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIn(List<String> values) {
            addCriterion("subject_name in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotIn(List<String> values) {
            addCriterion("subject_name not in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameBetween(String value1, String value2) {
            addCriterion("subject_name between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotBetween(String value1, String value2) {
            addCriterion("subject_name not between", value1, value2, "subjectName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table judge_question
     *
     * @mbggenerated do_not_delete_during_merge Mon Apr 24 19:15:38 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table judge_question
     *
     * @mbggenerated Mon Apr 24 19:15:38 CST 2017
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