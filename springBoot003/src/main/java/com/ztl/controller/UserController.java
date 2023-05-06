package com.ztl.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ztl.mapper.UserMapper;
import com.ztl.pojo.User;
import com.ztl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    /*
    * 新增用户
    * */
    @PostMapping
    public Result add(@RequestBody User user){
        int insert = userMapper.insert(user);
        if(insert>0){
            return new Result(null,Code.SAVE_OK);
        }else{
            return new Result(null,Code.SAVE_ERR);
        }

    }

    /*
    * 删除用户
    * */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        System.out.println("delete id is:"+id);
        int i = userMapper.deleteById(id);
        if(i>0){
            return new Result(null,Code.DELETE_OK);
        }else{
            return new Result(null,Code.DELETE_ERR);
        }

    }

    /*
    * 修改用户
    * */
    @PutMapping
    public Result update(@RequestBody User user){
        if(userMapper.updateById(user)>0){
            return new Result(null,Code.UPDATE_OK);
        }else{
            return new Result(null,Code.UPDATE_ERR);
        }
    }

    /*
    * 查询所有用户
    * */
    @GetMapping
    public Result selectList(User user){

        //添加查询条件
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(user.getUserName()!=null,"user_name",user.getUserName());
        queryWrapper.eq(user.getId()!=null,"id",user.getId());

        //添加分页条件
        //Page<User> page = new Page<>(1，5);
        Page<User> page = new Page<>();
        page.setCurrent(1); //设置当前页
        page.setSize(5); //设置每页数量

        Page<User> userPage = userMapper.selectPage(page, queryWrapper);

        return new Result(userPage,Code.GET_OK);
    }

    /*
    * 根据ID查询用户
    * */
    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id){
        User user = userMapper.selectById(id);
        return new Result(user,Code.GET_OK);
    }

}
