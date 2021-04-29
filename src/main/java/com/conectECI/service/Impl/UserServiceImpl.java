package com.conectECI.service.Impl;

import com.conectECI.DAOS.UserDao;
import com.conectECI.Exception.ConectException;
import com.conectECI.Model.User;
import com.conectECI.service.UserService;
import com.google.inject.Inject;

import java.util.ArrayList;

public class UserServiceImpl implements UserService {
    @Inject
    private UserDao userDao;
    public void addUser(User user) throws ConectException {

    }

    public User getUser(String email) {
        return null;
    }

    public ArrayList<User> getUser() {
        return userDao.getUsers();
    }
}
