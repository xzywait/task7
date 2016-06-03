package service;

import javax.ejb.Stateful;

import entities.User;

@Stateful(mappedName="user")
public class UserEJB implements UserEJBLocal, UserEJBRemote {
	//用户
	public User user;
	
	public void init(String userName, String password) {
		// TODO Auto-generated method stub
		
		user.setUserName(userName);
		
		user.setPassword(password);
	}

}
