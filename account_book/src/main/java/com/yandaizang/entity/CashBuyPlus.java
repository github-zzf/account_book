package com.yandaizang.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zzf
 * @since 2020-01-07
 */
@TableName("cash_buy_plus")
public class CashBuyPlus extends Model<CashBuyPlus> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 交易记录id
     */
	@TableField("cash_id")
	private Integer cashId;
    /**
     * 商品id
     */
	@TableField("goods_id")
	private Integer goodsId;
    /**
     * 数量
     */
	private Integer num;
    /**
     * 总价
     */
	private String zmoney;


	public Integer getId() {
		return id;
	}

	public CashBuyPlus setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getCashId() {
		return cashId;
	}

	public CashBuyPlus setCashId(Integer cashId) {
		this.cashId = cashId;
		return this;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public CashBuyPlus setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
		return this;
	}

	public Integer getNum() {
		return num;
	}

	public CashBuyPlus setNum(Integer num) {
		this.num = num;
		return this;
	}

	public String getZmoney() {
		return zmoney;
	}

	public CashBuyPlus setZmoney(String zmoney) {
		this.zmoney = zmoney;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
