package com.zh.dubbo.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: DubboDemos
 * @Package: com.zh.dubbo.demo
 * @ClassName: JE
 * @Description: java类作用描述
 * @Author: zhoumiaode
 * @CreateDate: 2018/08/29 14:41
 * @UpdateUser: Neil.Zhou
 * @UpdateDate: 2018/08/29 14:41
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
@RestController
public class JE {

    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String he(){
        return "aa";
    }
}
