package test_com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table (uniqueConstraints = {@UniqueConstraint(columnNames = {"mail_id"})})
public class user {
     @Id
    private String id;
     private String name;
     private String photoNo;
     private String dob;

     @OneToOne
    @JoinColumn(name ="mail_id")
    private user User;



}
//INSERT INTO EMAIL(ID,DOB,NAME,PHOTO_NO,MAIL_ID)
//VALUES("1213",1,"DED",12434,"1");