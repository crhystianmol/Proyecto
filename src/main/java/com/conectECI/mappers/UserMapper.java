package com.conectECI.mappers;

import com.conectECI.Model.User;

import java.util.ArrayList;

public interface UserMapper {
    public void addUser(User user);
    public User getUser(String email);
    public ArrayList<User> getUsers();
}
