package com.example.shirodemo.cn.dao;

import com.example.shirodemo.cn.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

//@Mapper
public interface UserInfoDao {
    //测试mybatis
    UserInfo getUserInfoById(@Param("userId") String userId);

}
