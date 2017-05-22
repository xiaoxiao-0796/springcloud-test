package com.xiaofei.spring.ribbon.web;

import com.xiaofei.spring.ribbon.service.ProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/5/19 0019 ProjectName: spring-cloud-tets
 */
@RestController
public class RibbonController {

    @Autowired
    ProService proService;

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public String add(){
        return proService.addService();
    }
}
