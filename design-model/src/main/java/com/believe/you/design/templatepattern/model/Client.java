package com.believe.you.design.templatepattern.model;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/25 23:23
 */
public class Client {
    
    public static void main(String[] args) {
        AbstractClass c;
        c = new ConcreteClassA();
        c.templateMethod();
        
        c = new ConcreteClassB();
        c.templateMethod();
    }
}
