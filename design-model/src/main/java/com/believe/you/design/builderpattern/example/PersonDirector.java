package com.believe.you.design.builderpattern.example;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/14 17:30
 */
public class PersonDirector {
    
    private PersonBuilder pb;
    
    //传入具体的实现类来表示想建造什么样的小人
    public PersonDirector(PersonBuilder pb) {
        this.pb = pb;
    }
    
    //根据用户的选择来调用具体实现类的方法建造具体的小人
    public void createPerson(){
        pb.buildArmLeft();
        pb.buildArmRight();
        pb.buildBody();
        pb.buildHead();
        pb.buildLegLeft();
        pb.buildLegRight();
    }
}
