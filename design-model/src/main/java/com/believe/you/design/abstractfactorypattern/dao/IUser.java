package com.believe.you.design.abstractfactorypattern.dao;

import com.believe.you.design.abstractfactorypattern.bean.User;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 1:09 2020/6/14
 * @Modified By:
 */
public interface IUser {
    
    void insert(User user);
    
    User getUser(int id);
}
