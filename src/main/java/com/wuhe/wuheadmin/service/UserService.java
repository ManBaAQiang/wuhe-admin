package com.wuhe.wuheadmin.service;

import com.wuhe.wuheadmin.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User queryUserInfo(Integer id);
}
