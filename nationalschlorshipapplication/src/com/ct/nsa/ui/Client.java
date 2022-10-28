package com.ct.nsa.ui;

import java.util.Scanner;

import com.ct.nsa.entity.Scholarship;

public class Client {

	 static String scholorholderName;
	 static String university;
 static String type;
   static String address=null;
	static int yearopen;
	static Object service;
	private static Scholarship scholar;

	public static void main(String[] args) {
		
	    int code=0;
		 String category;
		 String type = null;
		 String name = null;
		 String university = null;
		 String address = null;
		 String city = null;
		 String state = null;
		  String yearopen = null;
		 String telephone = null;
		 String principal = null;
		 String status = null;	
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("***National scholorship***");
		while(true) {
			System.out.println("1.Create National Scholarship Application");
			System.out.println("2.Display Application");
			System.out.println("3.Check Status Of Application");
			int option = sc.nextInt();
			
			switch (option) {
			case 1:
				System.out.println("Enter Your Name");
				scholorholderName = sc.next();
				System.out.println("Enter Your University");
				university = sc.next();
				System.out.println("Enter your Category");
				category = sc.next();
				System.out.println("Enter Type Of Scholor");
				type = sc.next();
				System.out.println("Enter Your Address");
				address = sc.next();
				System.out.println("Enter Your Yearopen");
				yearopen = sc.next();
				System.out.println("Enter your Mobile Number ");
				 sc.next();
				
				scholar = new Scholarship(code,category,type,name,university,address,city,state,yearopen,telephone,principal,status);

				System.out.println("your scholar code successfully created" +code);
				break;
				
			case 2:
				System.out.println("Enter Your scholarship code:");
		         sc.next();
		     	System.out.println(getscholarshipdetailas(scholar));
	
				break;
				
			case 3:
				
				break;
				
				default :
					System.out.println("Thank You......");
					System.exit(0);
					break;
					
				
				
				
				
			}
			
			
			
		 }
     
	}

	private static char[] getscholarshipdetailas(Scholarship scholar2) {
		// TODO Auto-generated method stub
		return null;
	}

	private static char[] getAccountDetails(Scholarship scholar) {

		return null;
	}
	
}
