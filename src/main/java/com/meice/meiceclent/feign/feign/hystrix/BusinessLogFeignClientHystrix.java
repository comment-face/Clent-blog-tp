package com.meice.meiceclent.feign.feign.hystrix;


import com.meice.meiceclent.feign.feign.BusinessLogFeignClient;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 统一熔断机制
 * @author: tp
 * @version: v 0.1 2018年11月14日
 */
@Component
public class BusinessLogFeignClientHystrix implements BusinessLogFeignClient {

    @Override
    public Integer queryPage(String request) {
        return null;
    }
}
