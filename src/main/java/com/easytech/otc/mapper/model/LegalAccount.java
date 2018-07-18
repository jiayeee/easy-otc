package com.easytech.otc.mapper.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "legal_account")
public class LegalAccount {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 收款方式，0-支付宝，1-微信，2-银行卡
     */
    private Boolean mode;

    /**
     * 账号
     */
    private String account;

    /**
     * 姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 个人说明
     */
    private String memo;

    /**
     * 记录创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return uid - 用户id
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置用户id
     *
     * @param uid 用户id
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取收款方式，0-支付宝，1-微信，2-银行卡
     *
     * @return mode - 收款方式，0-支付宝，1-微信，2-银行卡
     */
    public Boolean getMode() {
        return mode;
    }

    /**
     * 设置收款方式，0-支付宝，1-微信，2-银行卡
     *
     * @param mode 收款方式，0-支付宝，1-微信，2-银行卡
     */
    public void setMode(Boolean mode) {
        this.mode = mode;
    }

    /**
     * 获取账号
     *
     * @return account - 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号
     *
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取姓名
     *
     * @return real_name - 姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置姓名
     *
     * @param realName 姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取个人说明
     *
     * @return memo - 个人说明
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置个人说明
     *
     * @param memo 个人说明
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 获取记录创建时间
     *
     * @return create_time - 记录创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置记录创建时间
     *
     * @param createTime 记录创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}