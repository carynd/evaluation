package test_com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test_com.example.demo.entity.email;
import test_com.example.demo.entity.user;
import test_com.example.demo.repository.emailrepository;
import test_com.example.demo.repository.userrepository;

import java.util.List;
import java.util.Optional;

@Service

public class userservice {
    @Autowired
    userrepository Userrepository;
    emailrepository Emailrepository;


    public List<user> getallusers() {
        List<user> emailall=Userrepository.findAll();
        return emailall;
    }


    public user addUser(user User) {
        user user1=Userrepository.save(User);
        return user1;
    }

    public user getuserbyid(String userid) {

        Optional <user> user1=Userrepository.findById(userid);
        if(user1.isEmpty()){
            return null;
        }

            return user1.get();

    }

    public String deluserbyid(String userid) {

        user user2=Userrepository.findById(userid).get();

        try{
            Userrepository.delete(user2);
            return "deleted";
        }
        catch(Exception ex){
            return "failed";
        }
    }
/*
    public List<user> getemailofuser(String userid,String mail_id) {

        Optional<user> user1=Userrepository.findById(userid);
        if(user1.isEmpty()){
            return null;

        }

        Optional<email> email1=Emailrepository.findById(userid);
        if(email1.isEmpty()){
            return null;
        }
        user1.get().setEmail(email1.get());
        Userrepository.save(user1.get());
        return user1.get();

    }

    public email addemail(email email) {
    }


    // public email addemail(email email) {
  //  }

 */
}
