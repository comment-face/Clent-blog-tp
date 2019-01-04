package com.meice.meiceclent.controller;


import com.meice.meiceclent.feign.feign.BusinessLogFeignClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/testController")
@Api(description = "测试接口")
public class testController {
    private static final Logger LOG = LoggerFactory.getLogger(testController.class);

    @Autowired
    private BusinessLogFeignClient businessLogFeignClient;

    /**
     * 测试
     * @param name
     * @return name
     */
    @PostMapping("/queryPage")
    @ApiOperation(value="测试接口",notes = "对XXX进行测试")
    public Integer queryPage(@RequestBody @Valid String name){
        return  businessLogFeignClient.queryPage(name);
    }


}
