package com.runtesr.demo.controller;

import com.runtesr.demo.pojo.CardInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController

public class HelloController {

    @Resource CardInfo cardInfo;
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

    @RequestMapping("seythingk")
    public int seythingk(){
        return 0;
    }

    @RequestMapping(value = "sayOk",method = RequestMethod.GET)
    public String sayOk(){
        return "ok";
    }
}
