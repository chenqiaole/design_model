package com.believe.you.design.observerpattern.model;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/27 17:25
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject("ABC");
        s.attach(new ConcreteObserver("X", s));
        s.attach(new ConcreteObserver("Y", s));
        s.attach(new ConcreteObserver("Z", s));
        s.notifyObserver();
    }
}
