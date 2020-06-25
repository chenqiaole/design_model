package com.believe.you.design.builderpattern.example;

import sun.print.PeekGraphics;

import java.awt.*;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/14 17:33
 */
public class Client {
    public static void main(String[] args) {
        Pen p = new Pen(Color.YELLOW);
        //创建瘦的小人
        PersonThinBuilder ptb = new PersonThinBuilder(p);
        PersonDirector pdThin = new PersonDirector(ptb);
        pdThin.createPerson();
        
        //创建胖的小人
        PersonFatBuilder pfb = new PersonFatBuilder(null, p);
        PersonDirector pdFat = new PersonDirector(pfb);
        pdFat.createPerson();
    }
}
