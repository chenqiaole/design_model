package com.believe.you.design.templatepattern.example;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/25 18:42
 */
public class TestPaper {
    
    public void testQuestion1() {
        System.out.println("习题。。。。");
        System.out.println("答案：" + answer1());
    }
    
    public void testQuestion2() {
        System.out.println("习题。。。。");
        System.out.println("答案：" + answer2());
    }
    
    public void testQuestion3() {
        System.out.println("习题。。。。");
        System.out.println("答案：" + answer3());
    }
    
    protected String answer3() {
        return "";
    }
    
    protected String answer2() {
        return "";
    }
    
    protected String answer1() {
        return "";
    }
}
