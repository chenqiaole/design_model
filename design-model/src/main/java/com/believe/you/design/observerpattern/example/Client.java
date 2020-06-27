package com.believe.you.design.observerpattern.example;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/27 16:17
 */
public class Client {
    
    public static void main(String[] args) {
        NewsProvider newsProvider = new NewsProvider();
        User user;
        for (int i = 0; i < 3; i++) {
            user = new User("user:" + i);
            newsProvider.register(user);
        }
    }
}
