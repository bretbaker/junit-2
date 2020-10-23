package com.junit2.service;

import java.util.Arrays;
import java.util.OptionalInt;

import com.junit2.api.SomeDataService;

public class Business {
	
	private SomeDataService someDataService;

	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}

	public int calcuateSum(int[] data) {
		return Arrays.stream(data).reduce(Integer::sum).orElse(0);
	}
	
	public int calcuateSumUsingDataService() {
		int sum = 0;
		int[] data = someDataService.retrieveAllData();
		for (int value : data) {
			sum += value;
		}
		return sum;
	}
}
