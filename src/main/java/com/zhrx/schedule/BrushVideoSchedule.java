package com.zhrx.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class BrushVideoSchedule {


    @Scheduled(cron = "0/5 * * * * ?")
    public void brushVideo() {
        System.out.println("开始执行定时任务");
        String test = "sdfasdf";
        try {
//            Runtime.getRuntime().exec("nox_adb shell /system/bin/screencap  -p /sdcard/screenshot.png");
//            Runtime.getRuntime()
//                    .exec("nox_adb pull /sdcard/screenshot.png E:/png/screenshot.png");
//            Runtime.getRuntime()
//                    .exec("nox_adb shell input swipe 540 480 540 100 ");
            Runtime.getRuntime()
                    .exec("nox_adb shell input tap 800 1550  ");
            Runtime.getRuntime()
                    .exec("nox_adb shell input tap 800 50  ");
            int i = (int) (15000 + Math.random() * (30000 - 10000));
            Thread.sleep(i);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("执行完成");

    }


}
