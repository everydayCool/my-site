package com.huang.mysite.controller;

import com.huang.mysite.utils.APIResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api("用户管理类")
@Controller
@RequestMapping(value = "/user")
public class UserController {


    @ApiOperation("登录")
    @PostMapping(value = "/login")
    @ResponseBody
    public APIResponse tologin(HttpServletRequest request,
                               HttpServletResponse response,
                               @ApiParam(name = "username", value = "用户名", required = true)
                               @RequestParam(name = "username", required = true)
                                       String username,
                               @ApiParam(name = "password", value = "Me密码", required = true)
                               @RequestParam(name = "password", required = true)
                                       String password,
                               @ApiParam(name = "remeberMe", value = "记住我", required = false)
                               @RequestParam(name = "remeberMe", required = false)
                                       String remeberMe) {






        return null;
    }

}













