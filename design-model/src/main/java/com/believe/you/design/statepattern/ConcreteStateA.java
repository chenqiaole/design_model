package com.believe.you.design.statepattern;

import com.believe.you.design.statepattern.bean.Context;
import com.believe.you.design.statepattern.bean.State;

/**
 * @Author: qiaole
 * @Description: 具体的状态A，可以设置下一个状态，相当于条件的判断跳转
 * @Date: Created in 1:37 2020/6/14
 * @Modified By:
 */
public class ConcreteStateA extends State {
    
    @Override
    public void handle(Context context) {
        context.setMState(new ConcreteStateB());    
    }
}
