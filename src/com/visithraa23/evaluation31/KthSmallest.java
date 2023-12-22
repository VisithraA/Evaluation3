package com.visithraa23.evaluation31;

import java.util.Scanner;

public class KthSmallest {
	public static void main(String[] args) {
		KthSmallest smallest = new KthSmallest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter k for finding smallest element:");
		int key = sc.nextInt();
		arr = smallest.sortArray(arr);
		
		smallest.findElement(arr, key);
	}

	private int[] sortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean swapped = false;
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
		}
		return arr;
	}

	private void findElement(int[] arr, int key) {
		if(key>arr.length||key<0)
			System.out.println("There is no element..");
		else
			System.out.println("The "+key+" Smallest Element is "+arr[key]);
	}
}
