package com.visithraa23.evaluation31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {
	public static void main(String[] args) {
		ValidParanthesis valid=new ValidParanthesis();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Input");
		int n=sc.nextInt();
		int open=0,close=0;
		List<String> result=valid.generateParanthesis(n,open,close);
		System.out.println(result);
	}

	private List<String> generateParanthesis(int n,int open,int close) {
		List<String> result=new ArrayList<>();
		Stack<String> stack=new Stack<>();
		
		if(open==close&&open==n) {
			result.addAll(stack);
			return result;
		}
		if(open<n) {
			stack.push("(");
			generateParanthesis(n, open+1, close);
			stack.pop();
		}
		if(close<open) {
			stack.push(")");
			generateParanthesis(n, open, close+1);
			stack.pop();
		}
		generateParanthesis(n, 0, 0);
		return result;
		
	}
}
