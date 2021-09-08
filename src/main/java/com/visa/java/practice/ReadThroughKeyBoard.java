package com.visa.java.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReadThroughKeyBoard {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		
		
		//read integer value
		System.out.println("Enter the integer value  :");
		String str = bufferReader.readLine();
		int intValue = Integer.parseInt(str);
		System.out.println("intValue  ---->>>> " + intValue);
		
		
		//reach char value
		System.out.println("Enter the char  value  :");
		char ch = (char) bufferReader.read();
		System.out.println("ch  ---->>>> " + ch);
		
		bufferReader.skip(2);
		
		//read double value
		System.out.println("Enter the double value  :");
		str = bufferReader.readLine();
		double doubleValue = Double.parseDouble(str);
		System.out.println("doubleValue  ---->>>> " + doubleValue);
		
		//read float value
		System.out.println("Enter the float value  :");
		str = bufferReader.readLine();
		float floatValue = Float.parseFloat(str);
		System.out.println("floatValue  ---->>>> " + floatValue);
		
		
		//read long value
		System.out.println("Enter the long value  :");
		str = bufferReader.readLine();
		long longValue = Long.parseLong(str);
		System.out.println("longValue  ---->>>> " + longValue);
		
		
		System.out.println("Enter the string tokenization value  :");
		str = bufferReader.readLine();
		StringTokenizer strTokenizer = new StringTokenizer(str, "::");
		int count = strTokenizer.countTokens();
		for(int i=0; i<count; i++) {
			System.out.println(strTokenizer.nextToken());
		}
		
		
	}

}
