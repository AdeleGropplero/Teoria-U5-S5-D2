package com.epicode.projects.configuration;

import com.epicode.projects.Entities.User;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.Locale;

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

    @Bean ("FakeUserBean")
    @Scope("prototype")
    public User fakeUser(){
        Faker fake = Faker.instance(new Locale("it-IT"));
        User u = new User();
        u.setName(fake.name().firstName());
        u.setLastName(fake.name().lastName());
        u.setAge(fake.number().numberBetween(18, 90));
        return u;
    }
    @Bean ("CustomUserBean")
    @Scope("prototype")
    public User customUser(){
        return new User();
    }
}
