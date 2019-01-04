package com.meice.meiceclent.feign.feign;


import com.meice.meiceclent.feign.feign.hystrix.BusinessLogFeignClientHystrix;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

/**
 * Feign调用
 * @author: tp
 * @version: v 0.1 2018年11月14日
 */
@FeignClient(name = "meice-service", fallback = BusinessLogFeignClientHystrix.class)
public interface BusinessLogFeignClient {
    @PostMapping("/service/serviceTestController/queryPage")
    @ApiOperation(value="swaagerTitle",notes = "详细描述")
    Integer queryPage(@RequestBody @Valid String request);
}
