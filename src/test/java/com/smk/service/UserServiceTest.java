package com.smk.service;

import com.smk.model.User;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @org.junit.jupiter.api.Test
    void getUserList() {
        List<User> userList =
                UserService.getInstance().getUserList();
                assertEquals(userList.size(),1);

    }

    @org.junit.jupiter.api.Test
    void addUser() {
        User user = new User();
        user.setUserName("BinaInformatika");
        user.setPassword("R4H4S14");
        UserService
                .getInstance().addUser(user);
    }
}