package service;

import java.util.List;

import com.sun.xml.internal.ws.developer.Stateful;

import entities.Goods;

@Stateful
public class CartEJB implements CartEJBLocal, CartEJBRemote {
	//用户
	public UserEJB user;
	//商品
	public List<Goods> contents;
	
	public void addGoods(Goods goods) {
		
		this.contents.add(goods);
	}

	public void deleteGoods(Goods goods) {
		
		this.contents.remove(goods);
	}



}
