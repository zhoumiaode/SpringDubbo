package com.zh.dubbo.demo.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ProjectName: DubboDemos
 * @Package: com.zh.dubbo.demo.impl
 * @ClassName: Provider
 * @Description: java类作用描述
 * @Author: zhoumiaode
 * @CreateDate: 2018/08/28 17:19
 * @UpdateUser: Neil.Zhou
 * @UpdateDate: 2018/08/28 17:19
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }
}
