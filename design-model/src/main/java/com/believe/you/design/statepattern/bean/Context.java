package com.believe.you.design.statepattern.bean;

import com.believe.you.design.statepattern.bean.State;

/**
 * @Author: qiaole
 * @Description: Context类，维护一个ConcreteState子类的实例，这个实例定义为当前的状态
 * @Date: Created in 1:32 2020/6/14
 * @Modified By:
 */
public class Context {
    //维护一个状态
    private State mState;
    //初始化一个最开始的状态
    public Context(State mState) {
        this.mState = mState;
    }
    
    public State getMState() {
        return mState;
    }
    //设置当前的状态
    public void setMState(State mState) {
        this.mState = mState;
        System.out.println(String.format("当前状态：%s", mState.getClass().getName()));
    }
    //对请求的处理，传入当前的待处理的对象context，并跳转下个状态
    public void request() {
        mState.handle(this);
    }
}
