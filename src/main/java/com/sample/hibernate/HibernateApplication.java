package com.sample.hibernate;

import com.sample.hibernate.entity.BaseInfoEntity;
import com.sample.hibernate.repository.BaseInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateApplication implements CommandLineRunner {
    BaseInfoRepository baseInfoRepository;

    @Autowired
    public HibernateApplication(BaseInfoRepository baseInfoRepository) {
        this.baseInfoRepository = baseInfoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(HibernateApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        baseInfoRepository.save(BaseInfoEntity.builder().value("valval").build());
    }
}
