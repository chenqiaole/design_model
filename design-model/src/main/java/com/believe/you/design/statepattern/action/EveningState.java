package com.believe.you.design.statepattern.action;

import com.believe.you.design.statepattern.bean.WState;
import com.believe.you.design.statepattern.bean.Work;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/14 15:44
 */
public class EveningState extends WState {
    @Override
    public void writeProgram(Work work) {
        if (work.isFinish()){
            work.setCurrent(new RestState());
            work.writeProgram();
        }else if (work.getHour()<21){
            System.out.println(String.format("当前的时间:%s 点，加班哦，疲累至极", work.getHour()));
        }else {
            //超过21点，则转入睡眠工作状态
            work.setCurrent(new SleepingState());
            work.writeProgram();
        }
    }
}
