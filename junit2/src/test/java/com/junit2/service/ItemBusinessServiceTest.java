package com.junit2.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.junit2.api.SomeDataService;
import com.junit2.data.ItemRepository;
import com.junit2.model.Item;

@RunWith(MockitoJUnitRunner.class)
public class ItemBusinessServiceTest {

	@InjectMocks
	ItemBusinessService business;

	@Mock
	ItemRepository repository;

	@Test
	public void calculateSum_UsingDataService_basic() {
		when(repository.findAll())
				.thenReturn(Arrays.asList(new Item(1, "name", 10, 100), new Item(2, "name2", 20, 200)));
		List<Item> items = business.retrieveAllItems();
		assertEquals(100, items.get(0).getValue());
		assertEquals(200, items.get(1).getValue());
	}

}
