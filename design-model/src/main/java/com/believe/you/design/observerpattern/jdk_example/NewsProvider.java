package com.believe.you.design.observerpattern.jdk_example;

import com.believe.you.design.observerpattern.example.NewsModel;

import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/27 16:55
 */
public class NewsProvider extends Observable {
    private static final long DELAY = 2 * 1000;
    
    public NewsProvider() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            private int titleCount = 1;
            private int contentCount = 1;
            
            @Override
            public void run() {
                //调用util的Observable的方法
                setChanged(); //调用setChagned方法，将changed域设置为true，这样才能通知到观察者们
                notifyObservers(new NewsModel("title:" + titleCount++, "content:" + contentCount++));
            }
        }, DELAY, 1000);
    }
}
