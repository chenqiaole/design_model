package com.believe.you.design.observerpattern.example;

import lombok.Data;

/**
 * @Author: qiaole
 * @Description: 新闻类
 * @Date: Created in 2020/6/27 16:06
 */

@Data
public class NewsModel {
    private String content;
    
    private String title;
    
    public NewsModel(String content, String title) {
        this.content = content;
        this.title = title;
    }
}
