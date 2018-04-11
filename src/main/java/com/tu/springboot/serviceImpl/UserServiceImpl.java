package com.tu.springboot.serviceImpl;

import com.tu.springboot.dao.UserDao;
import com.tu.springboot.model.User;
import com.tu.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by len on 2018/4/8.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User queryUser(int id) {
        return userDao.selectById(id);
    }

    @Override
    public int addUser(User user) {
        return userDao.insert(user);
    }
}
