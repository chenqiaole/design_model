package com.believe.you.design.decoratepattern.model;

/**
 * @Author: qiaole
 * @Description: 装饰抽象类，继承了Component,从外来类来扩展Component类的功能，
 * * 但对于Component来说是不需要知道Decorator的存在的。
 * @Date: Created in 2020/6/15 1:47
 */
public class Decorator extends Component {
    
    protected Component component;
    
    public void setComponent(Component component) {
        this.component = component;
    }
    
    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
