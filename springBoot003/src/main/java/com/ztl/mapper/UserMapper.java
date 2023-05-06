package com.ztl.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ztl.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {


}
