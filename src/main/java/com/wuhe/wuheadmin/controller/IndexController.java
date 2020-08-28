package com.wuhe.wuheadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName IndexController
 * @Description :
 * @Date 2020/8/25 14:42
 * @Version 1.0
 **/

@Controller
public class IndexController {

//    @RequestMapping(method = RequestMethod.GET,value = "/")
//    @ResponseBody
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("name","wuheAdmin");


        return "index";
    }

    @RequestMapping("/toUser")
    public String toUser(){
        return "redirect:/user/index";
    }

}
