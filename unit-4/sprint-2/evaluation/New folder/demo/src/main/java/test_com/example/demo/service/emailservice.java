package test_com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test_com.example.demo.entity.email;
import test_com.example.demo.entity.user;
import test_com.example.demo.repository.emailrepository;

import java.util.List;
@Service
public class emailservice {


    @Autowired
    emailrepository Emailrepository;


    public email addemail(email Email) {
        email email1=Emailrepository.save(Email);
        return email1;
    }
}
