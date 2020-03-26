package com.naolu.filter;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

/**
 * @ClassName : AbstractPreZuulFilter
 * @Description : AbstractPreZuulFilter
 * @Author : Zhaocunwei
 * @Date: 2020-03-24 18:05
 */
public abstract class AbstractPreZuulFilter extends AbstractZuulFilter{
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }
}
