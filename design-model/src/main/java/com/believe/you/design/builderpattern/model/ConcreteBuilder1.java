package com.believe.you.design.builderpattern.model;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/14 18:05
 */
public class ConcreteBuilder1 extends Builder {
    private Product product = new Product();
    
    @Override
    public void buildPartA() {
        product.add("部件A");
    }
    
    @Override
    public void buildPartB() {
        product.add("部件B");
    }
    
    @Override
    public Product getResult() {
        return product;
    }
}
