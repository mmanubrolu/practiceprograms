package com.visa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBufferArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter size of array");
		int size = Integer.parseInt(bufferedReader.readLine());
		StringBuffer stringBuffer[] = new StringBuffer[size];
		
		System.out.println("Enter items of array");
		for(int i=0; i<size; i++) {
			stringBuffer[i] = new StringBuffer( bufferedReader.readLine());
		}
		
		System.out.println("print size of array");
		for(int i=0; i<size; i++) {
			System.out.println(stringBuffer[i] );
		}
		
		System.out.println("Reverse and print the items of array");
		for(int i=0; i<size; i++) {
			System.out.println(stringBuffer[i].reverse() );
		}
	}

}
