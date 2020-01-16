/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.interfaces;


import java.io.Serializable;
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
public interface IS4NoPrimary extends Serializable {

    /**
     * Setter for <code>learn-jooq.s4_no_primary.column1</code>. 测试列1
     */
    public void setColumn1(String value);

    /**
     * Getter for <code>learn-jooq.s4_no_primary.column1</code>. 测试列1
     */
    public String getColumn1();

    /**
     * Setter for <code>learn-jooq.s4_no_primary.column2</code>. 测试列2
     */
    public void setColumn2(String value);

    /**
     * Getter for <code>learn-jooq.s4_no_primary.column2</code>. 测试列2
     */
    public String getColumn2();

    /**
     * Setter for <code>learn-jooq.s4_no_primary.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value);

    /**
     * Getter for <code>learn-jooq.s4_no_primary.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime();

    /**
     * Setter for <code>learn-jooq.s4_no_primary.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value);

    /**
     * Getter for <code>learn-jooq.s4_no_primary.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IS4NoPrimary
     */
    public void from(com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.interfaces.IS4NoPrimary from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IS4NoPrimary
     */
    public <E extends com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.interfaces.IS4NoPrimary> E into(E into);
}
