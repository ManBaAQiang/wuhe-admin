package com.wuhe.wuheadmin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Description :
 * @Date 2020/8/25 14:24
 * @Version 1.0
 **/

@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/index")
    String index() {
        return "Hello World! this is from /order/index。";
    }
}