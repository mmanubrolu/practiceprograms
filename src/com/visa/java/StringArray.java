package com.visa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size :: ");
		int size = Integer.parseInt(bufferedReader.readLine());
		
		String arrayItems[] = new String[size];
		
		System.out.println("Enter String items");
		for(int i=0; i<size; i++) {
			arrayItems[i]=bufferedReader.readLine();
		}
		
		System.out.println("Print String items");
		for(int i=0; i<size; i++) {
			System.out.println(arrayItems[i]);
		}
	}

}
