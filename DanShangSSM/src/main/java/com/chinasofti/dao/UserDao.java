package com.chinasofti.dao;

import com.chinasofti.pojo.User;
public interface UserDao {
//  ע�� 
	void register();
//  ��¼ 
	void login(String name,String password);
//	�޸�����
	void updatePassword(String password,String newPassword);
//	��ѯ������Ϣ
	User  sfindOne(long userid);
}
