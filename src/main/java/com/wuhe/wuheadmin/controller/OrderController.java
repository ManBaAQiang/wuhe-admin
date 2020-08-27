package com.wuhe.wuheadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName OrderController
 * @Description :
 * @Date 2020/8/25 14:24
 * @Version 1.0
 **/

@Controller
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/index")
    String index() {
        return "Hello World! this is from /order/index。";
    }
}