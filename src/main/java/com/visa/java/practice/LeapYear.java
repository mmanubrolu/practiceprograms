package com.visa.java.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the year number");
		String str = bufferedReader.readLine();
		System.out.println("Given year 0 ---> " + str);
		if(str.length() == 4) {
			int year = Integer.parseInt(str);
			
			System.out.println("Given year 1 ---> " + year );
			
			if(((year % 100) == 0)  && ((year % 400) == 0) ) {
				System.out.println("Given year is leap year century ---> " + year);
			} else if(((year % 100) != 0) && ((year % 4) == 0) ) {
				System.out.println("Given year is leap year  not century ---> " + year);
			}
			else {
				System.out.println("Given year is  not leap year 0---> " + year);
			}
		} else
			System.out.println("Given year is not aleap year ---> " + str);
		
		
	}

}
