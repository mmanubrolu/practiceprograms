package com.visa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntArray {

	public static void sort(int intarray[]) {
		
		System.out.println("intarray.length  :: " + intarray.length);
		
		for(int i=0; i<intarray.length; i++) {
			System.out.println(intarray[i]);
		}
		for(int i=0; i<intarray.length; i++) {
			for(int j=i+1; j<intarray.length ; j++) {
				
				if(intarray[i]>intarray[j]) {
					int temp = intarray[i];
					intarray[i]=intarray[j];
					intarray[j] =temp;
					
				}
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the array size :: " );
		int size = Integer.parseInt(bufferedReader.readLine());
		int intarray[] = new int[size];
		
		System.out.println("Enter the array elements :: " );
		for(int i=0; i<size; i++) {
			intarray[i] = Integer.parseInt(bufferedReader.readLine());
		}
		
		sort(intarray);
		
		System.out.println("Print the array elements :: " );
		for(int i=0; i<intarray.length; i++) {
			System.out.println(intarray[i]);
		}
	}

}
