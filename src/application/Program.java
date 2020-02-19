package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int row = sc.nextInt();
		System.out.print("Enter the number od columns: ");
		int col = sc.nextInt();
		System.out.println();
		
		int [][] mat = new int[row][col];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int n1 = sc.nextInt();
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(mat[i][j] == n1) {
					System.out.println("Position " + i + ", " + j + ": ");
					if(j-1 >= 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(j+1 < col) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if(i-1 >= 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(i+1 < row){
						System.out.println("Down: " + mat[i+1][j]);
					}
					
					}			
				}
			}	
			
		sc.close();
	}
}
