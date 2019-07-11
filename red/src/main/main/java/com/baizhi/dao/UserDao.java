package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    public void register(User user);
    public  User login(@Param("username")String username,@Param("password")String password);
    public User selectByUsername(@Param("username")String username);
}
