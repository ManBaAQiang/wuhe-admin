package com.wuhe.wuheadmin.controller;

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

    @RequestMapping("/index")
    @ResponseBody
    String index() {
        return "Hello World! this is from /user/index";
    }
}