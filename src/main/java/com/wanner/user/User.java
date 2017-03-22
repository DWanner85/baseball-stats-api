package com.wanner.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private final Long id;

    @Column(name="username")
    private String username;

    @Column(name="userPassword")
    @JsonIgnore
    private String password;

    @Column(name="role")
    @JsonIgnore
    private String role;

    public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

    //Default JPA constructor
    protected User() {
        id = null;
    }


    public User(String username, String password, String role) {
        this();
        this.username = username;
        setPassword(password);
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = PASSWORD_ENCODER.encode(password);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
