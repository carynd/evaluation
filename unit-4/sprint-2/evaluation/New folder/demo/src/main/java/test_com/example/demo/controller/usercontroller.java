package test_com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import test_com.example.demo.entity.email;
import test_com.example.demo.entity.user;
import test_com.example.demo.service.userservice;

import java.util.List;

@RestController
public class usercontroller {



    @Autowired
    userservice UserService;

    @GetMapping("/users")
    public List<user> getallusers(){
        List<user> allemail=UserService.getallusers();
        return allemail;
    }

    @PostMapping("/users")
    public user addUser(@RequestBody  user User){
        user newuser=UserService.addUser(User);
        return newuser;
    }
}
