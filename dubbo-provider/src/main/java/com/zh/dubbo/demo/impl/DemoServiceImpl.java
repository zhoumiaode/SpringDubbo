package com.zh.dubbo.demo.impl;

import com.zh.dubbo.demo.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: DubboDemos
 * @Package: com.zh.dubbo.demo.impl
 * @ClassName: DemoServiceImpl
 * @Description: java类作用描述
 * @Author: zhoumiaode
 * @CreateDate: 2018/08/28 17:18
 * @UpdateUser: Neil.Zhou
 * @UpdateDate: 2018/08/28 17:18
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
