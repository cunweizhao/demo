package com.naolu.controller;

import com.naolu.vo.APIResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : GetResultController
 * @Description : 测试类
 * @Author : Zhaocunwei
 * @Date: 2020-03-24 14:14
 */
@RestController
@Slf4j
public class GetResultController {
    private final APIResultVO apiResultVO;

    public GetResultController(APIResultVO apiResultVO) {
        this.apiResultVO = apiResultVO;
    }

    @GetMapping("/clientB/get")
    public APIResultVO getApiResultVO(){
        APIResultVO apiResultVO = new APIResultVO();
        apiResultVO.setData("");
        apiResultVO.setMessage("clientB-1");
        apiResultVO.setStatus(200);
        log.info("******clientB-1*******");
        return apiResultVO;
    }
}
