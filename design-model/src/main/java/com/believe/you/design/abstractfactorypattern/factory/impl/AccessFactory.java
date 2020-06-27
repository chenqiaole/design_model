package com.believe.you.design.abstractfactorypattern.factory.impl;

import com.believe.you.design.abstractfactorypattern.dao.impl.AccessDepartment;
import com.believe.you.design.abstractfactorypattern.dao.IDepartment;
import com.believe.you.design.abstractfactorypattern.dao.IUser;
import com.believe.you.design.abstractfactorypattern.dao.impl.AccessUser;
import com.believe.you.design.abstractfactorypattern.factory.IFactory;

public class AccessFactory implements IFactory {
    
    @Override
    public IUser createUser() {
        return new AccessUser();
    }
    
    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
    
}