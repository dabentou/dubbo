package com.dubbo.service;


import com.dubbo.bean.User;

import java.util.List;

/**
 * Created by Administrator on 2016/12/29.
 */
public interface DemoService {

    String sayHello(String name);

    public List<User> getUsers();
}
