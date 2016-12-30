package com.changgx;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Administrator 2016/12/30
 */
@RestController
public class Controller {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }


    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
