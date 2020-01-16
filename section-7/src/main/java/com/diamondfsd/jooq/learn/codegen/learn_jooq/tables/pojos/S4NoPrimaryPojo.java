/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.pojos;


import com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.interfaces.IS4NoPrimary;

import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class S4NoPrimaryPojo implements IS4NoPrimary {

    private static final long serialVersionUID = -2009360752;

    private String    column1;
    private String    column2;
    private Timestamp createTime;
    private Timestamp updateTime;

    public S4NoPrimaryPojo() {}

    public S4NoPrimaryPojo(IS4NoPrimary value) {
        this.column1 = value.getColumn1();
        this.column2 = value.getColumn2();
        this.createTime = value.getCreateTime();
        this.updateTime = value.getUpdateTime();
    }

    public S4NoPrimaryPojo(
        String    column1,
        String    column2,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.column1 = column1;
        this.column2 = column2;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    @Override
    public String getColumn1() {
        return this.column1;
    }

    @Override
    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    @Override
    public String getColumn2() {
        return this.column2;
    }

    @Override
    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    @Override
    public Timestamp getCreateTime() {
        return this.createTime;
    }

    @Override
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    @Override
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("S4NoPrimaryPojo (");

        sb.append(column1);
        sb.append(", ").append(column2);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IS4NoPrimary from) {
        setColumn1(from.getColumn1());
        setColumn2(from.getColumn2());
        setCreateTime(from.getCreateTime());
        setUpdateTime(from.getUpdateTime());
    }

    @Override
    public <E extends IS4NoPrimary> E into(E into) {
        into.from(this);
        return into;
    }
}
