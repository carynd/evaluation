package test_com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class user {
     @Id
    private Long id;
     private String name;
     private Long photoNo;
     private Integer dob;

     @OneToOne
    @JoinColumn(email="emailid")
    private

}
