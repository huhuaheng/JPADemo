package com.example.jpa.demo.service.impl;

import com.example.jpa.demo.domain.User;
import com.example.jpa.demo.mapper.UserMapper;
import com.example.jpa.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODD
 * @Author hhh
 * @Date 2020/5/27 11:11
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAllUser() {
        return userMapper.findAll();
    }
}
