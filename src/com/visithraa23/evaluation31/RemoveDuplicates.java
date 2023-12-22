package com.visithraa23.evaluation31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		RemoveDuplicates duplicates=new RemoveDuplicates();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size :");
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			System.out.print("Element"+(i+1)+" - ");
			list.add(sc.nextInt());
		}
		System.out.println(list);
		duplicates.removeElement(list);
		sc.close();
	}

	private void removeElement(List<Integer> list) {
		
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)==list.get(j)) {
					list.remove(j);
					j--;
				}	
			}	
		}
		
		System.out.println(list);
	}
}
