package com.mindtree.cityapp.utility;

import java.util.Comparator;

import com.mindtree.cityapp.entity.Apartment;

public class CompartorApartment  implements Comparator<Apartment>{

	public int compare(Apartment o1, Apartment o2) {
		
		return o2.getApartmentName().compareTo(o1.getApartmentName());
	}
	

}
