package com.believe.you.design.statepattern.action;

import com.believe.you.design.statepattern.bean.WState;
import com.believe.you.design.statepattern.bean.Work;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/14 15:46
 */
public class SleepingState extends WState {
    
    @Override
    public void writeProgram(Work work) {
        System.out.println(String.format("当前时间：%s点，不行了，睡觉了", work.getHour()));    
    }
}
