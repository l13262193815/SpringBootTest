package com.java.controller;

import com.java.pojo.User;
import com.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户模块
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 你好
     * @return
     */
    @RequestMapping("word")
    public @ResponseBody String sayHello(){
        System.out.println("Hi");
        return "success";
    }

    @GetMapping("/{id}")
    public @ResponseBody String queryUserById(@PathVariable("id") Long i){
        User user = userService.queryUserById(i);
        System.out.println(i);
        return user+"";
    }

    @GetMapping("del/{ids}")
    public @ResponseBody String delete(@PathVariable("ids") Long id){
        userService.deleteById(id);
        return "success";
    }

    @GetMapping("userList")
    public String queryALLUser(Model model){
        List<User> userList = userService.queryAllUser();
        model.addAttribute("list",userList);
        return "query";
    }
}
