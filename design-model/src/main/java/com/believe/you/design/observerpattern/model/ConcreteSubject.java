package com.believe.you.design.observerpattern.model;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/27 17:14
 */
public class ConcreteSubject extends Subject {
    
    private String subjectState;
    
    public ConcreteSubject(String subjectState) {
        this.subjectState = subjectState;
    }
    
    public String getSubjectState() {
        return subjectState;
    }
    
    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
