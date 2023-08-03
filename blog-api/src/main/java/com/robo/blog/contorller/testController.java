package com.robo.blog.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : testController  //类名
 * @Description :   //描述
 * @Author : Rui //作者
 * @Date: 2023/8/3  16:24
 */
@RestController
public class testController {
    @RequestMapping("/login")
    public String login(){
        System.out.println("dadadada");
        return "啊啊啊";
    }
}
