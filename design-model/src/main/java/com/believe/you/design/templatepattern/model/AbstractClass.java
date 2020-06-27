package com.believe.you.design.templatepattern.model;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/25 23:14
 */
public abstract class AbstractClass {
    
    public abstract void primitiveOperation1();
    
    public abstract void primitiveOperation2();
    
    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("模板代码");
    }
}
