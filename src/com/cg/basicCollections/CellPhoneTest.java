package com.cg.basicCollections;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class CellPhoneTest {
	private CellPhone samsung;
	private CellPhone oppo;
	private CellPhone vivo;
	private CellPhone iphone;
	private CellPhone mi;
	private Set<CellPhone> cellphoneSets=new HashSet<CellPhone>();

	@Test
	public void testForCellPhoneDetails() {
		System.out.println("Checking For Duplicate Details");
		cellphoneSets.add(new CellPhone("Samsung", "OnNext", "8GB-RAM", "OREO", 15000));
		cellphoneSets.add(new CellPhone("OPPO", "F1", "5GB-RAM", "Marshmallow", 19000));
		cellphoneSets.add(new CellPhone("VIVO", "V6", "25MP-Camera", "Nougout", 21000));
		cellphoneSets.add(new CellPhone("IPhone", "XS", "4GB-RAM", "MAC-OS", 95000));
		cellphoneSets.add(new CellPhone("Mi", "Note5", "5000mAh", "Lollipop", 11000));
		cellphoneSets.add(new CellPhone("Mi", "Note5", "5000mAh", "Lollipop", 11000));
		
		Iterator iterator=cellphoneSets.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		
	}

}
