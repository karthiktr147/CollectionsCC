package com.mindtree.cityapp;

import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.mindtree.cityapp.entity.Apartment;
import com.mindtree.cityapp.entity.Block;
import com.mindtree.cityapp.entity.City;
import com.mindtree.cityapp.utility.CompartorApartment;

public class App 
{
	static Scanner scan = new Scanner(System.in);
	static Scanner scan1 = new Scanner(System.in);
    public static void main( String[] args )
    {
     
     
    	System.out.println("Enter the number of cities ");
      int cityNumber= scan.nextInt();
      Map<City, Map<Block,Set<Apartment>>> cityMap=new TreeMap<City,Map<Block,Set<Apartment>>>();
      for(int i=0;i<cityNumber;i++)
      {
    	  int blockNumber=0;
    	  City city =null;
    	  try
    	  {
    	   city = new City();
    	  System.out.println("Enter the city id :");
    	  city.setCityId(scan.nextInt());
    	  System.out.println("Enter the city name :");
    	  city.setCityName(scan1.nextLine());
    	  System.out.println("Enter the number of blocks in the city :");
    	   blockNumber=scan.nextInt();
    	  }
    	  catch(InputMismatchException e)
    	  {
    		  System.out.println("enter valid type of data");
    	  }
    	  catch(NullPointerException e)
    	  {
    		  System.out.println("null");
    	  }
    	  Map<Block,Set<Apartment>> blockMap= new LinkedHashMap<Block, Set<Apartment>>();
    	  for(int j=0;j<blockNumber;j++)
    	  {
    		  Block block =null;
    		  int numberOfApartment=0;
    		  try
    		  {
    		  
    		  block = new Block();
    		  System.out.println("Enter the block id:");
    		  block.setBlockId(scan.nextInt());
    		  System.out.println("Enter the block name :");
    		  block.setBlockName(scan1.nextLine());
    		  System.out.println("Enter the number of apartments2");
    		  numberOfApartment=scan.nextInt();
    		  }
    		  catch(InputMismatchException e)
    		  {
    			  System.out.println("Enter valid input");
    		  }
    		  catch(NullPointerException e)
    		  {
    			  System.out.println("null");
    		  }
    		  Set<Apartment> apartmentSet=new TreeSet<Apartment>(new CompartorApartment());
    		  for(int k=0;k<numberOfApartment;k++)
    		  {
    			  try
    			  {
    				  
    			  
    			  Apartment apartment = new Apartment();
    			  System.out.println("Enter the Apartment Id :");
    			  apartment.setApartmentId(scan.nextInt());
    			  System.out.println("Enter the Apartment name  :");
    			  apartment.setApartmentName(scan1.nextLine());
    			  apartmentSet.add(apartment);
    			  }
    			  catch(InputMismatchException e)
    			  {
    				  System.out.println("enter the valid data");
    			  }
    			  catch(NullPointerException e)
    			  {
    				  System.out.println("null pointer exception");
    			  }
    		  }
    		  blockMap.put(block, apartmentSet);
    	  }
    	 
    	  cityMap.put(city, blockMap);
      }
      
      
      
      System.out.println(cityMap);
    }}
