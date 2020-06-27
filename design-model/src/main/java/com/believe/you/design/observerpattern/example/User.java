package com.believe.you.design.observerpattern.example;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/27 16:16
 */
public class User implements MyObserver {
    
    private String mName;
    
    public User(String mName) {
        this.mName = mName;
    }
    
    @Override
    public void receive(NewsModel model) {
        System.out.println(mName + "receive news" + model.getTitle() + "    " + model.getContent());
    }
}
