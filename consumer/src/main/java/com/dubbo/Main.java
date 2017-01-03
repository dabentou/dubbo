package com.dubbo;

import com.dubbo.bean.User;
import com.dubbo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2016/12/29.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext(new String[]{"/spring/applicationContext.xml"});
        DemoService demoService = (DemoService)context.getBean("demoService");
        String hello = demoService.sayHello("tom");
//        System.out.printf(hello);

        List<User> list = demoService.getUsers();
        if(list != null && list.size() > 0){
            for(int i=0;i<list.size();i++) {
                System.out.printf(list.get(i).getName());
            }
        }
        System.in.read();//为保证服务一直开着，利用输入流的阻塞来模拟
    }
}
