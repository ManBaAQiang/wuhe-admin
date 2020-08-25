package com.wuhe.wuheadmin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController
 * @Description :
 * @Date 2020/8/25 14:42
 * @Version 1.0
 **/

@RestController
public class IndexController {

    @RequestMapping(method = RequestMethod.GET,value = "/")
    @ResponseBody
    public String index(){
        return "Hello World! this is WuHeWeb !!";
    }

}
