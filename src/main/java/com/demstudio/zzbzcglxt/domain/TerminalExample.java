package com.demstudio.zzbzcglxt.domain;

import java.util.ArrayList;
import java.util.List;

public class TerminalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TerminalExample() {
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

        public Criteria andTerminalIdIsNull() {
            addCriterion("TERMINAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIsNotNull() {
            addCriterion("TERMINAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdEqualTo(String value) {
            addCriterion("TERMINAL_ID =", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotEqualTo(String value) {
            addCriterion("TERMINAL_ID <>", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThan(String value) {
            addCriterion("TERMINAL_ID >", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_ID >=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThan(String value) {
            addCriterion("TERMINAL_ID <", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_ID <=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLike(String value) {
            addCriterion("TERMINAL_ID like", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotLike(String value) {
            addCriterion("TERMINAL_ID not like", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIn(List<String> values) {
            addCriterion("TERMINAL_ID in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotIn(List<String> values) {
            addCriterion("TERMINAL_ID not in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdBetween(String value1, String value2) {
            addCriterion("TERMINAL_ID between", value1, value2, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_ID not between", value1, value2, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalNameIsNull() {
            addCriterion("TERMINAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTerminalNameIsNotNull() {
            addCriterion("TERMINAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalNameEqualTo(String value) {
            addCriterion("TERMINAL_NAME =", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameNotEqualTo(String value) {
            addCriterion("TERMINAL_NAME <>", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameGreaterThan(String value) {
            addCriterion("TERMINAL_NAME >", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_NAME >=", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameLessThan(String value) {
            addCriterion("TERMINAL_NAME <", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_NAME <=", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameLike(String value) {
            addCriterion("TERMINAL_NAME like", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameNotLike(String value) {
            addCriterion("TERMINAL_NAME not like", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameIn(List<String> values) {
            addCriterion("TERMINAL_NAME in", values, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameNotIn(List<String> values) {
            addCriterion("TERMINAL_NAME not in", values, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameBetween(String value1, String value2) {
            addCriterion("TERMINAL_NAME between", value1, value2, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_NAME not between", value1, value2, "terminalName");
            return (Criteria) this;
        }

        public Criteria andIp0IsNull() {
            addCriterion("IP_0 is null");
            return (Criteria) this;
        }

        public Criteria andIp0IsNotNull() {
            addCriterion("IP_0 is not null");
            return (Criteria) this;
        }

        public Criteria andIp0EqualTo(Integer value) {
            addCriterion("IP_0 =", value, "ip0");
            return (Criteria) this;
        }

        public Criteria andIp0NotEqualTo(Integer value) {
            addCriterion("IP_0 <>", value, "ip0");
            return (Criteria) this;
        }

        public Criteria andIp0GreaterThan(Integer value) {
            addCriterion("IP_0 >", value, "ip0");
            return (Criteria) this;
        }

        public Criteria andIp0GreaterThanOrEqualTo(Integer value) {
            addCriterion("IP_0 >=", value, "ip0");
            return (Criteria) this;
        }

        public Criteria andIp0LessThan(Integer value) {
            addCriterion("IP_0 <", value, "ip0");
            return (Criteria) this;
        }

        public Criteria andIp0LessThanOrEqualTo(Integer value) {
            addCriterion("IP_0 <=", value, "ip0");
            return (Criteria) this;
        }

        public Criteria andIp0In(List<Integer> values) {
            addCriterion("IP_0 in", values, "ip0");
            return (Criteria) this;
        }

        public Criteria andIp0NotIn(List<Integer> values) {
            addCriterion("IP_0 not in", values, "ip0");
            return (Criteria) this;
        }

        public Criteria andIp0Between(Integer value1, Integer value2) {
            addCriterion("IP_0 between", value1, value2, "ip0");
            return (Criteria) this;
        }

        public Criteria andIp0NotBetween(Integer value1, Integer value2) {
            addCriterion("IP_0 not between", value1, value2, "ip0");
            return (Criteria) this;
        }

        public Criteria andIp1IsNull() {
            addCriterion("IP_1 is null");
            return (Criteria) this;
        }

        public Criteria andIp1IsNotNull() {
            addCriterion("IP_1 is not null");
            return (Criteria) this;
        }

        public Criteria andIp1EqualTo(Integer value) {
            addCriterion("IP_1 =", value, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp1NotEqualTo(Integer value) {
            addCriterion("IP_1 <>", value, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp1GreaterThan(Integer value) {
            addCriterion("IP_1 >", value, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp1GreaterThanOrEqualTo(Integer value) {
            addCriterion("IP_1 >=", value, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp1LessThan(Integer value) {
            addCriterion("IP_1 <", value, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp1LessThanOrEqualTo(Integer value) {
            addCriterion("IP_1 <=", value, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp1In(List<Integer> values) {
            addCriterion("IP_1 in", values, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp1NotIn(List<Integer> values) {
            addCriterion("IP_1 not in", values, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp1Between(Integer value1, Integer value2) {
            addCriterion("IP_1 between", value1, value2, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp1NotBetween(Integer value1, Integer value2) {
            addCriterion("IP_1 not between", value1, value2, "ip1");
            return (Criteria) this;
        }

        public Criteria andIp2IsNull() {
            addCriterion("IP_2 is null");
            return (Criteria) this;
        }

        public Criteria andIp2IsNotNull() {
            addCriterion("IP_2 is not null");
            return (Criteria) this;
        }

        public Criteria andIp2EqualTo(Integer value) {
            addCriterion("IP_2 =", value, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp2NotEqualTo(Integer value) {
            addCriterion("IP_2 <>", value, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp2GreaterThan(Integer value) {
            addCriterion("IP_2 >", value, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp2GreaterThanOrEqualTo(Integer value) {
            addCriterion("IP_2 >=", value, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp2LessThan(Integer value) {
            addCriterion("IP_2 <", value, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp2LessThanOrEqualTo(Integer value) {
            addCriterion("IP_2 <=", value, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp2In(List<Integer> values) {
            addCriterion("IP_2 in", values, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp2NotIn(List<Integer> values) {
            addCriterion("IP_2 not in", values, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp2Between(Integer value1, Integer value2) {
            addCriterion("IP_2 between", value1, value2, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp2NotBetween(Integer value1, Integer value2) {
            addCriterion("IP_2 not between", value1, value2, "ip2");
            return (Criteria) this;
        }

        public Criteria andIp3IsNull() {
            addCriterion("IP_3 is null");
            return (Criteria) this;
        }

        public Criteria andIp3IsNotNull() {
            addCriterion("IP_3 is not null");
            return (Criteria) this;
        }

        public Criteria andIp3EqualTo(Integer value) {
            addCriterion("IP_3 =", value, "ip3");
            return (Criteria) this;
        }

        public Criteria andIp3NotEqualTo(Integer value) {
            addCriterion("IP_3 <>", value, "ip3");
            return (Criteria) this;
        }

        public Criteria andIp3GreaterThan(Integer value) {
            addCriterion("IP_3 >", value, "ip3");
            return (Criteria) this;
        }

        public Criteria andIp3GreaterThanOrEqualTo(Integer value) {
            addCriterion("IP_3 >=", value, "ip3");
            return (Criteria) this;
        }

        public Criteria andIp3LessThan(Integer value) {
            addCriterion("IP_3 <", value, "ip3");
            return (Criteria) this;
        }

        public Criteria andIp3LessThanOrEqualTo(Integer value) {
            addCriterion("IP_3 <=", value, "ip3");
            return (Criteria) this;
        }

        public Criteria andIp3In(List<Integer> values) {
            addCriterion("IP_3 in", values, "ip3");
            return (Criteria) this;
        }

        public Criteria andIp3NotIn(List<Integer> values) {
            addCriterion("IP_3 not in", values, "ip3");
            return (Criteria) this;
        }

        public Criteria andIp3Between(Integer value1, Integer value2) {
            addCriterion("IP_3 between", value1, value2, "ip3");
            return (Criteria) this;
        }

        public Criteria andIp3NotBetween(Integer value1, Integer value2) {
            addCriterion("IP_3 not between", value1, value2, "ip3");
            return (Criteria) this;
        }

        public Criteria andTerminalDescIsNull() {
            addCriterion("TERMINAL_DESC is null");
            return (Criteria) this;
        }

        public Criteria andTerminalDescIsNotNull() {
            addCriterion("TERMINAL_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalDescEqualTo(String value) {
            addCriterion("TERMINAL_DESC =", value, "terminalDesc");
            return (Criteria) this;
        }

        public Criteria andTerminalDescNotEqualTo(String value) {
            addCriterion("TERMINAL_DESC <>", value, "terminalDesc");
            return (Criteria) this;
        }

        public Criteria andTerminalDescGreaterThan(String value) {
            addCriterion("TERMINAL_DESC >", value, "terminalDesc");
            return (Criteria) this;
        }

        public Criteria andTerminalDescGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_DESC >=", value, "terminalDesc");
            return (Criteria) this;
        }

        public Criteria andTerminalDescLessThan(String value) {
            addCriterion("TERMINAL_DESC <", value, "terminalDesc");
            return (Criteria) this;
        }

        public Criteria andTerminalDescLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_DESC <=", value, "terminalDesc");
            return (Criteria) this;
        }

        public Criteria andTerminalDescLike(String value) {
            addCriterion("TERMINAL_DESC like", value, "terminalDesc");
            return (Criteria) this;
        }

        public Criteria andTerminalDescNotLike(String value) {
            addCriterion("TERMINAL_DESC not like", value, "terminalDesc");
            return (Criteria) this;
        }

        public Criteria andTerminalDescIn(List<String> values) {
            addCriterion("TERMINAL_DESC in", values, "terminalDesc");
            return (Criteria) this;
        }

        public Criteria andTerminalDescNotIn(List<String> values) {
            addCriterion("TERMINAL_DESC not in", values, "terminalDesc");
            return (Criteria) this;
        }

        public Criteria andTerminalDescBetween(String value1, String value2) {
            addCriterion("TERMINAL_DESC between", value1, value2, "terminalDesc");
            return (Criteria) this;
        }

        public Criteria andTerminalDescNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_DESC not between", value1, value2, "terminalDesc");
            return (Criteria) this;
        }

        public Criteria andTerminalSystemIsNull() {
            addCriterion("TERMINAL_SYSTEM is null");
            return (Criteria) this;
        }

        public Criteria andTerminalSystemIsNotNull() {
            addCriterion("TERMINAL_SYSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalSystemEqualTo(String value) {
            addCriterion("TERMINAL_SYSTEM =", value, "terminalSystem");
            return (Criteria) this;
        }

        public Criteria andTerminalSystemNotEqualTo(String value) {
            addCriterion("TERMINAL_SYSTEM <>", value, "terminalSystem");
            return (Criteria) this;
        }

        public Criteria andTerminalSystemGreaterThan(String value) {
            addCriterion("TERMINAL_SYSTEM >", value, "terminalSystem");
            return (Criteria) this;
        }

        public Criteria andTerminalSystemGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_SYSTEM >=", value, "terminalSystem");
            return (Criteria) this;
        }

        public Criteria andTerminalSystemLessThan(String value) {
            addCriterion("TERMINAL_SYSTEM <", value, "terminalSystem");
            return (Criteria) this;
        }

        public Criteria andTerminalSystemLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_SYSTEM <=", value, "terminalSystem");
            return (Criteria) this;
        }

        public Criteria andTerminalSystemLike(String value) {
            addCriterion("TERMINAL_SYSTEM like", value, "terminalSystem");
            return (Criteria) this;
        }

        public Criteria andTerminalSystemNotLike(String value) {
            addCriterion("TERMINAL_SYSTEM not like", value, "terminalSystem");
            return (Criteria) this;
        }

        public Criteria andTerminalSystemIn(List<String> values) {
            addCriterion("TERMINAL_SYSTEM in", values, "terminalSystem");
            return (Criteria) this;
        }

        public Criteria andTerminalSystemNotIn(List<String> values) {
            addCriterion("TERMINAL_SYSTEM not in", values, "terminalSystem");
            return (Criteria) this;
        }

        public Criteria andTerminalSystemBetween(String value1, String value2) {
            addCriterion("TERMINAL_SYSTEM between", value1, value2, "terminalSystem");
            return (Criteria) this;
        }

        public Criteria andTerminalSystemNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_SYSTEM not between", value1, value2, "terminalSystem");
            return (Criteria) this;
        }

        public Criteria andTerminalOwnerIsNull() {
            addCriterion("TERMINAL_OWNER is null");
            return (Criteria) this;
        }

        public Criteria andTerminalOwnerIsNotNull() {
            addCriterion("TERMINAL_OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalOwnerEqualTo(String value) {
            addCriterion("TERMINAL_OWNER =", value, "terminalOwner");
            return (Criteria) this;
        }

        public Criteria andTerminalOwnerNotEqualTo(String value) {
            addCriterion("TERMINAL_OWNER <>", value, "terminalOwner");
            return (Criteria) this;
        }

        public Criteria andTerminalOwnerGreaterThan(String value) {
            addCriterion("TERMINAL_OWNER >", value, "terminalOwner");
            return (Criteria) this;
        }

        public Criteria andTerminalOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_OWNER >=", value, "terminalOwner");
            return (Criteria) this;
        }

        public Criteria andTerminalOwnerLessThan(String value) {
            addCriterion("TERMINAL_OWNER <", value, "terminalOwner");
            return (Criteria) this;
        }

        public Criteria andTerminalOwnerLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_OWNER <=", value, "terminalOwner");
            return (Criteria) this;
        }

        public Criteria andTerminalOwnerLike(String value) {
            addCriterion("TERMINAL_OWNER like", value, "terminalOwner");
            return (Criteria) this;
        }

        public Criteria andTerminalOwnerNotLike(String value) {
            addCriterion("TERMINAL_OWNER not like", value, "terminalOwner");
            return (Criteria) this;
        }

        public Criteria andTerminalOwnerIn(List<String> values) {
            addCriterion("TERMINAL_OWNER in", values, "terminalOwner");
            return (Criteria) this;
        }

        public Criteria andTerminalOwnerNotIn(List<String> values) {
            addCriterion("TERMINAL_OWNER not in", values, "terminalOwner");
            return (Criteria) this;
        }

        public Criteria andTerminalOwnerBetween(String value1, String value2) {
            addCriterion("TERMINAL_OWNER between", value1, value2, "terminalOwner");
            return (Criteria) this;
        }

        public Criteria andTerminalOwnerNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_OWNER not between", value1, value2, "terminalOwner");
            return (Criteria) this;
        }

        public Criteria andTerminalSegmentIsNull() {
            addCriterion("TERMINAL_SEGMENT is null");
            return (Criteria) this;
        }

        public Criteria andTerminalSegmentIsNotNull() {
            addCriterion("TERMINAL_SEGMENT is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalSegmentEqualTo(String value) {
            addCriterion("TERMINAL_SEGMENT =", value, "terminalSegment");
            return (Criteria) this;
        }

        public Criteria andTerminalSegmentNotEqualTo(String value) {
            addCriterion("TERMINAL_SEGMENT <>", value, "terminalSegment");
            return (Criteria) this;
        }

        public Criteria andTerminalSegmentGreaterThan(String value) {
            addCriterion("TERMINAL_SEGMENT >", value, "terminalSegment");
            return (Criteria) this;
        }

        public Criteria andTerminalSegmentGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_SEGMENT >=", value, "terminalSegment");
            return (Criteria) this;
        }

        public Criteria andTerminalSegmentLessThan(String value) {
            addCriterion("TERMINAL_SEGMENT <", value, "terminalSegment");
            return (Criteria) this;
        }

        public Criteria andTerminalSegmentLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_SEGMENT <=", value, "terminalSegment");
            return (Criteria) this;
        }

        public Criteria andTerminalSegmentLike(String value) {
            addCriterion("TERMINAL_SEGMENT like", value, "terminalSegment");
            return (Criteria) this;
        }

        public Criteria andTerminalSegmentNotLike(String value) {
            addCriterion("TERMINAL_SEGMENT not like", value, "terminalSegment");
            return (Criteria) this;
        }

        public Criteria andTerminalSegmentIn(List<String> values) {
            addCriterion("TERMINAL_SEGMENT in", values, "terminalSegment");
            return (Criteria) this;
        }

        public Criteria andTerminalSegmentNotIn(List<String> values) {
            addCriterion("TERMINAL_SEGMENT not in", values, "terminalSegment");
            return (Criteria) this;
        }

        public Criteria andTerminalSegmentBetween(String value1, String value2) {
            addCriterion("TERMINAL_SEGMENT between", value1, value2, "terminalSegment");
            return (Criteria) this;
        }

        public Criteria andTerminalSegmentNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_SEGMENT not between", value1, value2, "terminalSegment");
            return (Criteria) this;
        }

        public Criteria andTerminalRoomIsNull() {
            addCriterion("TERMINAL_ROOM is null");
            return (Criteria) this;
        }

        public Criteria andTerminalRoomIsNotNull() {
            addCriterion("TERMINAL_ROOM is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalRoomEqualTo(String value) {
            addCriterion("TERMINAL_ROOM =", value, "terminalRoom");
            return (Criteria) this;
        }

        public Criteria andTerminalRoomNotEqualTo(String value) {
            addCriterion("TERMINAL_ROOM <>", value, "terminalRoom");
            return (Criteria) this;
        }

        public Criteria andTerminalRoomGreaterThan(String value) {
            addCriterion("TERMINAL_ROOM >", value, "terminalRoom");
            return (Criteria) this;
        }

        public Criteria andTerminalRoomGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_ROOM >=", value, "terminalRoom");
            return (Criteria) this;
        }

        public Criteria andTerminalRoomLessThan(String value) {
            addCriterion("TERMINAL_ROOM <", value, "terminalRoom");
            return (Criteria) this;
        }

        public Criteria andTerminalRoomLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_ROOM <=", value, "terminalRoom");
            return (Criteria) this;
        }

        public Criteria andTerminalRoomLike(String value) {
            addCriterion("TERMINAL_ROOM like", value, "terminalRoom");
            return (Criteria) this;
        }

        public Criteria andTerminalRoomNotLike(String value) {
            addCriterion("TERMINAL_ROOM not like", value, "terminalRoom");
            return (Criteria) this;
        }

        public Criteria andTerminalRoomIn(List<String> values) {
            addCriterion("TERMINAL_ROOM in", values, "terminalRoom");
            return (Criteria) this;
        }

        public Criteria andTerminalRoomNotIn(List<String> values) {
            addCriterion("TERMINAL_ROOM not in", values, "terminalRoom");
            return (Criteria) this;
        }

        public Criteria andTerminalRoomBetween(String value1, String value2) {
            addCriterion("TERMINAL_ROOM between", value1, value2, "terminalRoom");
            return (Criteria) this;
        }

        public Criteria andTerminalRoomNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_ROOM not between", value1, value2, "terminalRoom");
            return (Criteria) this;
        }

        public Criteria andTerminalSecrecyIsNull() {
            addCriterion("TERMINAL_SECRECY is null");
            return (Criteria) this;
        }

        public Criteria andTerminalSecrecyIsNotNull() {
            addCriterion("TERMINAL_SECRECY is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalSecrecyEqualTo(String value) {
            addCriterion("TERMINAL_SECRECY =", value, "terminalSecrecy");
            return (Criteria) this;
        }

        public Criteria andTerminalSecrecyNotEqualTo(String value) {
            addCriterion("TERMINAL_SECRECY <>", value, "terminalSecrecy");
            return (Criteria) this;
        }

        public Criteria andTerminalSecrecyGreaterThan(String value) {
            addCriterion("TERMINAL_SECRECY >", value, "terminalSecrecy");
            return (Criteria) this;
        }

        public Criteria andTerminalSecrecyGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_SECRECY >=", value, "terminalSecrecy");
            return (Criteria) this;
        }

        public Criteria andTerminalSecrecyLessThan(String value) {
            addCriterion("TERMINAL_SECRECY <", value, "terminalSecrecy");
            return (Criteria) this;
        }

        public Criteria andTerminalSecrecyLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_SECRECY <=", value, "terminalSecrecy");
            return (Criteria) this;
        }

        public Criteria andTerminalSecrecyLike(String value) {
            addCriterion("TERMINAL_SECRECY like", value, "terminalSecrecy");
            return (Criteria) this;
        }

        public Criteria andTerminalSecrecyNotLike(String value) {
            addCriterion("TERMINAL_SECRECY not like", value, "terminalSecrecy");
            return (Criteria) this;
        }

        public Criteria andTerminalSecrecyIn(List<String> values) {
            addCriterion("TERMINAL_SECRECY in", values, "terminalSecrecy");
            return (Criteria) this;
        }

        public Criteria andTerminalSecrecyNotIn(List<String> values) {
            addCriterion("TERMINAL_SECRECY not in", values, "terminalSecrecy");
            return (Criteria) this;
        }

        public Criteria andTerminalSecrecyBetween(String value1, String value2) {
            addCriterion("TERMINAL_SECRECY between", value1, value2, "terminalSecrecy");
            return (Criteria) this;
        }

        public Criteria andTerminalSecrecyNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_SECRECY not between", value1, value2, "terminalSecrecy");
            return (Criteria) this;
        }

        public Criteria andTerminalSwitchIsNull() {
            addCriterion("TERMINAL_SWITCH is null");
            return (Criteria) this;
        }

        public Criteria andTerminalSwitchIsNotNull() {
            addCriterion("TERMINAL_SWITCH is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalSwitchEqualTo(String value) {
            addCriterion("TERMINAL_SWITCH =", value, "terminalSwitch");
            return (Criteria) this;
        }

        public Criteria andTerminalSwitchNotEqualTo(String value) {
            addCriterion("TERMINAL_SWITCH <>", value, "terminalSwitch");
            return (Criteria) this;
        }

        public Criteria andTerminalSwitchGreaterThan(String value) {
            addCriterion("TERMINAL_SWITCH >", value, "terminalSwitch");
            return (Criteria) this;
        }

        public Criteria andTerminalSwitchGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_SWITCH >=", value, "terminalSwitch");
            return (Criteria) this;
        }

        public Criteria andTerminalSwitchLessThan(String value) {
            addCriterion("TERMINAL_SWITCH <", value, "terminalSwitch");
            return (Criteria) this;
        }

        public Criteria andTerminalSwitchLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_SWITCH <=", value, "terminalSwitch");
            return (Criteria) this;
        }

        public Criteria andTerminalSwitchLike(String value) {
            addCriterion("TERMINAL_SWITCH like", value, "terminalSwitch");
            return (Criteria) this;
        }

        public Criteria andTerminalSwitchNotLike(String value) {
            addCriterion("TERMINAL_SWITCH not like", value, "terminalSwitch");
            return (Criteria) this;
        }

        public Criteria andTerminalSwitchIn(List<String> values) {
            addCriterion("TERMINAL_SWITCH in", values, "terminalSwitch");
            return (Criteria) this;
        }

        public Criteria andTerminalSwitchNotIn(List<String> values) {
            addCriterion("TERMINAL_SWITCH not in", values, "terminalSwitch");
            return (Criteria) this;
        }

        public Criteria andTerminalSwitchBetween(String value1, String value2) {
            addCriterion("TERMINAL_SWITCH between", value1, value2, "terminalSwitch");
            return (Criteria) this;
        }

        public Criteria andTerminalSwitchNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_SWITCH not between", value1, value2, "terminalSwitch");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNull() {
            addCriterion("TERMINAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNotNull() {
            addCriterion("TERMINAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeEqualTo(String value) {
            addCriterion("TERMINAL_TYPE =", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotEqualTo(String value) {
            addCriterion("TERMINAL_TYPE <>", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThan(String value) {
            addCriterion("TERMINAL_TYPE >", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_TYPE >=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThan(String value) {
            addCriterion("TERMINAL_TYPE <", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_TYPE <=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLike(String value) {
            addCriterion("TERMINAL_TYPE like", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotLike(String value) {
            addCriterion("TERMINAL_TYPE not like", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIn(List<String> values) {
            addCriterion("TERMINAL_TYPE in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotIn(List<String> values) {
            addCriterion("TERMINAL_TYPE not in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeBetween(String value1, String value2) {
            addCriterion("TERMINAL_TYPE between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_TYPE not between", value1, value2, "terminalType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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