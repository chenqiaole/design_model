package com.believe.you.design.builderpattern.model;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/14 18:07
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        //建造者，类似图纸的角色，描述要构建的产品的样子
        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();
        //指挥者，类似工人或者生产线，根据图纸来组装产品
        director.construct(builder1);
        Product product1 = builder1.getResult();
        product1.show();
        
        director.construct(builder2);
        Product product2 = builder2.getResult();
        product2.show();
    }
    
}
