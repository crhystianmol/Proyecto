package com.conectECI.DAOS;

import com.conectECI.Model.User;

import java.util.ArrayList;

public interface UserDao {
    public void addUser(User user);
    public User getUser(String email);
    public ArrayList<User> getUsers();
}
