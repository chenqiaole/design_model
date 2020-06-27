package com.believe.you.design.abstractfactorypattern.dao.impl;

import com.believe.you.design.abstractfactorypattern.bean.User;
import com.believe.you.design.abstractfactorypattern.dao.IUser;

public class AccessUser implements IUser {
	
	@Override
	public void insert(User user) {
		System.out.println("在Access中给User表增加一条记录");
	}

	@Override
	public User getUser(int id) {
		System.out.println("在Access中根据ID得到User表一条记录");
		return null;
	}

}