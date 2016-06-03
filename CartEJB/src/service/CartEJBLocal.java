package service;

import javax.ejb.Local;

import entities.Goods;

@Local
public interface CartEJBLocal {
	public void addGoods(Goods goods);
	public void deleteGoods(Goods goods);
}
