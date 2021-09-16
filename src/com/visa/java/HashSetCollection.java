package com.visa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollection {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the array size:: ");
		int size = Integer.parseInt(bufferedReader.readLine());
		
		String stringArray[] = new String[size];
		System.out.println("enter the array element: ");
		for(int i=0; i<size; i++) {
			stringArray[i] = bufferedReader.readLine();
		}
		
		HashSet<String> stringHashSet = new HashSet<String>();
		for(int i=0; i<size; i++) {
			stringHashSet.add(stringArray[i]);
		}
		
		Iterator<String> iterator = stringHashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
