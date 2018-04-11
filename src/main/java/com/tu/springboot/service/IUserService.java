package com.tu.springboot.service;

import com.tu.springboot.model.User;

/**
 * Created by len on 2018/4/8.
 */
public interface IUserService {

    public User queryUser(int id);

    public int addUser(User user);
}
