package com.yandaizang.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zzf
 * @since 2020-01-09
 */
public class Menu extends Model<Menu> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 菜单名称
     */
	private String name;
    /**
     * 父菜单id
     */
	private Integer pid;
    /**
     * 描述
     */
	private String descpt;
    /**
     * 菜单url
     */
	private String url;
    /**
     * 添加时间
     */
	@TableField("create_time")
	private String createTime;
    /**
     * 更新时间
     */
	@TableField("update_time")
	private String updateTime;
    /**
     * 删除标志（0:删除 1：存在）
     */
	@TableField("del_flag")
	private Integer delFlag;


	public Integer getId() {
		return id;
	}

	public Menu setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Menu setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getPid() {
		return pid;
	}

	public Menu setPid(Integer pid) {
		this.pid = pid;
		return this;
	}

	public String getDescpt() {
		return descpt;
	}

	public Menu setDescpt(String descpt) {
		this.descpt = descpt;
		return this;
	}

	public String getUrl() {
		return url;
	}

	public Menu setUrl(String url) {
		this.url = url;
		return this;
	}

	public String getCreateTime() {
		return createTime;
	}

	public Menu setCreateTime(String createTime) {
		this.createTime = createTime;
		return this;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public Menu setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public Menu setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
