package com.chinasofti.server;


import com.chinasofti.pojo.User;

public interface UserDaoServer {
//  ע��
	void register();
//  ��¼ 
	void login(String name,String password);
//	�޸�����
	void updatePassword(String password,String newPassword);
//	��ѯ������Ϣ
	User  sfindOne(long userid);

}
