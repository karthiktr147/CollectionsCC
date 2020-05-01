package com.mindtree.cityapp.entity;

public class Apartment implements Comparable<Apartment>{
private int apartmentId;
private String apartmentName;
public Apartment() {
	super();
	// TODO Auto-generated constructor stub
}
public Apartment(int apartmentId, String apartmentName) {
	super();
	this.apartmentId = apartmentId;
	this.apartmentName = apartmentName;
}

public int getApartmentId() {
	return apartmentId;
}
public void setApartmentId(int apartmentId) {
	this.apartmentId = apartmentId;
}
public String getApartmentName() {
	return apartmentName;
}
public void setApartmentName(String apartmentName) {
	this.apartmentName = apartmentName;
}
public int compareTo(Apartment o) {
	
	return this.getApartmentId()-o.getApartmentId();
}
@Override
public String toString() {
	return "Apartment [apartmentId=" + apartmentId + ", apartmentName=" + apartmentName + "]";
}


}
