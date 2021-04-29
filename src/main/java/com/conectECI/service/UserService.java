package com.conectECI.service;

import com.conectECI.Exception.ConectException;
import com.conectECI.Model.User;

import java.util.ArrayList;

public interface UserService {
    public void addUser(User user) throws ConectException;
    public User getUser(String email);
    public ArrayList<User> getUser();

}
