package com.naolu.feign;

import com.naolu.hystrix.ClientBHystrix;
import com.naolu.vo.APIResultVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName : ClientB
 * @Description : 服务A调用服务B的接口
 * @Author : Zhaocunwei
 * @Date: 2020-03-24 15:49
 */
@FeignClient(name = "clientB",
        fallback = ClientBHystrix.class)
public interface ClientBServer {
    @GetMapping("/clientB/get")
    APIResultVO clientBMethodGet();
}
