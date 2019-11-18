package com.zs.entity;

import java.util.Date;

/**
* 头条
* 
* @author zhushuai
* 创建日期 2019/10/23
* @since 
*/
public class HeadLine {
	/**头条id*/
	private Long lineId;
	/**头条名称*/
	private String lineName;
	/**头条链接*/
	private String lineLink;
	/**头条图片*/
	private String lineImg;
	/**头条权重*/
	private Integer priority;
	/**0不可用 1可用*/
	private Integer enableStatus;
	/**创建时间*/
	private Date createTime;
	/**最后修改时间*/
	private Date lastEditTime;

	public Long getLineId() {
		return lineId;
	}

	public void setLineId(Long lineId) {
		this.lineId = lineId;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public String getLineLink() {
		return lineLink;
	}

	public void setLineLink(String lineLink) {
		this.lineLink = lineLink;
	}

	public String getLineImg() {
		return lineImg;
	}

	public void setLineImg(String lineImg) {
		this.lineImg = lineImg;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getEnableStatus() {
		return enableStatus;
	}

	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastEditTime() {
		return lastEditTime;
	}

	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}

	@Override
	public String toString() {
		return "HeadLine{" +
				"lineId=" + lineId +
				", lineName='" + lineName + '\'' +
				", lineLink='" + lineLink + '\'' +
				", lineImg='" + lineImg + '\'' +
				", priority=" + priority +
				", enableStatus=" + enableStatus +
				", createTime=" + createTime +
				", lastEditTime=" + lastEditTime +
				'}';
	}
}
