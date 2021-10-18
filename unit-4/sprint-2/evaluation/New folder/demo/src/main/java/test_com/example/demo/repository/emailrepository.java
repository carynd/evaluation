package test_com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test_com.example.demo.entity.email;

@Repository
public interface emailrepository extends JpaRepository <email,String>{
}
