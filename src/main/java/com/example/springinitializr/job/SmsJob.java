package com.example.springinitializr.job;

import com.example.springinitializr.config.SMSProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalTime;
import java.util.List;

@EnableScheduling
@Component
public class SmsJob {

    @Resource
    private SMSProperties smsProperties;

    @Scheduled(cron = "${prop.cronPin}")
    public void cronTask2() {
        int second = LocalTime.now().getSecond();
        System.out.print(second==59 ? second+"\r\n" : second+" ");
    }
}
