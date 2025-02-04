package com.epicode.projects.configuration;

import com.epicode.projects.Entities.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("application.properties")
public class UserConfig {
    @Value("${user.admin.name}") private String adminName;
    @Value("${user.admin.lastName}") private String adminLastName;
    @Value("${user.admin.age}") private int adminAge;


    @Bean("AdminUserBean")
    @Scope("singleton")
    public User adminUser(){
        return new User(adminName, adminLastName, adminAge);
    }
}
