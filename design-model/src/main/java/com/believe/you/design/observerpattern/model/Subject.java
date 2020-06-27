package com.believe.you.design.observerpattern.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/27 17:07
 */
public abstract class Subject {
    
    private List<Observer> observers = new ArrayList<>();
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
