package com.wuhe.wuheadmin.controller;

import com.alibaba.fastjson.JSONObject;
import com.wuhe.wuheadmin.entity.User;
import com.wuhe.wuheadmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName UserController
 * @Description :
 * @Date 2020/8/25 14:22
 * @Version 1.0
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    String index() {
        return "Hello World! this is from /user/index";
    }

    @RequestMapping("/query/info")
    @ResponseBody
    ResponseEntity<String> getUserInfo(Integer userId) {
        JSONObject result = new JSONObject();
        result.put("user",new User("张三",1));
        return new ResponseEntity<>(result.toJSONString(),HttpStatus.OK);
    }

    @RequestMapping("/query/infoById")
    @ResponseBody
    User getUser(Integer userId) {

        User user = userService.queryUserInfo(userId);
        return user;
    }
}