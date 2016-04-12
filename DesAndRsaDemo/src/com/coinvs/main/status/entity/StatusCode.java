package com.coinvs.main.status.entity;
/**
 * 封装返回的状态码，及
 * @author 华
 *
 */
public final class StatusCode {
	/**
	 * 请求成功返回的状态码
	 */
	public  final static String SUCCESS_CODE = "0";
	
	/**
	 * 请求失败返回的状态码
	 */
	public  final static String ERROR_CODE = "1";
	
	/**
	 * 获取数据失败时返回的消息
	 */
	public final static String ERROR_MESSAGE = "获取数据失败";
	
	/**
	 * 轮播图数据的key
	 */
	public final static String IMAGES = "images";
	
	/**
	 * 推荐项目的key
	 */
	public final static String RECOMMENDS = "recommends";
	
	/**
	 * 新手任务的key
	 */
	public final static String NEWBIES = "newbies";
	
	/**
	 * 公司投资情况的key
	 */
	public final static String COMPANYS = "companys";
	
	/**
	 * 投资中项目的key
	 */
	public final static String INVESTSV = "invests";
	
	/**
	 * 预热项目的key
	 */
	public final static String PREHEATS = "preheats";
	
	/**
	 * 完成项目的key
	 */
	public final static String FINISHS = "finishs";
	
	
	
	/**
	 * 正在使用的轮播图的状态值
	 */
	public final static String USING_BANNER = "0"; 
	
	/**
	 * 停用的轮播图的状态值
	 */
	public final static String STOP_NANNER = "1";
}
