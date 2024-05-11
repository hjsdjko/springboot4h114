package com.entity.model;

import com.entity.YuyuejiezhongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 预约接种
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-02 02:14:10
 */
public class YuyuejiezhongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 监护人姓名
	 */
	
	private String jianhurenxingming;
		
	/**
	 * 儿童姓名
	 */
	
	private String ertongxingming;
		
	/**
	 * 接种编号
	 */
	
	private String jiezhongbianhao;
		
	/**
	 * 预约时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yuyueshijian;
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：监护人姓名
	 */
	 
	public void setJianhurenxingming(String jianhurenxingming) {
		this.jianhurenxingming = jianhurenxingming;
	}
	
	/**
	 * 获取：监护人姓名
	 */
	public String getJianhurenxingming() {
		return jianhurenxingming;
	}
				
	
	/**
	 * 设置：儿童姓名
	 */
	 
	public void setErtongxingming(String ertongxingming) {
		this.ertongxingming = ertongxingming;
	}
	
	/**
	 * 获取：儿童姓名
	 */
	public String getErtongxingming() {
		return ertongxingming;
	}
				
	
	/**
	 * 设置：接种编号
	 */
	 
	public void setJiezhongbianhao(String jiezhongbianhao) {
		this.jiezhongbianhao = jiezhongbianhao;
	}
	
	/**
	 * 获取：接种编号
	 */
	public String getJiezhongbianhao() {
		return jiezhongbianhao;
	}
				
	
	/**
	 * 设置：预约时间
	 */
	 
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	
	/**
	 * 获取：预约时间
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
	}
			
}
