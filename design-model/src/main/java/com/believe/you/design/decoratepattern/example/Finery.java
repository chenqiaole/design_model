package com.believe.you.design.decoratepattern.example;

/**
 * @Author: qiaole
 * @Description: 服饰类
 * @Date: Created in 2020/6/15 1:20
 */
public class Finery extends Person {
    
    protected Person component;
    
    public void decorate(Person component) {
        this.component = component;
        
    }
    
    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
    
}
