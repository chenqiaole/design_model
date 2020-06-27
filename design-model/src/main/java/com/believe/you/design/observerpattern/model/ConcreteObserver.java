package com.believe.you.design.observerpattern.model;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/27 17:21
 */
public class ConcreteObserver extends Observer {
    private String name;
    
    private String observerState;
    
    private ConcreteSubject subject;
    
    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }
    
    @Override
    void update() {
        observerState = subject.getSubjectState();
        System.out.println(String.format("观察者%s的新状态是%s", name, observerState));
    }
    
    public ConcreteSubject getSubject() {
        return subject;
    }
    
    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}
