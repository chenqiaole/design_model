package com.believe.you.design.templatepattern.example;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/25 23:07
 */
public class Client {
    
    public static void main(String[] args) {
        System.out.println("学生甲抄的试卷：");
        TestPaper studentA = new TestPaperA();
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();
        System.out.println("学生乙抄的试卷：");
        TestPaper studentB = new TestPaperB();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();
    }
}
