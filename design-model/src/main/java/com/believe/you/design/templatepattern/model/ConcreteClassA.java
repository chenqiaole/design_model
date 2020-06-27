package com.believe.you.design.templatepattern.model;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/25 23:22
 */
public class ConcreteClassA extends AbstractClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("具体类A方法1实现");
    }
    
    @Override
    public void primitiveOperation2() {
        System.out.println("具体类A方法2实现");
    }
}
