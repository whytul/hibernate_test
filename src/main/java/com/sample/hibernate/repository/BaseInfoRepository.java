package com.sample.hibernate.repository;

import com.sample.hibernate.entity.BaseInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseInfoRepository extends JpaRepository<BaseInfoEntity, Long> {
	BaseInfoEntity findBaseInfoEntityBySeq(String seq);
}
