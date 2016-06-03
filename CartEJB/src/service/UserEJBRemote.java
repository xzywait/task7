package service;

import javax.ejb.Remote;

@Remote
public interface UserEJBRemote {
	public void init(String userName,String password);
}
