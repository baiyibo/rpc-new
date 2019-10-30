package com.byb.server1.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.byb.commonservice.server.ProviderService;
import com.byb.commonservice.server1.ProviderService1;

/**
 * @ClassName ProviderService1Impl
 * @Description TODO
 * @Author BaiYiBo
 * @Date 2019/10/30 11:17
 * @Version 1.0.0
 **/
@Service(version = "1.0.0")
@org.springframework.stereotype.Service
public class ProviderService1Impl  implements ProviderService1{
    @Override
    public String providerStr1() {
        return "this is provider111111111111";
    }
}
