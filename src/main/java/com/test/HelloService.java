package com.test;

import java.util.List;

import com.test.model.Item;

public class HelloService {

	public Item sayHello(Item item) {
		if(item.getType().equals("tea")) {
			item.setName("Hello, Thanks for Order Tea");
		}else {
			item.setName("Hello, Thanks for Order Coffee");
		}
		return item;
	}
	
	public void printOutput(List<String> msgs) {
		msgs.forEach(System.out::println);
	}
	
}
