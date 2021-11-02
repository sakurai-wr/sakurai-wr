package com.runtesr.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello,world";
    }


    @RequestMapping(value = "good",method = RequestMethod.GET)
    public String felth(){
        return "i am a student";
    }

    @RequestMapping(value = "changeid",method = RequestMethod.GET)
    public String changid(){
        return "i haved changed";
    }

    @RequestMapping(value = "svncheck",method = RequestMethod.POST)
    public String svncheck(){
        return "i have check";
    }
}
