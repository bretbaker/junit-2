package com.junit2.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.junit2.api.SomeDataService;

@RunWith(MockitoJUnitRunner.class)
public class BusinessTest {

	@InjectMocks
	Business business;
	
	@Mock
	SomeDataService someDataService;
	
//	@Before
//	public void before() {
//		
//	}
	
	@Test
	public void calculateSum_basic() {
		int actualResult = business.calcuateSum(new int[] {1,2,3});
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void calculateSum_UsingDataService_basic() {
		int actualResult = business.calcuateSum(new int[] {1,2,3});
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}

}
