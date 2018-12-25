package com.cg.basicCollections;
import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;


public class CarTest {
	private Car bmw;
	private Car audi;
	private Car benz;
	private Car ford;
	private Car honda;
	private Set<Car> carsets=new HashSet<Car>();

	@Test
	public void testForCarDetails() {
		System.out.println("Checking For Duplicate Values");
		
		carsets.add(new Car("BMW", "BMW X1", 2016, 1500000));
		carsets.add(new Car("AUDI", "AUDI A3", 2015, 1200000));
		carsets.add(new Car("BENZ", "BENZ  Class", 2017, 3500000));
		carsets.add(new Car("FORD", "FOED MODEL T", 2011, 700000));
		carsets.add(new Car("HONDA", "HONDA CITY", 2010, 1200000));
		carsets.add(new Car("HONDA", "HONDA CITY", 2010, 1200000));
		
		Iterator iterator=carsets.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		
	}

}