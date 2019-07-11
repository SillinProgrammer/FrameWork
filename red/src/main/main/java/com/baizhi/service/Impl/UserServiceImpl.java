package com.baizhi.service.Impl;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public boolean register(User user) {
        if(userDao.selectByUsername(user.getUsername()) != null){
            return false;
        }
        user.setId(UUID.randomUUID().toString());
        userDao.register(user);
        return true;
    }

    @Override
    public User login(User user) {
        return userDao.login(user.getUsername(),user.getPassword());
    }
}
