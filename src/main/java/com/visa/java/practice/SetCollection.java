package com.visa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Set<String> stringSet = new HashSet<String>();
		
		System.out.println("Enter the numer of elelements needs to enter ::: ");
		int size = Integer.parseInt(bufferedReader.readLine());
		
		for(int i=0; i<size; i++) {
			stringSet.add(bufferedReader.readLine());
		}
		
		System.out.println("Size of set :: " + stringSet.size());
		Iterator<String> iterator = stringSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
