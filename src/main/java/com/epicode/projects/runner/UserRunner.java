package com.epicode.projects.runner;

import com.epicode.projects.Entities.User;
import com.epicode.projects.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRunner implements CommandLineRunner {
    @Autowired //l'istanza del service me la fa Spring.
    private UserService userService;

/*
    private UserService userService;
    public UserRunner (UserService userService){
    this.userService = userService;
    }
    Fare questo è la stessa cosa solo molto più lunga che usare @Autowired come ho fatto sopra.
*/

    @Override
    public void run(String...args) throws Exception{
        System.out.println("UserRunner...");

        User userAdmin =  userService.createAdminUser();
        System.out.println(userAdmin);

        User fakeUser =  userService.createFakeUser();
        System.out.println(fakeUser);

        User customUser =  userService.createCustomUser();
        customUser.setName("Adola");
        customUser.setLastName("Mandola");
        customUser.setAge(13);
        System.out.println(customUser);

        User customUserBuilder = userService.createCustomUser().builder().name("Fagottino").lastName("Bamboccino").age(55).build();
        // L'annotation @Builder mi permette di costruire un oggetto in questo modo: con .builder() e .build() finale.
        System.out.println(customUserBuilder);


    }
}
