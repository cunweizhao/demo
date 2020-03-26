package com.naolu.filter;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

/**
 * @ClassName : AbstractPostZuulFilter
 * @Description : AbstractPostZuulFilter
 * @Author : Zhaocunwei
 * @Date: 2020-03-24 17:44
 */
public abstract class AbstractPostZuulFilter extends AbstractZuulFilter{
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }
}
