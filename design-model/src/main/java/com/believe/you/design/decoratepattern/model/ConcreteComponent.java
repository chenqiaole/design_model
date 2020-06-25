package com.believe.you.design.decoratepattern.model;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/15 1:46
 */
public class ConcreteComponent extends Component {
    
    @Override
    public void operation() {
        System.out.println("具体的对象操作");
    }
}
