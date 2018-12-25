package com.cg.basicCollections;
public class Car {
	private String making;
	private String model;
	private int year;
	private double price;
	public Car(String making, String model, int year, double price) {
		super();
		this.making = making;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((making == null) ? 0 : making.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (making == null) {
			if (other.making != null)
				return false;
		} else if (!making.equals(other.making))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Car [making=" + making + ", model=" + model + ", year=" + year
				+ ", price=" + price + "]";
	}
	
	

}