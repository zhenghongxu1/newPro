package com.chinasofti.dao.impl;

import org.springframework.stereotype.Repository;

import com.chinasofti.dao.UserDao;
import com.chinasofti.pojo.User;

@Repository
public class UserDaoImpl implements UserDao{
 
	@Override
	public void register() {
		System.out.println("ʵ��ע�ᣡ");
	}

	@Override
	public void login(String usernam, String password) {
		System.out.println("ʵ�ֵ�¼��");
		
	}

	@Override
	public void updatePassword(String password, String newPassword) {
		System.out.println("ʵ���޸����룡");
		
	}

	@Override
	public User sfindOne(long userid) {
		System.out.println("ʵ��chaxun��");
		return null;
	}


}
