package com.chinasofti.dao;

import com.chinasofti.pojo.User;
public interface UserDao {
//  ע��1 
	void register();
//  ��¼ 
	void login(String name,String password);
//	�޸�����
	void updatePassword(String password,String newPassword);
//	��ѯ������Ϣ
	User  sfindOne(long userid);
}
