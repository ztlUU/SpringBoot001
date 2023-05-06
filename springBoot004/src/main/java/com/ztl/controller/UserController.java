package com.ztl.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ztl.pojo.User;
import com.ztl.result.Code;
import com.ztl.result.Result;
import com.ztl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /*
    * 查询
    * */
    @GetMapping
    public Result selectList(Integer current,Integer size,String userName){
        new HashMap<>();
        Page<User> userPage = userService.selectList(current,size, userName);
        return new Result(userPage, Code.GET_OK);
    }

    /*
     * 根据ID查询
     * */
    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id){
        User user = userService.selectById(id);
        return new Result(user,Code.GET_OK);
    }

    /*
     * 修改
     * */
    @PutMapping
    public Result update(User user){
        if(userService.update(user)>0){
            return new Result(null,Code.UPDATE_OK);
        }else{
            return new Result(null,Code.UPDATE_ERR);
        }
    }

    /*
     * 添加
     * */
    @PostMapping
    public Result add(User user){
        if(userService.add(user)>1){
            return new Result(null,Code.UPDATE_OK);
        }else{
            return new Result(null,Code.UPDATE_ERR);
        }
    }

    /*
     * 根据ID删除
     * */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Integer integer = userService.deleteById(id);
        return new Result(null,Code.DELETE_OK);
    }
}
