package com.believe.you.design.statepattern.action;

import com.believe.you.design.statepattern.bean.WState;
import com.believe.you.design.statepattern.bean.Work;

/**
 * @Author: qiaole
 * @Description: 中午的工作状态
 * @Date: Created in 2020/6/14 2:03
 */
public class NoonState extends WState {
    
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println(String.format("当前的时间是:%s点  饿了，午饭  午休", work.getHour()));
        }else{
            //超过13点，则转入下午的工作状态
            work.setCurrent(new AfternoonState());
            work.writeProgram();
        }
    }
}
