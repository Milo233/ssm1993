package com.milo.service;


import com.milo.bean.User;

import java.util.List;

public interface UserService {

    void insertUser(User user);

    void deleteUser(int id);

    User findUserById(Integer id);

    List<User> findAllUsers();

    void updateUser(User user);
}
