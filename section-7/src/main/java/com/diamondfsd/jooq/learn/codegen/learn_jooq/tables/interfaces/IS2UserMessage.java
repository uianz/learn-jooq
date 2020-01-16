/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.interfaces;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 用户消息内容
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IS2UserMessage extends Serializable {

    /**
     * Setter for <code>learn-jooq.s2_user_message.id</code>.
     */
    public void setId(Integer value);

    /**
     * Getter for <code>learn-jooq.s2_user_message.id</code>.
     */
    public Integer getId();

    /**
     * Setter for <code>learn-jooq.s2_user_message.user_id</code>.
     */
    public void setUserId(Integer value);

    /**
     * Getter for <code>learn-jooq.s2_user_message.user_id</code>.
     */
    public Integer getUserId();

    /**
     * Setter for <code>learn-jooq.s2_user_message.message_title</code>. 消息标题
     */
    public void setMessageTitle(String value);

    /**
     * Getter for <code>learn-jooq.s2_user_message.message_title</code>. 消息标题
     */
    public String getMessageTitle();

    /**
     * Setter for <code>learn-jooq.s2_user_message.message_content</code>. 消息内容
     */
    public void setMessageContent(String value);

    /**
     * Getter for <code>learn-jooq.s2_user_message.message_content</code>. 消息内容
     */
    public String getMessageContent();

    /**
     * Setter for <code>learn-jooq.s2_user_message.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value);

    /**
     * Getter for <code>learn-jooq.s2_user_message.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime();

    /**
     * Setter for <code>learn-jooq.s2_user_message.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value);

    /**
     * Getter for <code>learn-jooq.s2_user_message.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IS2UserMessage
     */
    public void from(com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.interfaces.IS2UserMessage from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IS2UserMessage
     */
    public <E extends com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.interfaces.IS2UserMessage> E into(E into);
}
