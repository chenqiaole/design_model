package com.believe.you.design.observerpattern.jdk_example;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/27 16:58
 */
public class Client {
    public static void main(String[] args) {
        NewsProvider newsProvider = new NewsProvider();
        for (int i = 0; i < 3; i++) {
            //主题添加观察者后，就会自己开始去调用观察者的方法update（）来改变状态了
            newsProvider.addObserver(new User("user" + i));
        }
        
    }
}
