package com.believe.you.design.statepattern.action;

import com.believe.you.design.statepattern.bean.WState;
import com.believe.you.design.statepattern.bean.Work;

/**
 * @Author: qiaole
 * @Description: 中午的工作状态
 * @Date: Created in 2020/6/14 2:03
 */
public class AfternoonState extends WState {
    
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.println(String.format("当前的时间是:%s点  下午状态还不错，继续努力", work.getHour()));
        }else{
            work.setCurrent(new EveningState());
            work.writeProgram();
        }
    }
}
