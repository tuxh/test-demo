package com.example.shirodemo.cn.services.impl;

import com.example.shirodemo.cn.dao.UserInfoDao;
import com.example.shirodemo.cn.entity.UserInfo;
import com.example.shirodemo.cn.services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo getUserInfoById(String id) {
        return userInfoDao.getUserInfoById(id);
    }
}
