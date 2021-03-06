package com.aoyang.health.admin.entity;

import java.io.Serializable;
import java.util.Date;

import com.aoyang.health.admin.util.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public abstract class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String createBy;
	
	private String lastModifyBy;
	
	@JsonSerialize(using=JsonDateSerializer.class)
	private Date createTime;
	
	@JsonSerialize(using=JsonDateSerializer.class)
	private Date lastModifyTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getLastModifyBy() {
		return lastModifyBy;
	}

	public void setLastModifyBy(String lastModifyBy) {
		this.lastModifyBy = lastModifyBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastModifyTime() {
		return lastModifyTime;
	}

	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

}
