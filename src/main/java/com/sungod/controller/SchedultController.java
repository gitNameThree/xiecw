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

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
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
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        threadPool.
        List list = new LinkedList();
        Map map = new HashMap();
        BrushVideoSchedule brushVideoSchedule = new BrushVideoSchedule();
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
