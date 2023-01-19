package com.array.com;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 15;
		arr[1][1] = 25;
		arr[1][2] = 35;
		
		arr[2][0] = 11;
		arr[2][1] = 22;
		arr[2][2] = 33;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
