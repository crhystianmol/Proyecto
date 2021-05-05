package com.conectECI.myBatisDAO;

import com.conectECI.DAOS.UserDao;
import com.conectECI.Model.User;
import com.conectECI.mappers.UserMapper;
import com.google.inject.Inject;

import java.util.ArrayList;

public class MyBatisUserDAO implements UserDao {
    @Inject
    private UserMapper mapper;
    public MyBatisUserDAO(){
        System.out.println("creo MyBatis");
    }
    public void addUser(User user) {

    }


    public User getUser(String email) {
        return null;
    }

    public ArrayList<User> getUsers() {
        return mapper.getUsers();
    }
}
