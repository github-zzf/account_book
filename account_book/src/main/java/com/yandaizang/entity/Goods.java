package com.yandaizang.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.math.BigDecimal;
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
public class Goods extends Model<Goods> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 商品名称
     */
	@TableField("goods_name")
	private String goodsName;
    /**
     * 商品价格
     */
	@TableField("goods_price")
	private BigDecimal goodsPrice;
    /**
     * 商品图片
     */
	@TableField("goods_img")
	private String goodsImg;
    /**
     * 商品描述
     */
	@TableField("goods_concent")
	private String goodsConcent;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;
    /**
     * 商品状态(1正常9删除)
     */
	private String status;


	public Integer getId() {
		return id;
	}

	public Goods setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public Goods setGoodsName(String goodsName) {
		this.goodsName = goodsName;
		return this;
	}

	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}

	public Goods setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
		return this;
	}

	public String getGoodsImg() {
		return goodsImg;
	}

	public Goods setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
		return this;
	}

	public String getGoodsConcent() {
		return goodsConcent;
	}

	public Goods setGoodsConcent(String goodsConcent) {
		this.goodsConcent = goodsConcent;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public Goods setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public Goods setStatus(String status) {
		this.status = status;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
