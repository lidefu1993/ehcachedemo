package com.ldf.ehcache.controller;

import com.ldf.ehcache.service.TestService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ldf on 2018/6/27.
 */
@RestController
@RequestMapping(value = "test")
public class TestController {

    @Autowired
    private TestService testService;

    @ApiOperation(value = "用户数据")
    @RequestMapping(value = "getUsers", method = RequestMethod.GET)
    public Object getUsers(){
        return testService.getUsers();
    }

}
