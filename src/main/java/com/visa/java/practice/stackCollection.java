package com.visa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;

public class stackCollection {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Stack<String> stringStack = new Stack<String>();
		
		System.out.println("Enter stack size");
		int size = Integer.parseInt( bufferedReader.readLine());
		
		System.out.println("Enter stack elements::");
		for(int i=0; i<size; i++) {
			stringStack.push(bufferedReader.readLine());
			
		}
		Iterator<String> iterator = stringStack.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	

	}

}
