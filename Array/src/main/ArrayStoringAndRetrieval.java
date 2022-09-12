package main;

import java.util.Scanner;

public class ArrayStoringAndRetrieval { // Create main class.
	public static void main(String[] args) { // main method for the main class.
		int singleDimensionalArray[]= new int[6]; // declaring single dimension array and store in singleDimensionalArray variable.
		singleDimensionalArray[0]= 12; // Store the values using their index.
		singleDimensionalArray[1]= 11;
		singleDimensionalArray[2]= 43;
		singleDimensionalArray[3]= 23;
		singleDimensionalArray[4]= 17;
		singleDimensionalArray[5]= 21;
//		int b[]= new int[6];
//		b[0]= 12;
//		b[1]= 11;
//		b[2]= 43;
//		b[3]= 23;
//		b[4]= 17;
//		b[5]= 21;
	     System.out.println("Retrieve array from single dimension array : "+singleDimensionalArray[2]);  // Retrieval of one dimensional array .
		 int[][] twoDimensionalArray = new int[2][2];    // Declaring two dimensional array.
		 twoDimensionalArray[0][0]= 6;					 // Store the values to two dimensional array using array index. 
		 twoDimensionalArray[0][1]= 4;
		 twoDimensionalArray[1][0]= 12;
		 twoDimensionalArray[1][1]= 11;
		 Scanner scannerObject = new Scanner(System.in);
		 System.out.print("Enter the two dimensional array first index :");
		 int a = scannerObject.nextInt();
		 System.out.print("Enter the two dimensional array second index :");
		 int b = scannerObject.nextInt();
		 System.out.println("Retrieve array from two dimension array : "+twoDimensionalArray[a][b]);	 // Retrieval of two dimensional array.
//		int var1[][][] = {{{3,4,5},{2,3,4},{4,5,2}}}; // Declaring multidimensional array
//		for(int[][] var2:var1) {
//			for(int[] var3:var2) {
//				for(int var4:var3) {
//					System.out.print(var4);
//				}
//			}
//		}
	  }
	}