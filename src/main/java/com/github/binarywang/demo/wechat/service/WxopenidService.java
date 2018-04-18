package com.github.binarywang.demo.wechat.service;

import java.util.List;

import com.github.binarywang.demo.wechat.entity.Wxopenid;

public interface WxopenidService {
	
	
	List<Wxopenid> getAllOpenId()throws Exception;
	
	void saveOpenid(String openidxff,String openiddsb) throws Exception;

}
