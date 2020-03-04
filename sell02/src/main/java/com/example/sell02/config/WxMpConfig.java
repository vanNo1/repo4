package com.example.sell02.config;

import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.config.WxMpConfigStorage;
import me.chanjar.weixin.mp.config.impl.WxMpDefaultConfigImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class WxMpConfig {
    @Bean
    public WxMpService wxMpService(){
        WxMpService wxMpService=new WxMpServiceImpl();
        WxMpConfigStorage mpConfigStorage=new WxMpDefaultConfigImpl();
        ((WxMpDefaultConfigImpl) mpConfigStorage).setAppId("wx2bab612e8aa186cc");
        ((WxMpDefaultConfigImpl) mpConfigStorage).setSecret("a29535300bbf29494acb9d6204009c78");
        wxMpService.setWxMpConfigStorage(mpConfigStorage);
        return wxMpService;
    }
}
