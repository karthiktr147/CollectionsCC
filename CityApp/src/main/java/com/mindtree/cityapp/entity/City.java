package com.mindtree.cityapp.entity;

public class City implements Comparable<City>{

	private int cityId;
	private String cityName;
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public City(int cityId, String cityName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int compareTo(City arg0) {
		
		return this.getCityName().compareTo(arg0.getCityName());
	}
	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName +" \n"+"]";
	}
	
	

}
