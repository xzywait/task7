package service;

import javax.ejb.Remote;

import entities.Goods;

@Remote
public interface CartEJBRemote {
	public void addGoods(Goods goods);
	public void deleteGoods(Goods goods);
}
