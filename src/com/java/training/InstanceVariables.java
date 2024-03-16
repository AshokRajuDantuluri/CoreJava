package com.java.training;

public class InstanceVariables {

	static int weeklydays = 5;
	  
	public static void main(String[] args) {
		
		vardhan v = new vardhan();
		v.days=7;
		v.hoursOfClass=1;
		System.out.println("vardhan will attend class in "+ v.days + " days");
		System.out.println("vardhan need class for "+ v.hoursOfClass + " Hour");
		System.out.println("vardhan need class for "+ weeklydays+ " days in a week");


		System.out.println("-----------------------------------------------------");
		veera ve = new veera();
		ve.days=14;
		ve.hoursOfClass=30;
		System.out.println("veera will attend class in "+ ve.days + "days");
		System.out.println("veera need class for "+ ve.hoursOfClass + " Minutes");
		System.out.println("veera need class for "+ weeklydays+ " days in a week");


		System.out.println("-----------------------------------------------------");

		siva s = new siva();
		s.days=21;
		s.hoursOfClass=45;
		
		System.out.println("siva will attend class in "+ s.days + "days");
		System.out.println("siva need class for "+ s.hoursOfClass + " Minutes");
		System.out.println("siva need class for "+ weeklydays+ " days in a week");

		
		System.out.println("-----------------------------------------------------");

		sivaram sv = new sivaram();
		sv.days=30;
		sv.hoursOfClass=40;
		
		System.out.println("sivaram will attend class in "+ sv.days + "days");
		System.out.println("sivaram need class for "+ sv.hoursOfClass + " Minutes");
		System.out.println("sivaram need class for "+ weeklydays+ " days in a week");

		System.out.println("-----------------------------------------------------");

		
	}
	
}

    class vardhan  // Instance
    {
    	int days;
    	int hoursOfClass;
    	
    }
    
    
    class veera  // Instance
    {
    	int days;
    	int hoursOfClass;

    	
    }
    
    class siva  // Instance
    {
    	int days;
    	int hoursOfClass;

    	
    }
    
    class sivaram  // Instance
    {
    	int days;
    	int hoursOfClass;

    	
    }
