package com.believe.you.design.abstractfactorypattern.dao;

import com.believe.you.design.abstractfactorypattern.bean.Department;

/**
 * IDepartment 接口，用于客户端访问，解除与具体数据库访问的耦合
 *
 * @author clarck
 */
public interface IDepartment {
    void insert(Department department);
    
    Department getDepartment(int id);
}