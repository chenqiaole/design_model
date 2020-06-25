package com.believe.you.design.statepattern.action;

import com.believe.you.design.statepattern.bean.WState;
import com.believe.you.design.statepattern.bean.Work;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/14 15:48
 */
public class RestState extends WState {
    @Override
    public void writeProgram(Work work) {
        System.out.println(String.format("当前时间：%s点，下班回家了", work.getHour()));
    }
}
