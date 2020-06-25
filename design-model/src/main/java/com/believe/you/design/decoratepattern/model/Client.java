package com.believe.you.design.decoratepattern.model;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/15 1:52
 */
public class Client {
    public static void main(String[] args) {
        //待装饰的对象
        ConcreteComponent concreteComponent = new ConcreteComponent();
        //装饰类A
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        //装饰类B
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();
        //A装饰组件
        concreteDecoratorA.setComponent(concreteComponent);
        concreteDecoratorB.setComponent(concreteDecoratorA);
        //b的operation方法增强过了，同时会调用父类的operation方法,而父类的operation方法是调用传进来的
        concreteDecoratorB.operation();
    }
}
