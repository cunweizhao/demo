package com.naolu.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName : PreRequestFilter
 * @Description : 在过滤器中存储客户端发起请求的时间戳
 * @Author : Zhaocunwei
 * @Date: 2020-03-24 18:17
 */
@Component
@Slf4j
public class PreRequestFilter extends AbstractPreZuulFilter {

    @Override
    protected Object cRun() {
        context.set("startTime",System.currentTimeMillis());
        return success();
    }

    @Override
    public int filterOrder() {
        return 0;
    }
}
