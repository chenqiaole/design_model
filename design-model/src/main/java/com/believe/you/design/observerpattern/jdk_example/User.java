package com.believe.you.design.observerpattern.jdk_example;

import com.believe.you.design.observerpattern.example.NewsModel;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/27 16:57
 */
public class User implements Observer {
    
    private String mName;
    
    public User(String mName) {
        this.mName = mName;
    }
    
    @Override
    public void update(Observable o, Object data) {
        NewsModel model = (NewsModel) data;
        System.out.println(mName + " receive news:" + model.getTitle() + "  " + model.getContent());
    }
}
