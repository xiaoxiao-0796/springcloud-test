package com.xaiofei.spring.feign.web;

import com.xaiofei.spring.feign.service.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/5/19 0019 ProjectName: spring-cloud-tets
 */
@RestController
public class FeignController {

    @Autowired
    ServiceClient serviceClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return serviceClient.add(10, 20);
    }
}
