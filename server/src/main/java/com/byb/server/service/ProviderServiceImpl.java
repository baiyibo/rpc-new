package com.byb.server.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.byb.commonservice.server.ProviderService;

/**
 * @ClassName ProviderServiceImpl
 * @Description TODO
 * @Author BaiYiBo
 * @Date 2019/10/30 11:17
 * @Version 1.0.0
 **/
@Service(version = "1.0.0")
@org.springframework.stereotype.Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String providerStr() {
        return "this is provider";
    }
}
