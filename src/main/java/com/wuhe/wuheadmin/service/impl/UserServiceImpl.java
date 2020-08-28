package com.wuhe.wuheadmin.service.impl;

import com.wuhe.wuheadmin.entity.User;
import com.wuhe.wuheadmin.mapper.UserMapper;
import com.wuhe.wuheadmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName UserServiceImpl
 * @Description :
 * @Date 2020/8/27 21:55
 * @Version 1.0
 **/

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User queryUserInfo(Integer id) {

        return userMapper.queryUser(id);
    }
}
