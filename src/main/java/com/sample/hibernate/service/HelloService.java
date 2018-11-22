package com.sample.hibernate.service;

import com.sample.hibernate.entity.BaseInfoEntity;
import com.sample.hibernate.repository.BaseInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloService {
	BaseInfoRepository baseInfoRepository;

	@Autowired
	public HelloService(BaseInfoRepository baseInfoRepository) {
		this.baseInfoRepository = baseInfoRepository;
	}

	public String hello(){
		BaseInfoEntity baseInfoEntity = baseInfoRepository.findBaseInfoEntityBySeq("1");
		return baseInfoEntity.getValue();
	}
}
