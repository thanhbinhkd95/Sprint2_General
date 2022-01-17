package model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "image")
    private String image;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "birthday", columnDefinition = "date")
    private String birthday;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "point")
    private Integer point;

    @Column(name = "id_card")
    private String idCard;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;
}
