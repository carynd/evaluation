package test_com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
    @GetMapping("/user/{id}")
    public user getuserbyid(@PathVariable("id") String userid) {
        user user1 = UserService.getuserbyid(userid);
        return user1;
    }


    @DeleteMapping("/user/{id}")
    public String deluserbyid(@PathVariable("id") String userid) {
        String user2 = UserService.deluserbyid(userid);
        return user2;
    }
    @GetMapping("/user/{id}/mail/{mail_id}")
    public List<user> getemailofuser(@PathVariable("id") String userid,@PathVariable("mail_id") String mail_id){
        List<user> details=UserService.getemailofuser(userid,mail_id);
        return details;

    }
    /*
    @PostMapping("/user/{id}/mail")
    public email addemail(@RequestBody email Email){
        email email1=UserService.addemail(Email);
        return email1;
    }
*/

}

