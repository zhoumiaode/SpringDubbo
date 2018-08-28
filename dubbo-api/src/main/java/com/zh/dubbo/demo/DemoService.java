package com.zh.dubbo.demo;

import java.util.List;

/**
 * @ProjectName: DubboDemos
 * @Package: com.zh.dubbo.demo
 * @ClassName: DemoService
 * @Description: java类作用描述
 * @Author: zhoumiaode
 * @CreateDate: 2018/08/28 16:55
 * @UpdateUser: Neil.Zhou
 * @UpdateDate: 2018/08/28 16:55
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}
