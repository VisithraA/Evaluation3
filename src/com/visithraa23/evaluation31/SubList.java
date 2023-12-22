package com.visithraa23.evaluation31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubList {
	public static void main(String[] args) {
		SubList sublist=new SubList();
		System.out.println("Enter the size of array list");
		List<Integer> listArray=sublist.getInput();
		System.out.println("Enter the size of Subarray list");
		List<Integer> subArray=sublist.getInput();
		sublist.printOutput(listArray,subArray);
	}

	private void printOutput(List<Integer> listArray, List<Integer> subArray) {
		if(subArray.size()>listArray.size())
			System.out.println("SubArray is too length..");
		else {
			Boolean b=SubList.checkElements(listArray,subArray);
			System.out.println(b);
		}
		
	}

	private static Boolean checkElements(List<Integer> listArray, List<Integer> subArray) {
		
		for(int i=0;i<listArray.size();i++) {
			int count=0,k=0;
			for(int j=i;j<listArray.size()-subArray.size()+i&&k<subArray.size();j++) {
				if((int)listArray.get(j)==(int)subArray.get(k)) {
					count++;
					k++;
				}
				else {
					break;
				}
			}	
			if(count==subArray.size())
				return true;
		}
		return false;
	}

	private List<Integer> getInput() {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		List<Integer> list=new ArrayList<>();
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		return list;
	}
}
