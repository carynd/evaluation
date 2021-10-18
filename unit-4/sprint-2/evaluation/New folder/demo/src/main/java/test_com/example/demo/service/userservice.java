package test_com.example.demo.service;

import org.springframework.stereotype.Service;
import test_com.example.demo.entity.email;
import test_com.example.demo.entity.user;
import test_com.example.demo.repository.userrepository;

import java.util.List;
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
}
