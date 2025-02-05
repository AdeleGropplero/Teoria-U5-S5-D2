package com.epicode.projects;

import com.epicode.projects.Entities.User;
import com.epicode.projects.Service.UserService;
import com.epicode.projects.configuration.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ProjectsApplication {

//	@Autowired
//	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ProjectsApplication.class, args);
		System.out.println("Inizializzazione...");

	/*	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(UserConfig.class);

		User u = (User) ctx.getBean("AdminUserBean");
		System.out.println(u);
		ctx.close();*/

//		UserService userService = new UserService();
//		User u = userService.createAdminUser(); invece che fare così uso @Autowired mettendo in collegamento il Service.

		//User u = userService.createAdminUser();

	}



}
