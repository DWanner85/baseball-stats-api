package com.wanner.core;

import com.wanner.user.User;
import com.wanner.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DatabaseLoader implements ApplicationRunner{
    private final UserRepository users;

    @Autowired
    public DatabaseLoader(UserRepository users){
        this.users = users;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<User> apiUsers = Arrays.asList(
                new User("user1", "password", "ROLE_USER"),
                new User("user2", "password", "ROLE_USER"),
                new User("user3", "password", "ROLE_USER"));
        users.save(apiUsers);
        users.save(new User("dwanner", "password", "ROLE_ADMIN"));
    }
}
