package com.believe.you.design.decoratepattern.model;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/15 1:48
 */
public class ConcreteDecoratorA extends Decorator {
    
    private String addedState;
    
    @Override
    public void operation() {
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作" + addedState);
    }
}
