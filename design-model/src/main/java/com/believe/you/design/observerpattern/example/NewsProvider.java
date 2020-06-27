package com.believe.you.design.observerpattern.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/27 16:08
 */
public class NewsProvider implements MyObservable {
    
    private static final long DELAY = 2 * 1000;
    
    private List<MyObserver> myObservers;
    
    public NewsProvider() {
        myObservers = new ArrayList<>();
        generateNews();
    }
    /**
     * 模拟产生新闻，每个2s发送一次
     */
    private void generateNews() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int titleCount = 1;
            int contentCount = 1;
            
            @Override
            public void run() {
                send(new NewsModel("title:" + titleCount++, "content:" + contentCount++));
            }
        }, DELAY, 1000);
    }
    @Override
    public void register(MyObserver myObserver) {
        if (myObserver == null) {
            return;
        }
        synchronized (this) {
            if (!myObservers.contains(myObserver)) {
                myObservers.add(myObserver);
            }
        }
    }
    @Override
    public synchronized void remove(MyObserver myObserver) {
        myObservers.remove(myObserver);
    }
    @Override
    public void send(NewsModel newsModel) {
        for (MyObserver observer : myObservers) {
            observer.receive(newsModel);
        }
    }
}
