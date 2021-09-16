package com.visa.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoDimentionalArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of rows :: ");
		int row = Integer.parseInt(bufferedReader.readLine());

		System.out.println("Enter number of columns :: ");
		int col = Integer.parseInt(bufferedReader.readLine());
		
		int a1[][] = new int[row][col];
		int a2[][] = new int[row][col];
		int sum[][] = new int[row][col];
 		StringTokenizer stringTokenizer;
		
		System.out.println("Enter array elements of a1 :: ");
		for(int i=0; i< row; i++ ) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			for(int j=0; j<col; j++ ) {
				a1[i][j] = Integer.parseInt(stringTokenizer.nextToken());
			}
		}
		
		System.out.println("Enter array elements of a2 :: ");
		for(int i=0; i< row; i++ ) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			for(int j=0; j<col; j++ ) {
				a2[i][j] = Integer.parseInt(stringTokenizer.nextToken());
			}
		}
		
		System.out.println("Pring array elements of a1 :: ");
		for(int i=0; i< row; i++ ) {
			for(int j=0; j<col; j++ ) {
				System.out.print("	" + a1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Pring array elements of a2 :: ");
		for(int i=0; i< row; i++ ) {
			for(int j=0; j<col; j++ ) {
				System.out.print("	" + a2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Print sum of a1 and a2:: ");
		for(int i=0; i< row; i++ ) {
			for(int j=0; j<col; j++ ) {
				sum[i][j] = a1[i][j] + a2[i][j] ;
			}
		}
		
		for(int i=0; i< row; i++ ) {
			for(int j=0; j<col; j++ ) {
				System.out.print("	" + sum[i][j]);
			}
			System.out.println();
		}
	}

}
