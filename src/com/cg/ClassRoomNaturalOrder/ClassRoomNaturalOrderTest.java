package com.cg.ClassRoomNaturalOrder;

/*Add all the names of our class students randomly to a collection, iterate through them and print. 
 * Observe that collection keeps these elements in a natural order.
*/


import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.junit.Test;

public class ClassRoomNaturalOrderTest {
	private java.util.List<String> classList =new ArrayList<String>();

	@Test
	public void testForNaturalOrder() {
		System.out.println("Elements in the list are:");
		String list="";
		classList.add("Rajendra");
		classList.add("Bhanu");
		classList.add("Prasanth");
		classList.add("Srivani");
		classList.add("Hema");
		Collections.sort(classList);
		Iterator<String> iterator =classList.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next()+" ");
		}

		
	}
	

}
