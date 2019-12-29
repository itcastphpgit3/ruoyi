
package com.ruoyi.village.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.base.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 暮云党员表 myc_partymember
 *
 * @author 张鸿权
 * @date 2019-01-20
 */
public class Partymember extends BaseEntity {
	private static final long serialVersionUID = 1L;

	/**
	 * 数据编号
	 */
	private Integer pid;
	/**
	 * 地域编号
	 */
	@Excel(name = "地域编号")
	private String aid;
	/**
	 * 党员小组
	 */
	@Excel(name = "党员小组")
	private String grouptype;
	/**
	 * 党员姓名
	 */
	@Excel(name = "党员姓名")
	private String uname;
	/**
	 * 性别
	 */
	@Excel(name = "性别")
	private String sex;
	/**
	 * 民族
	 */
	@Excel(name = "民族")
	private String nations;
	/**
	 * 身份证号码
	 */
	@Excel(name = "身份证号码")
	private String idcard;
	/**
	 * 学历
	 */
	@Excel(name = "学历")
	private String edulevel;
	/**
	 * 出生年月
	 */
	@Excel(name = "出生年月")
	private String birthday;
	/**
	 * 入党时间
	 */
	@Excel(name = "入党时间")
	private String partyjoindate;
	/**
	 * 手机号
	 */
	@Excel(name = "手机号")
	private String phone;
	/**
	 * 家庭住址
	 */
	@Excel(name = "家庭住址")
	private String address;
	/**
	 * 备注
	 */
	@Excel(name = "备注")
	private String notes;
	/**
	 * 微信用户编号
	 */
	@Excel(name = "微信用户编号")
	private Integer uid;
	/**
	 * 微信号
	 */
	@Excel(name = "微信号")
	private String wcid;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getGrouptype() {
		return grouptype;
	}

	public void setGrouptype(String grouptype) {
		this.grouptype = grouptype;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNations() {
		return nations;
	}

	public void setNations(String nations) {
		this.nations = nations;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getEdulevel() {
		return edulevel;
	}

	public void setEdulevel(String edulevel) {
		this.edulevel = edulevel;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPartyjoindate() {
		return partyjoindate;
	}

	public void setPartyjoindate(String partyjoindate) {
		this.partyjoindate = partyjoindate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getWcid() {
		return wcid;
	}

	public void setWcid(String wcid) {
		this.wcid = wcid;
	}

	@Override
	public String toString() {
		return "Partymember{" +
				"pid=" + pid +
				", aid='" + aid + '\'' +
				", grouptype='" + grouptype + '\'' +
				", uname='" + uname + '\'' +
				", sex='" + sex + '\'' +
				", nations='" + nations + '\'' +
				", idcard='" + idcard + '\'' +
				", edulevel='" + edulevel + '\'' +
				", birthday='" + birthday + '\'' +
				", partyjoindate='" + partyjoindate + '\'' +
				", phone='" + phone + '\'' +
				", address='" + address + '\'' +
				", notes='" + notes + '\'' +
				", uid=" + uid +
				", wcid='" + wcid + '\'' +
				'}';
	}
}