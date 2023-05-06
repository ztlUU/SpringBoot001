package com.ztl.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ztl.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
