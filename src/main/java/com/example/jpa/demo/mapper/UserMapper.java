package com.example.jpa.demo.mapper;

import com.example.jpa.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public interface UserMapper extends JpaRepository<User,Long> {
}
