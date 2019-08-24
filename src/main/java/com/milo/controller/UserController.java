package com.milo.controller;


import com.milo.bean.User;
import com.milo.service.UserService;
import com.milo.serviceImpl.UseConfigUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    private static Logger logger = LogManager.getLogger();

    @Autowired
    private UserService userService;

    @RequestMapping("/post")
    @ResponseBody
    public User findUserByIdPost(@RequestParam("id") Integer id) {
        User user = userService.findUserById(id);
        System.out.println("get user haha" + id + " " + System.currentTimeMillis());
        logger.info(user.toString());
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User findUserById(@PathVariable("id") Integer id) {
        User user = userService.findUserById(id);
        System.out.println("get user haha" + id + " " + System.currentTimeMillis());
        logger.info(user.toString());
        return user;
    }
}
