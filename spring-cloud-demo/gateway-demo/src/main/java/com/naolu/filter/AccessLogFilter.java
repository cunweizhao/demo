package com.naolu.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName : AccessLogFilter
 * @Description : AccessLogFilter
 * @Author : Zhaocunwei
 * @Date: 2020-03-24 18:07
 */
@Slf4j
@Component
public class AccessLogFilter extends AbstractPostZuulFilter{
    @Override
    public int filterOrder() {
        return FilterConstants.SEND_RESPONSE_FILTER_ORDER-1;
    }

    @Override
    protected Object cRun() {
        HttpServletRequest request  = context.getRequest();
        //从 PreRequestFilter中获取设置的请求时间戳
        Long  startTime=(Long)context.get("startTime");
        String uri= request.getRequestURI();
        long duration = System.currentTimeMillis() -startTime;
        //从网关通过的请求都会打印日志
        log.info("uri:{},duration:{}",uri,duration);
        return success();
    }
}
