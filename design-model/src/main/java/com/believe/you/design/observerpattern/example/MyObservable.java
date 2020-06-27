package com.believe.you.design.observerpattern.example;

/**
 * @Author: qiaole
 * @Description: 被观察者接口定义
 * @Date: Created in 2020/6/27 16:04
 */
public interface MyObservable {
    
    void register(MyObserver myObserver);
    
    void remove(MyObserver myObserver);
    
    void send(NewsModel newsModel);
}
