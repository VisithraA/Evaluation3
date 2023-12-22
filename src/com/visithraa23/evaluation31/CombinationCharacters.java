package com.visithraa23.evaluation31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationCharacters {
	public static void main(String[] args) {
		CombinationCharacters combination=new CombinationCharacters();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=sc.next();
		List<String> list=new ArrayList();
		combination.getCharacters(list,"",str);
		System.out.println(list);
	}

	private void getCharacters(List<String>list,String pre,String str) {
			CombinationCharacters combination=new CombinationCharacters();
			if(str.isEmpty()) {
				if(!list.contains(pre)&&!pre.isEmpty())
					list.add(pre);
				return;
			}
			
			combination.getCharacters(list, pre+str.charAt(0), str.substring(1));
			combination.getCharacters(list, pre, str.substring(1));
				
	}
	
}
