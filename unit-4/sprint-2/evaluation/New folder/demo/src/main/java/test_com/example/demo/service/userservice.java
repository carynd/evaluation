package test_com.example.demo.service;

import org.springframework.stereotype.Service;
import test_com.example.demo.entity.email;
import test_com.example.demo.entity.user;
import test_com.example.demo.repository.userrepository;

import java.util.List;
import java.util.Optional;

@Service

public class userservice {
    userrepository Userrepository;

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

    public List<user> getemailofuser(String userid,String mail_id) {

        Optional<user> user1=Userrepository.findById(userid);
        if(user1.isEmpty()){
            return null;

        }

        Optional<user> user1=Userrepository.findById(userid);

    }


    // public email addemail(email email) {
  //  }
}
