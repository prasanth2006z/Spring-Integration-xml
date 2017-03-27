package com.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.gateway.OrderGateWay;
import com.test.model.Item;
import com.test.model.Order;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/HelloWorld.xml", App.class);
		OrderGateWay orderGateWay=(OrderGateWay)context.getBean("orderGateWay");
		
		Item  item=new Item();
		item.setId("1");
		item.setName("Tea");
		item.setType("tea");
		Item  item1=new Item();
		item1.setId("1");
		item1.setName("Coffee");
		item1.setType("coffee");
		
		Order order=new Order();
		List<Item> its=new ArrayList<>();
		its.add(item);
		its.add(item1);
		order.setItems(its);
		orderGateWay.placeOrder(order);
		
	}
}
