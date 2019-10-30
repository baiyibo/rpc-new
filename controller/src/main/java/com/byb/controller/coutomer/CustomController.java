package com.byb.controller.coutomer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.byb.commonservice.server.ProviderService;
import com.byb.commonservice.server1.ProviderService1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName CustomController
 * @Description TODO
 * @Author BaiYiBo
 * @Date 2019/10/30 13:04
 * @Version 1.0.0
 **/
@RestController
public class CustomController {

    @Reference(version = "1.0.0")
    private ProviderService providerService;

    @Reference(version = "1.0.0")
    private ProviderService1 providerService1;

    @RequestMapping("/getProvider")
    public String getProvider() {
        return providerService.providerStr();
    }

    @RequestMapping("/getProvider1")
    public String getProvider1() {
        return providerService1.providerStr1();
    }
}
