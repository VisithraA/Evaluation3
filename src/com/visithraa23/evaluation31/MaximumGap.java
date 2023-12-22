package com.visithraa23.evaluation31;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumGap {
	public static void main(String[] args) {
		MaximumGap gap=new MaximumGap();
		int[] arr=gap.getInput();
		gap.findMax(arr);
		
	}

	private void findMax(int[] arr) {
		int max=arr[1]-arr[0];
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i]>max)
				max=arr[i+1]-arr[i];
		}
		System.out.println("The maximum gap is "+max);
		
	}

	private int[] getInput() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		return arr;
	}
}
