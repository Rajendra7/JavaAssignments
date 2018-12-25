package com.cg.ClassFruit;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import javax.lang.model.element.Element;

import org.junit.Test;

public class ClassFruitTest {
	private Map<String, String> classFruitMap=new HashMap<String, String>();

	@Test
	public void testForClassFavoriteFruit() {
		String map ="";
		classFruitMap.put("Rajendra", "Mango");
		classFruitMap.put("Bhanu", "Orange");
		classFruitMap.put("Prasanth", "Apple");
		classFruitMap.put("Srivani", "JackFruit");
		classFruitMap.put("Hema", "Grapes");
		for (Map.Entry<String, String> fruit : classFruitMap.entrySet()) {
			if(fruit.getKey().equals("Rajendra")) {
				System.out.println("Favorite fruit of "+fruit.getKey()+" is "+ fruit.getValue());
				map +="Favorite fruit of "+fruit.getKey()+" is "+ fruit.getValue();
				break;
			}
		}
		assertEquals("Favorite fruit of Rajendra is Mango",map);
	}

}
