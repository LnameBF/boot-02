package com.example.web01.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Controller
 * @ResponseBody
 */
@Controller
@ResponseBody
public class UserController {
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String GetUser(){
        System.out.println("Get");
        return "get";
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String PostUser(){
        System.out.println("post");
        return "post";
    }
    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String DeleteUser(){
        System.out.println("delete");
        return "delete";
    }
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String PutUser(){
        System.out.println("put");
        return "put";
    }

}
