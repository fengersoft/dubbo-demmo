package com.fengersoft.customer.controller;

import com.fengersoft.api.model.UserInfo;
import com.fengersoft.api.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @DubboReference(loadbalance ="roundrobin")
    private UserService userService;

    @RequestMapping("/getAll")
    public List<UserInfo> getAll(){
        return userService.getAll();
    }
}
