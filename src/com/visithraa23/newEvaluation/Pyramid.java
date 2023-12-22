package com.visithraa23.newEvaluation;

import java.util.Arrays;
import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		Pyramid pyramid=new Pyramid();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Input:");
		String str=sc.next();
		pyramid.create(str);
	}

	private void create(String str) {
		String str1=""+str.charAt(0),str2="";
		
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				str1=str.substring(0,i);
				str2=str.substring(i,str.length());
				break;
			}
				
		}
		int len=Math.max(str1.length(), str2.length());
		
		for(int i=0;i<len;i++) {
			String res1="",res2="";
			if(i<str1.length()) {
				res1=str1.substring(0,i+1).toUpperCase();
			}
			else
				res1=str1;
			if(i<str2.length()) {
				res2=str2.substring(0,i+1).toUpperCase();
			}
			else 
				res2=str2;
			
			System.out.println(res1+res2);
			
		}
		
	}
}
