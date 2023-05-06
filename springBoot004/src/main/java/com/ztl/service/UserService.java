package com.ztl.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ztl.pojo.User;

public interface UserService {
    /*
    * 动态查询 模糊 分页
    * */
    Page<User> selectList(Integer current,Integer size,String userName);

    /*
    * 根据ID查询
    * */
    User selectById(Integer id);

    /*
    * 修改
    * */
    Integer update(User user);

    /*
    * 添加
    * */
    Integer add(User user);

    /*
    * 根据ID删除
    * */
    Integer deleteById(Integer id);
}
