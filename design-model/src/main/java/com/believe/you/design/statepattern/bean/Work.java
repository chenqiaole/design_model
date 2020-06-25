package com.believe.you.design.statepattern.bean;

import com.believe.you.design.statepattern.action.ForenoonState;

/**
 * @Author: qiaole
 * @Description:工作类
 * @Date: Created in 1:49 2020/6/14
 * @Modified By:
 */
public class Work {
    
    private int hour;
    
    private WState current;
    
    private boolean finish;
    //工作的状态初始化为上午工作状态，即上午9点开始上班，这个很关键，这样才能保证判断分支一直往下走
    public Work() {
        this.current = new ForenoonState();
    }
    
    public boolean isFinish() {
        return finish;
    }
    
    public void setFinish(boolean finish) {
        this.finish = finish;
    }
    
    public int getHour() {
        return hour;
    }
    
    public void setHour(int hour) {
        this.hour = hour;
    }
    
    /**
     * 设置当前状态
     *
     * @param wState
     */
    public void setCurrent(WState wState) {
        this.current = wState;
    }
    
    public void writeProgram() {
        //把具体的工作交给每种状态的具体工作来做，只要把当前的工作对象传给对应的对象即可
        current.writeProgram(this);
    }
    
}
