package com.naolu.task;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

/**
 * @ClassName : SaticScheduleTask
 * @Description : 定时任务
 * @Author : Zhaocunwei
 * @Date: 2020-03-26 17:41
 */
@Configuration
@EnableScheduling
public class SaticScheduleTask {
    @Scheduled(cron = "0/5 * * * * ?")
    private void configureTasks() {
        System.err.println("*****************循环开始时间: " + LocalDateTime.now()+"*****************");
        for(int i=0;i<100;i++){
            System.out.println("----------循环进行中: " + LocalDateTime.now()+"----------");
        }
        System.err.println("==================循环结束时间: " + LocalDateTime.now()+"==================");

    }
}
