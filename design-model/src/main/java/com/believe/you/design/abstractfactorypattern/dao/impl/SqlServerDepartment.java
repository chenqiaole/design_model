package com.believe.you.design.abstractfactorypattern.dao.impl;

import com.believe.you.design.abstractfactorypattern.bean.Department;
import com.believe.you.design.abstractfactorypattern.dao.IDepartment;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/26 17:48
 */
public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在SQL SERVER中给Department表增加一条记录");
    }
    
    @Override
    public Department getDepartment(int id) {
        System.out.println("在SQL SERVER中根据ID得到Department表一条记录");
        return null;
    }
}
