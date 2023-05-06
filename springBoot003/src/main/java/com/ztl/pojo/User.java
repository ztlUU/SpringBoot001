package com.ztl.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("user") //解决表名不匹配
public class User implements Serializable {

    @TableId(type = IdType.AUTO) //使用数据库自增
    //@TableId(type = IdType.ASSIGN_ID) //MybatisPlus自动分配值
    private Integer id;

    //@TableField(exist = false) //忽略该属性，不添加到数据库
    @TableField("user_name") //解决字段名不匹配
    private String userName;
}
