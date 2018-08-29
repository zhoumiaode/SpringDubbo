package com.zh.dubbo.demo.impl;

import com.zh.dubbo.demo.Demo1Service;

/**
 * @ProjectName: DubboDemos
 * @Package: com.zh.dubbo.demo.impl
 * @ClassName: Demo1ServiceImpl
 * @Description: java类作用描述
 * @Author: zhoumiaode
 * @CreateDate: 2018/08/29 13:59
 * @UpdateUser: Neil.Zhou
 * @UpdateDate: 2018/08/29 13:59
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
public class Demo1ServiceImpl implements Demo1Service {
    @Override
    public String sayHello(String msg) {
        return msg;
    }
}
