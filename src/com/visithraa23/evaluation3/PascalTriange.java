package com.visithraa23.evaluation3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriange {
	public static void main(String[] args) {
		PascalTriange pascal=new PascalTriange();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Input:");
		int row=sc.nextInt();
		pascal.generatePascal(row);
	}

	private void generatePascal(int row) {
		List<List<Integer>> triangle=new ArrayList<>();
		List<Integer>list;
		for(int i=0;i<row;i++) {
			list=new ArrayList<>();
			for(int j=0;j<i+1;j++) {
				if(j==0||j==i)
					list.add(1);
				else
					list.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
			}
			triangle.add(list);
		}
		
		//System.out.println(triangle.toString());
		for (int i = 0; i < triangle.size(); i++) {
			for (int j = 0 ; j <=i; j++) {
				System.out.print(triangle.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
}
