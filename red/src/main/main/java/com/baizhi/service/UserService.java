package com.baizhi.service;

import com.baizhi.entity.User;

public interface UserService {
    public boolean register(User user);
    public  User login(User user);
}
