package com.cg.carInOrder;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CarOrder implements Comparable<CarOrder>{

	private String make,model;
	private int year;
	private double price;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public CarOrder(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public CarOrder() {
	}
	@Override
	public String toString() {
		return "CarAscendingOrder [make=" + make + ", model=" + model
				+ ", year=" + year + ", price=" + price + "]";
	}
	@Override
	public int compareTo(CarOrder carAscendingOrder) {
		return this.make.compareTo(carAscendingOrder.make);
	}
	public List<CarOrder> ascending(List<CarOrder> carLists) {
		Iterator<CarOrder> iterate = carLists.iterator();
		Collections.sort(carLists);
		for(Object cars : carLists){
			System.out.println(cars);
		}
		return carLists;
	}
	
}