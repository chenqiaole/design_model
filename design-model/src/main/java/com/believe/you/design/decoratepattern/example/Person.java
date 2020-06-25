package com.believe.you.design.decoratepattern.example;

/**
 * @Author: qiaole
 * @Description: 待装饰的组件类
 * @Date: Created in 2020/6/15 1:18
 */
public class Person {
    private String name;
    
    public Person() {
    }
    
    public Person(String name) {
        this.name = name;
    }
    
    public void show(){
        System.out.println(String.format("装扮的%s", name));
    }
}
