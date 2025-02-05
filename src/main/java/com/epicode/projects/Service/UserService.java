package com.epicode.projects.Service;

import com.epicode.projects.Entities.User;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired @Qualifier("AdminUserBean") // creo direttamente/automaticamente il context
    ObjectProvider<User> userAdminProvider;

    @Autowired @Qualifier("FakeUserBean") ObjectProvider<User> userFakeProvider;
    @Autowired @Qualifier("CustomUserBean") ObjectProvider<User> userCustomProvider;



    public User createAdminUser(){
      return  userAdminProvider.getObject(); //con getObject vado a leggere l'oggetto e lo ritorno
    }

   public User createFakeUser(){
       return  userFakeProvider.getObject();
   }

  public User createCustomUser(){
      return  userCustomProvider.getObject();
  }

}
