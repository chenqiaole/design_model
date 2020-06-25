package com.believe.you.design.statepattern;

import com.believe.you.design.statepattern.bean.Work;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/14 15:54
 */
public class Client {
    public static void main(String[] args) {
        Work emergencyProjects=new Work();
        emergencyProjects.setHour(9);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(20);
        emergencyProjects.writeProgram();
    }
}
