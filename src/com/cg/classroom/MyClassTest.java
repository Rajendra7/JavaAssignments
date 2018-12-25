package com.cg.classroom;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

import com.cg.MyClass.MyClass;

public class MyClassTest {
	private Myclass name1;
	//private Set<Myclass> myClassList =new HashSet<Myclass>();
	private ArrayList<Myclass> myClassList =new ArrayList<Myclass>();

	@Test
	public void testForDetailsOfTheClass() {
		
		System.out.println("The list of the class is:");
		
		myClassList.add(new Myclass("Rajendra"));
		myClassList.add(new Myclass("Shiva"));
		myClassList.add(new Myclass("Zaffar"));
		myClassList.add(new Myclass("Shubam"));
		myClassList.add(new Myclass("Ujwala"));
		myClassList.add(new Myclass("Mrudula"));
		
		Collections.sort(myClassList);
		Iterator iterator=myClassList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}

	}

}
