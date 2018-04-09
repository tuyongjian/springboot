package com.tu.springboot.controller;

import com.tu.springboot.model.User;
import com.tu.springboot.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * Created by len on 2018/4/8.
 */
@Controller
@RequestMapping(value="user")
public class userController {

    private static Logger logger = LoggerFactory.getLogger(userController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping(value="index",method = RequestMethod.GET)
    public String index(ModelMap model,
                        @RequestParam(value = "id") int id){
        logger.info("根据id[{}]查询用户",id);
        User user = this.userService.queryUser(id);
        logger.info("查询结果为[{}]---------------",user.toString());
        model.addAttribute("user",user);
        return "index";
    }

    @RequestMapping(value="queryUser")
    public @ResponseBody User queryUser(ModelMap model,
                   @RequestParam(value = "id") int id){
        logger.info("根据id[{}]查询用户------------",id);
        User user = this.userService.queryUser(id);
        logger.info("查询结果为[{}]",user.toString());
        return user;
    }
}
