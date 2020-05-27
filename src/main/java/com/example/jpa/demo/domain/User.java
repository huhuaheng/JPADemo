package com.example.jpa.demo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ClassName User
 * @Description TODD
 * @Author hhh
 * @Date 2020/5/27 11:07
 **/
@Data
@Entity  // 该注解声明一个实体类，与数据库中的表对应
public class User {
    @Id
    @GeneratedValue   //  自动生成
    private Long id ;

    private String name ;
}
