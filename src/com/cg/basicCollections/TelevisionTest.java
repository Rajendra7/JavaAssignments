package com.cg.basicCollections;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class TelevisionTest {
	private Television samsung;
	private Television mepl;
	private Television bpl;
	private Television lg;
	private Television sony;
	private Set<Television> televisionSets=new HashSet<Television>();

	@Test
	public void testForTelevisionDetails() {
		System.out.println("Checking For Duplicate Values");
		televisionSets.add(new Television("Samsung", "LED", "3DEnabled", 50000));
		televisionSets.add(new Television("MEPL", "LCD", "2D", 15000));
		televisionSets.add(new Television("BPL", "Normal", "2D", 10000));
		televisionSets.add(new Television("LG", "Plasma", "3Denabled", 20000));
		televisionSets.add(new Television("SONY", "LED", "PLASMA", 100000));
		televisionSets.add(new Television("Samsung", "LED", "3DEnabled", 50000));
		
		Iterator iterator=televisionSets.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}

}
