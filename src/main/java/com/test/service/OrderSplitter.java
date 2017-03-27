package com.test.service;

import java.util.List;

import com.test.model.Item;
import com.test.model.Order;

public class OrderSplitter {

	public List<Item> split(Order order){
		return order.getItems();
	}
	
}
