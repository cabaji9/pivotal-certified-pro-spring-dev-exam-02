package com.apress.cems.config;

import com.apress.cems.pojos.repos.DetectiveRepo;
import com.apress.cems.repos.JdbcDetectiveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class RepoConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    DetectiveRepo detectiveRepo(){
        return new JdbcDetectiveRepo(dataSource);
    }
}
