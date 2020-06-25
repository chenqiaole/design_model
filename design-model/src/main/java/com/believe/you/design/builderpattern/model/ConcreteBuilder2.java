package com.believe.you.design.builderpattern.model;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/14 18:05
 */
public class ConcreteBuilder2 extends Builder {
    private Product product = new Product();
    
    @Override
    public void buildPartA() {
        product.add("部件X");
    }
    
    @Override
    public void buildPartB() {
        product.add("部件Y");
    }
    
    @Override
    public Product getResult() {
        return product;
    }
}
