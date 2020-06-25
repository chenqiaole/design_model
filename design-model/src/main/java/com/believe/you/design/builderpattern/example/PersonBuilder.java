package com.believe.you.design.builderpattern.example;

import java.awt.*;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/14 17:25
 */
public abstract class PersonBuilder {
    protected Graphics g;
    protected Pen p;
    
    public PersonBuilder(Graphics g, Pen p) {
        this.g = g;
        this.p = p;
    }
    
    public abstract void buildHead();
    
    public abstract void buildBody();
    
    public abstract void buildArmLeft();
    
    public abstract void buildArmRight();
    
    public abstract void buildLegLeft();
    
    public abstract void buildLegRight();
}
