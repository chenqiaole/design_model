package com.believe.you.design.builderpattern.example;

import java.awt.*;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/14 17:27
 */
public class PersonThinBuilder extends PersonBuilder {
    
    public PersonThinBuilder(Pen p) {
        super(null, p);
    }
    
    @Override
    public void buildHead() {
        g.drawArc(10,50,20,30,30,20);
    }
    
    @Override
    public void buildBody() {
        g.drawRect(20,30,40,50);
    }
    
    @Override
    public void buildArmLeft() {
        g.drawLine(60,40,20,10);
    }
    
    @Override
    public void buildArmRight() {
        g.drawLine(60,40,20,10);
    }
    
    @Override
    public void buildLegLeft() {
        g.drawLine(60,40,20,10);
    }
    
    @Override
    public void buildLegRight() {
        g.drawLine(60,40,20,10);
    }
}
