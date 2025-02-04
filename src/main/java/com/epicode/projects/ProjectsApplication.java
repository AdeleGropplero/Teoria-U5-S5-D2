package com.epicode.projects;

import com.epicode.projects.Entities.User;
import com.epicode.projects.configuration.UserConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ProjectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectsApplication.class, args);
		System.out.println("Inizializzazione...");

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(UserConfig.class);

		User u = (User) ctx.getBean("AdminUserBean");
		System.out.println(u);
		ctx.close();
	}

}
