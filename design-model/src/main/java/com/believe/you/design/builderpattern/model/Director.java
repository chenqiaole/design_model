package com.believe.you.design.builderpattern.model;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/14 18:06
 */
public class Director {
    
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
