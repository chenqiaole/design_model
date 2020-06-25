package com.believe.you.design.statepattern.action;

import com.believe.you.design.statepattern.bean.Context;
import com.believe.you.design.statepattern.bean.WState;
import com.believe.you.design.statepattern.bean.Work;

/**
 * @Author: qiaole
 * @Description: 上午工作状态
 * @Date: Created in 1:52 2020/6/14
 */
public class ForenoonState extends WState {
    
    @Override
    public void writeProgram(Work work) {
        if (work.getHour()<12){
            System.out.println(String.format("当前的时间：%s点 上午工作，精神百倍", work.getHour()));
        }else{
            //超过十二点，就转入中午工作状态
            work.setCurrent(new NoonState());
            work.writeProgram();
        }
    }
}
