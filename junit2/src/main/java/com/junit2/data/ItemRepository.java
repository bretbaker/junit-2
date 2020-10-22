package com.junit2.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junit2.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
