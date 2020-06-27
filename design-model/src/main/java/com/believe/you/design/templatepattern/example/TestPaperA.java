package com.believe.you.design.templatepattern.example;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/25 18:44
 */
public class TestPaperA extends TestPaper {
    
    @Override
    protected String answer1() {
        return "b";
    }
    
    @Override
    protected String answer2() {
        return "c";
    }
    
    @Override
    protected String answer3() {
        return "a";
    }
}
