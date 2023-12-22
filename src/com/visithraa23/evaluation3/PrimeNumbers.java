package com.visithraa23.evaluation3;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		PrimeNumbers prime=new PrimeNumbers();
		prime.getInput();
	}

	private void getInput() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Starting range:");
		int start=sc.nextInt();
		System.out.print("Enter the Ending range:");
		int end=sc.nextInt();
		PrimeNumbers prime=new PrimeNumbers();
		while(start<=end) {
			Boolean b=prime.checkPrime(start);
			if(b)
				System.out.print(start+" ");
			start++;
		}
	}

	private boolean checkPrime(int num) {
		if(num<2)
			return false;
		for(int i=2;i<num/2;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
}
