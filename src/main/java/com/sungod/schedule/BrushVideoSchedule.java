package com.sungod.schedule;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

@Component
public class BrushVideoSchedule implements Runnable {

    @Autowired
    DesiredCapabilities desiredCapabilities;


    @Override
    public void run() {
        System.out.println("开始执行定时任务");
//        try {
//            AppiumDriver driver = new AppiumDriver(new URL("http://0.0.0.0:4723"), desiredCapabilities);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
        String test = "sdfasdf";
        try {
            Runtime.getRuntime().exec("nox_adb shell /system/bin/screencap  -p /sdcard/screenshot.png");
            Runtime.getRuntime()
                    .exec("nox_adb pull /sdcard/screenshot.png E:/png/screenshot.png");
            Runtime.getRuntime()
                    .exec("nox_adb shell input swipe 540 480 540 100 ");
//            Runtime.getRuntime()
//                    .exec("nox_adb shell input tap 800 1550  ");
//            Runtime.getRuntime()
//                    .exec("nox_adb shell input tap 800 50  ");
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
