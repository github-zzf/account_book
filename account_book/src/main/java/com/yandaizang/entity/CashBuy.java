package com.yandaizang.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zzf
 * @since 2020-01-07
 */
@TableName("cash_buy")
public class CashBuy extends Model<CashBuy> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 顾客Id
     */
	@TableField("client_id")
	private Integer clientId;
    /**
     * 交易金额
     */
	private String money;
    /**
     * 支付方式
     */
	@TableField("cash_type")
	private String cashType;
    /**
     * 交易积分
     */
	@TableField("cash_fen")
	private String cashFen;
    /**
     * 交易时间
     */
	@TableField("cash_time")
	private Date cashTime;
    /**
     * 交易状态（1正常9删除）
     */
	private String status;
    /**
     * 备注
     */
	private String remark;


	public Integer getId() {
		return id;
	}

	public CashBuy setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getClientId() {
		return clientId;
	}

	public CashBuy setClientId(Integer clientId) {
		this.clientId = clientId;
		return this;
	}

	public String getMoney() {
		return money;
	}

	public CashBuy setMoney(String money) {
		this.money = money;
		return this;
	}

	public String getCashType() {
		return cashType;
	}

	public CashBuy setCashType(String cashType) {
		this.cashType = cashType;
		return this;
	}

	public String getCashFen() {
		return cashFen;
	}

	public CashBuy setCashFen(String cashFen) {
		this.cashFen = cashFen;
		return this;
	}

	public Date getCashTime() {
		return cashTime;
	}

	public CashBuy setCashTime(Date cashTime) {
		this.cashTime = cashTime;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public CashBuy setStatus(String status) {
		this.status = status;
		return this;
	}

	public String getRemark() {
		return remark;
	}

	public CashBuy setRemark(String remark) {
		this.remark = remark;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
