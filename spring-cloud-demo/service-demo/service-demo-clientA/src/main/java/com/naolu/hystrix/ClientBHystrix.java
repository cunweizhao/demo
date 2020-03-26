package com.naolu.hystrix;

import com.naolu.feign.ClientBServer;
import com.naolu.vo.APIResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @ClassName : ClientBHystrix
 * @Description : 接口熔断降级策略
 * @Author : Zhaocunwei
 * @Date: 2020-03-24 16:25
 */
@Slf4j
@Component
public class ClientBHystrix  implements ClientBServer {
    @Override
    public APIResultVO clientBMethodGet() {
        APIResultVO apiResultVO = new APIResultVO();
        log.info("&&&&&-服务B宕机-&&&&&&");
        apiResultVO.setStatus(200);
        apiResultVO.setData("");
        apiResultVO.setMessage("服务B已经宕机");
        return apiResultVO;
    }
}
