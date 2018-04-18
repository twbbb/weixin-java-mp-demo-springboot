package com.github.binarywang.demo.wechat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.github.binarywang.demo.wechat.entity.Wxuser;


//继承JpaRepository来完成对数据库的操作
public interface WxuserRepository extends JpaRepository<Wxuser,Integer>{
	
	
	@Query(value="select o from Wxuser o where openid=:openid")
	public Wxuser getWxuserByOpenid(@Param("openid") String openid) throws Exception;
	
	
	  
}
