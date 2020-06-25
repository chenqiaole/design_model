package com.believe.you.design.statepattern;

import com.believe.you.design.statepattern.bean.Context;
import com.believe.you.design.statepattern.bean.State;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 1:38 2020/6/14
 * @Modified By:
 */
public  class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        context.setMState(new ConcreteStateA());
    }
}
