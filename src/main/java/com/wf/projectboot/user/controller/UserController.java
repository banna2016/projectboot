package com.wf.projectboot.user.controller;

import com.wf.projectboot.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @param: $param$
 * @return: $return$
 * @Auther: banna
 * @Date: 2018/5/21 15:46
 * @Description:
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index()
    {
        System.out.print(userService.getUserById(1));
        return "index";
    }

}
