package com.believe.you.design.builderpattern.model;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/14 18:03
 */
public abstract class Builder {
    
    public abstract void buildPartA();
    
    public abstract void buildPartB();
    
    public abstract Product getResult();
}
