package com.believe.you.design.abstractfactorypattern.factory;

import com.believe.you.design.abstractfactorypattern.dao.IDepartment;
import com.believe.you.design.abstractfactorypattern.dao.IUser;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/26 17:01
 */
public interface IFactory {
    
    IUser createUser();
    
    IDepartment createDepartment();
}
