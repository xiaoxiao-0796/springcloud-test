package com.xiaofei.spring.configtest.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/5/22 0022 ProjectName: spring-cloud-tets
 */
@Controller
@RefreshScope
public class TestController {

    @Value("${from}")
    String from;

    @RequestMapping(value = "/a",method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return from;
    }
}
