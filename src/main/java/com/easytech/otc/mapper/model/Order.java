package com.easytech.otc.mapper.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Order {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 订单号
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 订单备注号
     */
    @Column(name = "memo_code")
    private String memoCode;

    /**
     * 订单类型，0-买单，1-卖单
     */
    @Column(name = "order_type")
    private Boolean orderType;

    /**
     * 广告id
     */
    @Column(name = "ad_id")
    private Integer adId;

    /**
     * 币种
     */
    @Column(name = "coin_type")
    private Boolean coinType;

    /**
     * 交易数量
     */
    private BigDecimal amount;

    /**
     * 法币单价，单位：元
     */
    @Column(name = "legal_price")
    private BigDecimal legalPrice;

    /**
     * 法币总价
     */
    @Column(name = "total_legal_price")
    private BigDecimal totalLegalPrice;

    /**
     * 支付状态，0-未支付，1-已支付
     */
    @Column(name = "payment_status")
    private Boolean paymentStatus;

    /**
     * 订单状态，0-进行中，1-已完成，2-已取消
     */
    @Column(name = "order_status")
    private Boolean orderStatus;

    /**
     * 支付时间
     */
    @Column(name = "payment_time")
    private Date paymentTime;

    /**
     * 确认放币时间
     */
    @Column(name = "coin_Release_time")
    private Date coinReleaseTime;

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
     * 获取订单号
     *
     * @return order_id - 订单号
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单号
     *
     * @param orderId 订单号
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
     * 获取订单备注号
     *
     * @return memo_code - 订单备注号
     */
    public String getMemoCode() {
        return memoCode;
    }

    /**
     * 设置订单备注号
     *
     * @param memoCode 订单备注号
     */
    public void setMemoCode(String memoCode) {
        this.memoCode = memoCode;
    }

    /**
     * 获取订单类型，0-买单，1-卖单
     *
     * @return order_type - 订单类型，0-买单，1-卖单
     */
    public Boolean getOrderType() {
        return orderType;
    }

    /**
     * 设置订单类型，0-买单，1-卖单
     *
     * @param orderType 订单类型，0-买单，1-卖单
     */
    public void setOrderType(Boolean orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取广告id
     *
     * @return ad_id - 广告id
     */
    public Integer getAdId() {
        return adId;
    }

    /**
     * 设置广告id
     *
     * @param adId 广告id
     */
    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    /**
     * 获取币种
     *
     * @return coin_type - 币种
     */
    public Boolean getCoinType() {
        return coinType;
    }

    /**
     * 设置币种
     *
     * @param coinType 币种
     */
    public void setCoinType(Boolean coinType) {
        this.coinType = coinType;
    }

    /**
     * 获取交易数量
     *
     * @return amount - 交易数量
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置交易数量
     *
     * @param amount 交易数量
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取法币单价，单位：元
     *
     * @return legal_price - 法币单价，单位：元
     */
    public BigDecimal getLegalPrice() {
        return legalPrice;
    }

    /**
     * 设置法币单价，单位：元
     *
     * @param legalPrice 法币单价，单位：元
     */
    public void setLegalPrice(BigDecimal legalPrice) {
        this.legalPrice = legalPrice;
    }

    /**
     * 获取法币总价
     *
     * @return total_legal_price - 法币总价
     */
    public BigDecimal getTotalLegalPrice() {
        return totalLegalPrice;
    }

    /**
     * 设置法币总价
     *
     * @param totalLegalPrice 法币总价
     */
    public void setTotalLegalPrice(BigDecimal totalLegalPrice) {
        this.totalLegalPrice = totalLegalPrice;
    }

    /**
     * 获取支付状态，0-未支付，1-已支付
     *
     * @return payment_status - 支付状态，0-未支付，1-已支付
     */
    public Boolean getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * 设置支付状态，0-未支付，1-已支付
     *
     * @param paymentStatus 支付状态，0-未支付，1-已支付
     */
    public void setPaymentStatus(Boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    /**
     * 获取订单状态，0-进行中，1-已完成，2-已取消
     *
     * @return order_status - 订单状态，0-进行中，1-已完成，2-已取消
     */
    public Boolean getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态，0-进行中，1-已完成，2-已取消
     *
     * @param orderStatus 订单状态，0-进行中，1-已完成，2-已取消
     */
    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取支付时间
     *
     * @return payment_time - 支付时间
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * 设置支付时间
     *
     * @param paymentTime 支付时间
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * 获取确认放币时间
     *
     * @return coin_Release_time - 确认放币时间
     */
    public Date getCoinReleaseTime() {
        return coinReleaseTime;
    }

    /**
     * 设置确认放币时间
     *
     * @param coinReleaseTime 确认放币时间
     */
    public void setCoinReleaseTime(Date coinReleaseTime) {
        this.coinReleaseTime = coinReleaseTime;
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