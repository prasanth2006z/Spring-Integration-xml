package com.test.aggregator;

import java.util.ArrayList;
import java.util.List;

import com.test.model.Item;

public class GenericAggregator {
	
	public List<String> aggregateResult(List<Item> items) {
		List<String> drinks=new ArrayList<>();
		
		if(items!=null && items.size()>0) {
			for(Item item:items) {
				if(item.getType().equals("tea")) {
					drinks.add(item.getName()+", Your Order is Ready!!!");
				}else {
					drinks.add(item.getName()+", Your Order is Ready!!!");
				}
			}
		}
		return drinks;
	}

}
