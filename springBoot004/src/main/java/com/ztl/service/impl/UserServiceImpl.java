package com.ztl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ztl.mapper.UserMapper;
import com.ztl.pojo.User;
import com.ztl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Page<User> selectList(Integer current, Integer size, String userName) {
        if (current == null) {
            current = 1;
        }
        if (size == null) {
            size = 5;
        }
        //设置查询条件
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(userName != null, "user_name", userName);

        //设置分页查询数据
        Page<User> page = new Page<>(current, size);

        Page<User> userPage = userMapper.selectPage(page, queryWrapper);
        return userPage;
    }

    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public Integer update(User user) {
        return userMapper.updateById(user);
    }

    @Override
    public Integer add(User user) {
        return userMapper.insert(user);
    }

    @Override
    public Integer deleteById(Integer id) {
        return userMapper.deleteById(id);
    }
}
