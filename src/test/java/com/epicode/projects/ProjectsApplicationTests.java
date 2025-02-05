package com.epicode.projects;

import com.epicode.projects.Entities.User;
import com.epicode.projects.Service.UserService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ProjectsApplicationTests {

    @Autowired
    private UserService userService;
    private static User user;

    @Test
    void contextLoads() {
    }

    @BeforeEach //esegue e riesegue il seguente metodo prima di ogni altro test.
    //mi inizializza un oggetto diverso prima di ogni test.
    void initUserEach() {
       // System.out.println("BeforeEach");// avremo in stampa questa stringa ogni volta che viene chiamato un metodo test.
        user = userService.createCustomUser();
        user.setName("Adele");
        user.setLastName("Adela");
        user.setAge(26);
    }

    @BeforeAll //presto per vederlo bene, si vede con il database.
   static void initUserAll() {
         System.out.println("BeforeAll");// avremo in stampa questa stringa una sola volta.
    }

    @AfterAll
    static void pulizia() {
        System.out.println("pulizia...");//
    }

    @AfterEach
     void puliziaEach() {
       // System.out.println("pulizia...con each"); // avremo in stampa questa stringa ogni volta che viene chiamato un metodo test.
        user = null;
    }

    @Test
    void userTestName() {
        assertEquals("Adele", user.getName());
    }

    @Test
    @Disabled
    void userTestAge() {
        assertEquals(26, user.getAge());
    }

    @Test
    void adminTest() {
        User admin = userService.createAdminUser();
//		assertEquals("Giuseppe", admin.getName()); //Fallisce perché il nome è Mario
        assertEquals("Mario", admin.getName()); //Passa.

        assertEquals(45, admin.getAge());//Passa.
    }

    @Test
    void fakeUserTest() {
        User user = userService.createFakeUser();
        assertTrue(user.getAge() > 50); //condizione booleana, verica se la condizione è vera.
        //in questo caso user.age è generato randomicamente da faker.
    }

}
