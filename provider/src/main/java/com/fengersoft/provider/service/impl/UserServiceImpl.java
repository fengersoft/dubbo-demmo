package com.fengersoft.provider.service.impl;

import com.fengersoft.api.model.UserInfo;
import com.fengersoft.api.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public List<UserInfo> getAll() {
        List<UserInfo> list = new ArrayList<UserInfo>();
        list.add(new UserInfo(1,"张三",22));
        list.add(new UserInfo(2,"李四",24));
        return list;
    }
}
