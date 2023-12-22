package com.visithraa23.evaluation3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequency {
	public static void main(String[] args) {
		CountFrequency freq=new CountFrequency();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Paragraph:");
		String str=sc.nextLine();
		freq.count(str);
	}

	private void count(String str) {
	
		String[]strArr=str.split(" ");
		
		Map<String, Integer> map=new HashMap<>();
		for(int i=0;i<strArr.length;i++) {
			String s=strArr[i].toLowerCase();
			if(!map.containsKey(s))
				map.put(s,1);
			else
				map.put(s,map.get(strArr[i])+1);	
		}
		 
		System.out.println(map);
	}
}
