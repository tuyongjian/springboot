package com.tu.springboot.dao;

import com.tu.springboot.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by len on 2018/4/8.
 */
@Mapper
@Repository
public interface UserDao {

    public User selectById(int id);

    public int insert(User user);
}
