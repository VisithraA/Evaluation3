package com.visithraa23.evaluation3;

import java.util.Scanner;

public class MatrixRotation {
	public static void main(String[] args) {
		MatrixRotation mat = new MatrixRotation();
		int[][] arr = mat.getInput();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = mat.swap(arr[i]);
		}

		mat.printArray(arr);
	}

	private void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private int[] swap(int[] arr) {
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}

	private int[][] getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("arr[" + i + "][" + j + "]=");
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		return arr;
	}
}
