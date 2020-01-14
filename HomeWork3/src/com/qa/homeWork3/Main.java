package com.qa.homeWork3;

public class Main {

    public static void main(String[] args) {
		int height = 5;
		int width = 5;
		int row = 0;
		int col = 0;
		System.out.println("Task 1)");
		while (row < height) {
			col = 0;
			while (col <= row) {
				System.out.print("*  ");
				col++;
			}
			System.out.println("");
			row++;
		}
		row = height - 1;
		while (row > 0) {
			col = 0;
			while (col < row) {
				System.out.print("*  ");
				col++;
			}
			System.out.println("");
			row--;
		}

		System.out.println("Task 2)");

		row = 0;
		while (row < height) {
			col = 0;
			while (col < width) {
				if(col >= row) {
					System.out.print("*  ");
				}else{
					System.out.print("   ");
				}
				col++;
			}
			System.out.println("");
			row++;
		}
		System.out.println("Task 3)");

		row = 0;
		while (row < height) {
			col = width;
			while (col > 0) {
				if(col - 1 > row) {
					System.out.print("   ");
				}else{
					System.out.print("*  ");
				}
				col--;
			}
			System.out.println("");
			row++;
		}

		System.out.println("Task 4)");

		row = 0;
		while (row < height) {
			col = width;
			while (col > 0) {
				if(col - 1 > row) {
					System.out.print("   ");
				}else{
					System.out.print("*  ");
				}
				col--;
			}
			System.out.println("");
			row++;
		}
		row = 1;
		while (row < height) {
			col = 0;
			while (col < width) {
				if(col >= row) {
					System.out.print("*  ");
				}else{
					System.out.print("   ");
				}
				col++;
			}
			System.out.println("");
			row++;
		}
		System.out.println("Task 5)");
		int i = 0;
		while(i < 2) {
			row = i;
			while (row < height) {
				col = width;
				while (col > 0) {
					if (col - 1 > row) {
						System.out.print("   ");
					} else {
						System.out.print("*  ");
					}
					col--;
				}
				col = 0;
				while (col <= row - 1) {
					System.out.print("*  ");
					col++;
				}
				System.out.println("");
				row++;
			}
			i++;
		}
	}
}
