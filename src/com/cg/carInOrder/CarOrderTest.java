package com.cg.carInOrder;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CarOrderTest {
	private CarOrder carOne,carTwo,carThree,carFour,carFive;
	@Before
	public void setUp(){
		carOne = new CarOrder("Hyundai","Model 1",2016,1000000);
		carTwo = new CarOrder("BMW","Model 2",2017,2500000);
		carThree = new CarOrder("Honda","Model 3",2018,1500000);
		carFour = new CarOrder("Audi","Model 4",2019,2000000);
		carFive = new CarOrder("Tata","Model 5",2020,400000);
	}
	@Test
	public void test() {
		List<CarOrder> carLists = new ArrayList<>();
		carLists.add(carOne);
		carLists.add(carTwo);
		carLists.add(carThree);
		carLists.add(carFour);
		carLists.add(carFive);
		
		CarOrder car = new CarOrder();
		car.ascending(carLists);
	}

}