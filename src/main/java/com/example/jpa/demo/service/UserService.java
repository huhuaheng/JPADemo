package com.example.jpa.demo.service;

import com.example.jpa.demo.domain.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Description TODD
 * @Author hhh
 * @Date 2020/5/27 11:11
 **/
public interface UserService {

    List<User> findAllUser();
}
