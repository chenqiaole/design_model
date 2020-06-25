package com.believe.you.design.decoratepattern.model;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/15 1:48
 */
public class ConcreteDecoratorB extends Decorator {
    
    
    @Override
    public void operation() {
        super.operation();
        addBehavior();
        System.out.println("具体装饰对象B的操作" );
        
       
    }
    private void addBehavior(){
        //用来区别ConcreteDecoratorA
    }
}
