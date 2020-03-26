package com.naolu.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @ClassName : APIResultVO
 * @Description : 数据封装，统一返回对象
 * @Author : Zhaocunwei
 * @Date: 2020-03-24 14:27
 */
@JsonInclude
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class APIResultVO  {
    private int status;
    private String message;
    private Object data;
}
