package com.cg.basicCollections;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class LaptopTest {
	private Laptop lenovo;
	private Laptop hp;
	private Laptop dell;
	private Laptop asus;
	private Laptop apple;
	private Set<Laptop> laptopsets= new HashSet<Laptop>();

	@Test
	public void testForDetails() {
		System.out.println("Checking For Duplicate Values");
		laptopsets.add(new Laptop("Lenovo", 101, "Windows 10", "i5"));
		laptopsets.add(new Laptop("HP", 19091, "Windows 8.1", "i7"));
		laptopsets.add(new Laptop("Dell", 748394, "Windows 10", "i3"));
		laptopsets.add(new Laptop("Lenovo", 101, "Windows 10", "i5"));
		laptopsets.add(new Laptop("Asus", 89473, "DOS", "i3"));
		laptopsets.add(new Laptop("Apple", 73480274, "MAC OS", "i9"));
		lenovo= new Laptop("Lenovo", 101, "Windows 10", "i5");
		
		Iterator iterator=laptopsets.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		
	}

}
