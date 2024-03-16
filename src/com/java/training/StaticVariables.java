package com.java.training;

public class StaticVariables {
	
	static int b= 10;

	public static void main(String[] args) {
		
		ashok a = new ashok(); //with object reference
		
		//System.out.println(a.b);
		
		//System.out.println(ashok.b); //with class name
		
		System.out.println(b); //with reference variable
		
		System.out.println(ashok.a); //with reference variable

	}
	
}

class ashok
{
	 static int a = 10;
}

 


