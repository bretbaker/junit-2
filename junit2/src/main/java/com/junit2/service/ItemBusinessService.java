package com.junit2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.junit2.data.ItemRepository;
import com.junit2.model.Item;

@Component
public class ItemBusinessService {
	
	@Autowired
	private ItemRepository repository;

	public Item retrieveHardcodedItem() {
		return new Item(1, "name", 10, 100);
	}
	
	public List<Item> retrieveAllItems() {
		List<Item> items = repository.findAll();
		for (Item item : items) {
			item.setValue(item.getPrice() * item.getQuantity());
		}
		return items;
	}

}
