package com.test.router;

import com.test.model.Item;

public class OrderRouter {

	public String route(Item item) {
		if (item.getType().equals("tea")) {
			return "tea";
		} else {
			return "coffee";
		}
	}
}
