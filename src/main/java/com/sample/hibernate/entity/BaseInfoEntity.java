package com.sample.hibernate.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="BASE_INFO")
@SequenceGenerator(
		name = "BASE_INFO SEQ GENERATE",
		sequenceName = "BASE_INFO_SEQ", //매핑할데이터베이스 시퀀스 이름
		initialValue = 1, allocationSize = 1)
public class BaseInfoEntity {
	@Id
	@Column(name="seq", nullable = false)
	int seq;

	@Basic
	@Column(name="value", length=20)
	String value;

	@Builder
	public BaseInfoEntity(int seq, String value) {
		this.seq = seq;
		this.value = value;
	}

	@Builder
	public BaseInfoEntity(String value) {
		this.value = value;
	}
}
