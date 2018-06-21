package net.zhenghao.zh.common.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 页面响应entity
 *
 * @author:zhaozhenghao
 * @Email :736720794@qq.com
 * @date  :2017年11月22日 上午11:08:38
 * R.java
 */
public class R extends HashMap<String, Object>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public R(){
		put("code", 0);
	}
	
	public static R error(){
		return error(500, "未知异常，请联系管理员");
	}
	
	public static R error(String msg){
		return error(500, msg);
	}
	
	public static R error(int code, String msg){
		R r = new R();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}
	
	public static R ok(String msg){
		R r = new R();
		r.put("msg", msg);
		return r;
	}
	
	public static R ok(Map<String, Object> map){
		R r = new R();
		r.putAll(map);
		return r;
	}
	
	public static R ok(){
		return new R();
	}
	
	public R put(String key, Object value){
		super.put(key, value);
		return this;
	}

}