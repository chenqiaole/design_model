package com.believe.you.design.abstractfactorypattern;

import com.believe.you.design.abstractfactorypattern.bean.Department;
import com.believe.you.design.abstractfactorypattern.bean.User;
import com.believe.you.design.abstractfactorypattern.dao.IDepartment;
import com.believe.you.design.abstractfactorypattern.dao.IUser;
import com.believe.you.design.abstractfactorypattern.factory.IFactory;
import com.believe.you.design.abstractfactorypattern.factory.impl.AccessFactory;
import com.believe.you.design.abstractfactorypattern.factory.impl.SqlServerFactory;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/26 17:57
 */
public class Client {
    public static void main(String[] args) {
        User user = new User();
        Department dept = new Department();
        //IFactory factory = new AccessFactory();
        IFactory factory=new SqlServerFactory();
        IUser iu = factory.createUser();
        iu.insert(user);
        iu.getUser(1);
        
        IDepartment id = factory.createDepartment();
        id.insert(dept);
        id.getDepartment(1);
    }
}
