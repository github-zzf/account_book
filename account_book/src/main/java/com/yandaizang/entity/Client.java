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
public class Client extends Model<Client> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 顾客姓名
     */
	@TableField("client_name")
	private String clientName;
    /**
     * 顾客性别(0男1女)
     */
	@TableField("client_sex")
	private String clientSex;
    /**
     * 顾客联系方式
     */
	@TableField("client_phone")
	private String clientPhone;
    /**
     * 顾客住址
     */
	@TableField("client_address")
	private String clientAddress;
    /**
     * 顾客等级
     */
	@TableField("client_grade")
	private String clientGrade;
    /**
     * 消费金额
     */
	private String money;
    /**
     * 消费次数
     */
	private Integer num;
    /**
     * 消费积分
     */
	@TableField("client_fen")
	private String clientFen;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;
    /**
     * 状态（1正常 9删除）
     */
	private String status;


	public Integer getId() {
		return id;
	}

	public Client setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getClientName() {
		return clientName;
	}

	public Client setClientName(String clientName) {
		this.clientName = clientName;
		return this;
	}

	public String getClientSex() {
		return clientSex;
	}

	public Client setClientSex(String clientSex) {
		this.clientSex = clientSex;
		return this;
	}

	public String getClientPhone() {
		return clientPhone;
	}

	public Client setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
		return this;
	}

	public String getClientAddress() {
		return clientAddress;
	}

	public Client setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
		return this;
	}

	public String getClientGrade() {
		return clientGrade;
	}

	public Client setClientGrade(String clientGrade) {
		this.clientGrade = clientGrade;
		return this;
	}

	public String getMoney() {
		return money;
	}

	public Client setMoney(String money) {
		this.money = money;
		return this;
	}

	public Integer getNum() {
		return num;
	}

	public Client setNum(Integer num) {
		this.num = num;
		return this;
	}

	public String getClientFen() {
		return clientFen;
	}

	public Client setClientFen(String clientFen) {
		this.clientFen = clientFen;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public Client setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public Client setStatus(String status) {
		this.status = status;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
