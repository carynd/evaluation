package test_com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import test_com.example.demo.entity.email;

import test_com.example.demo.service.emailservice;

import java.util.List;

@RestController
public class emailcontroller {

    @Autowired
    emailservice EmailService;

/*
    @PostMapping("/mail")
    public email addemail(@RequestBody email Email){
        email email1=EmailService.addemail(Email);
        return email1;
    }

 */
}
