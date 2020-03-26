package com.naolu.controller;

import com.naolu.feign.ClientBServer;
import com.naolu.vo.APIResultVO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : ClientAController
 * @Description : 服务AController
 * @Author : Zhaocunwei
 * @Date: 2020-03-24 15:28
 */
@RestController
@Slf4j
public class ClientAController {

     private final APIResultVO apiResultVO;
     private final ClientBServer clientBServer;

    public ClientAController(APIResultVO apiResultVO, ClientBServer clientBServer) {
        this.apiResultVO = apiResultVO;
        this.clientBServer = clientBServer;
    }

    @GetMapping("/clientA/get")
    public APIResultVO getApiResultVO(){
        return clientBServer.clientBMethodGet();
    }
}
