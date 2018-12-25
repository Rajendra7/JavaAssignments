package com.cg.basicCollections;

public class Laptop {
	private String companyName;
	private int modelNumber;
	private String operatingStystem;
	private String processor;
	
	public Laptop(String companyName, int modelNumber, String operatingStystem,
			String processor) {
		super();
		this.companyName = companyName;
		this.modelNumber = modelNumber;
		this.operatingStystem = operatingStystem;
		this.processor = processor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + modelNumber;
		result = prime
				* result
				+ ((operatingStystem == null) ? 0 : operatingStystem.hashCode());
		result = prime * result
				+ ((processor == null) ? 0 : processor.hashCode());
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
		Laptop other = (Laptop) obj;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (modelNumber != other.modelNumber)
			return false;
		if (operatingStystem == null) {
			if (other.operatingStystem != null)
				return false;
		} else if (!operatingStystem.equals(other.operatingStystem))
			return false;
		if (processor == null) {
			if (other.processor != null)
				return false;
		} else if (!processor.equals(other.processor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [companyName=" + companyName + ", modelNumber="
				+ modelNumber + ", operatingStystem=" + operatingStystem
				+ ", processor=" + processor + "]";
	}
	

}
