package com.visa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FabinccaSeries {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number : ");
		int number =  0;
		number =Integer.parseInt(bufferedReader.readLine());
		
		System.out.println("number :: " + number);
		
		int f1=0, f2=1 , f3 =0;
		System.out.println(f1);
		System.out.println(f2);
		while(f3< number) {
			f3 = f1+f2;
			f1=f2;
			f2=f3;
			System.out.println(f3);
		}

	}

}
