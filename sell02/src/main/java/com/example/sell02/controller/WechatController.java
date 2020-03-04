package com.example.sell02.controller;

import me.chanjar.weixin.common.annotation.Required;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import me.chanjar.weixin.mp.config.WxMpConfigStorage;
import me.chanjar.weixin.mp.config.impl.WxMpDefaultConfigImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/wechat")
@Controller
public class WechatController {
    @Autowired
    private WxMpService wxMpService;
@GetMapping("/authorize")
    public  String  authorize(@RequestParam("returnUrl") String returnUrl){

//    config success.................................
    String url="https://van.mynatapp.cc/wechat/userInfo";
   String redirectUrl= wxMpService.oauth2buildAuthorizationUrl(url,WxConsts.OAuth2Scope.SNSAPI_USERINFO,returnUrl);
   return "redirect:"+redirectUrl;
}
@GetMapping("userInfo")
    public  String  userInfo(@RequestParam("code") String code,
                          @RequestParam("state") String returnUrl) throws  Exception{

    WxMpOAuth2AccessToken wxMpOAuth2AccessToken = wxMpService.oauth2getAccessToken(code);
    String openId=wxMpOAuth2AccessToken.getOpenId();
    return "redirect:"+returnUrl+"?openId="+openId;

}
}
