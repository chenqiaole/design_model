package com.believe.you.design.abstractfactorypattern.dao.impl;

import com.believe.you.design.abstractfactorypattern.bean.User;
import com.believe.you.design.abstractfactorypattern.dao.IUser;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/26 17:52
 */
public class SqlServerUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在SQL Server中给User表增加一条记录");
    }
    
    @Override
    public User getUser(int id) {
        System.out.println("在SQL Server中根据ID得到User表一条记录");
        return null;
    }
}
