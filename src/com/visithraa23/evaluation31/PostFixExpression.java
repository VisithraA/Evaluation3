package com.visithraa23.evaluation31;

import java.util.Scanner;
import java.util.Stack;

public class PostFixExpression {
	public static void main(String[] args) {
		PostFixExpression expression=new PostFixExpression();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input:");
		String str=sc.next();
		expression.checkExp(str);
	}

	private void checkExp(String str) {
		 Stack<Integer> stack=new Stack<>();
		 PostFixExpression expression=new PostFixExpression();
		 for(int i=0;i<str.length();i++) {
			 if(Character.isDigit(str.charAt(i)))
				 stack.push((int)str.charAt(i)-48);
			 else {
				 char operator=str.charAt(i);
				 int num1=stack.pop();
				 int num2=stack.pop();
				 int ans=expression.evaluate(num1,num2,operator);
				 stack.push(ans);
			 }
		 }
		 System.out.println("Result : "+stack.pop());
	}

	private int evaluate(int num1, int num2, char operator) {
		int res=0;
		switch(operator) {
		case '+':
			res=num1+num2;
			break;
		case '-':
			res=num1-num2;
			break;
		case '*':
			res=num1*num2;
			break;
		case '/':
			res=num1/num2;
			break;
		}
		return res;
	}
}
