package com.example.web01.controller;
import org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.JobOriginatingUserName;
import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.Map;

/**
 * @Controller
 * @ResponseBody
 */
@RestController
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
    //请求参数名和路径变量一致时
    // @PathVariable
    @GetMapping("/car/{id}")
    public String getCar(@PathVariable Integer id){
        return id.toString();
    }
    //请求参数名和路径变量不一致时
    @GetMapping("/car2/{id}/{username}")
    public Map<String,Object> getCar_two(@PathVariable("id") Integer car_id,
                                         @PathVariable("username")  String username,
                                         @PathVariable Map<String,String> map2
    ){
        Map<String,Object> map=new HashMap<>();
        map.put("id",car_id);
        map.put("username",username);
        map.put("pv",map2);
        System.out.println(map);
        return map;
    }
    //@RequestHeader
    //@RequestParam
    //@RequestParam("age") 获取参数中的指定值
    //@CookieValue
    @GetMapping("/header")
    public Map<String,Object> getHeader(
                            @RequestHeader("User-Agent") String HeadAgent,
                            @RequestHeader Map<String,String> header,
                            @RequestParam("age") Integer id,
                            @CookieValue("Idea-5f7383a9") Cookie cookie){
        Map<String,Object> map=new HashMap<>();
        map.put("headagent",HeadAgent);
        map.put("header_map",header);
        map.put("RequestParam_age",id);
        map.put("cookie",cookie);
        return map;
    }

    @GetMapping("/cookie")
    public Map<String,Object> getCookie(@CookieValue("Idea-5f7383a9") Cookie cookie){
        Map<String,Object> map=new HashMap<>();
        map.put("cookie",cookie);
        System.out.println(cookie);
        return map;
    }

    //@RequestBody
    @PostMapping("/form")
    public Map<String,Object> get_formData(@RequestBody String form_data,
            @CookieValue("Idea-5f7383a9") Cookie cookie){
        Map<String,Object> map=new HashMap<>();
        map.put("form_data",form_data);
        map.put("cookie",cookie);
        System.out.println(cookie);
        return map;
    }


}
