package com.cg.basicCollections;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class SchoolTest {
	private School school1;
	private School school2;
	private School school3;
	private School school4;
	private School school5;
	private Set<School> schoolSets=new HashSet<School>();
	

	@Test
	public void testForSchoolDetails() {
		schoolSets.add(new School("LFPS", "Hyderabad", "Hyderabad", 1));
		schoolSets.add(new School("Siddhatha School", "Ravulapalem", "East Godavari", 2));
		schoolSets.add(new School("Pragati High School", "Rajahmundry", "East Godavari", 3));
		schoolSets.add(new School("LFPS", "Hyderabad", "Hyderabad", 1));
		schoolSets.add(new School("Narayana School", "Vijayawada", "Krishna", 4));
		schoolSets.add(new School("Sri Chaitanya school", "Guntur", "Guntur", 5));
		
		Iterator iterator=schoolSets.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}

}
