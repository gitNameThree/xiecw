package com.sungod.controller;

import com.sungod.schedule.BrushVideoSchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

@RestController
@RequestMapping("/schedule")
public class SchedultController {

    @Autowired
    private ThreadPoolTaskScheduler threadPoolTaskScheduler;

    private ScheduledFuture<?> singUp;

    private ScheduledFuture<?> singIn;



    @RequestMapping("/startCommand")
    public String startSchedule() {
        singUp = threadPoolTaskScheduler.schedule(new BrushVideoSchedule(),new Trigger(){
            @Override
            public Date nextExecutionTime(TriggerContext triggerContext){
                return new CronTrigger("0/10 * * * * *").nextExecutionTime(triggerContext);
            }
        });

        return "11111";
    }
    @PostMapping("/stopCommand")
    public String stopCron1() {
        if (singUp != null) {
            singUp.cancel(true);
        }
        System.out.println("定时任务关闭");
        return "定时任务关闭成功！";
    }

}
