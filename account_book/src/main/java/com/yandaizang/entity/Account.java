package com.yandaizang.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Account extends Model<Account> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 顾客id
     */
	@TableField("client_id")
	private Integer clientId;
    /**
     * 交易记录id
     */
	@TableField("cash_id")
	private Integer cashId;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;
    /**
     * 状态（0未付清1已付清）
     */
	private String status;


	public Integer getId() {
		return id;
	}

	public Account setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getClientId() {
		return clientId;
	}

	public Account setClientId(Integer clientId) {
		this.clientId = clientId;
		return this;
	}

	public Integer getCashId() {
		return cashId;
	}

	public Account setCashId(Integer cashId) {
		this.cashId = cashId;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public Account setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public Account setStatus(String status) {
		this.status = status;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
