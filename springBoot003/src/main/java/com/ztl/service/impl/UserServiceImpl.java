package com.ztl.service.impl;

import com.ztl.mapper.UserMapper;
import com.ztl.pojo.User;
import com.ztl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


}
