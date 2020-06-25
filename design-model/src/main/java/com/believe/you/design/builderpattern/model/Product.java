package com.believe.you.design.builderpattern.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/14 17:51
 */
public class Product {
    private List<String> parts = new ArrayList<>();
    
    public void add(String part) {
        parts.add(part);
    }
    
    public void show() {
        System.out.println("产品 创建------");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
