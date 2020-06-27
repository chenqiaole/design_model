package com.believe.you.design.abstractfactorypattern.factory.impl;

import com.believe.you.design.abstractfactorypattern.dao.IDepartment;
import com.believe.you.design.abstractfactorypattern.dao.impl.SqlServerDepartment;
import com.believe.you.design.abstractfactorypattern.factory.IFactory;
import com.believe.you.design.abstractfactorypattern.dao.IUser;
import com.believe.you.design.abstractfactorypattern.dao.impl.SqlServerUser;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/26 17:51
 */
public class SqlServerFactory implements IFactory {
    
    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }
    
    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }
}
