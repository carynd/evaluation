package test_com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import test_com.example.demo.entity.email;

import test_com.example.demo.service.emailservice;

import java.util.List;

@RestController
public class emailcontroller {

    @Autowired
    emailservice EmailService;



}
