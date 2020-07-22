package com.epam.Java8LamdasandStreams;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CheckPalindrome {
	
	public static ArrayList<String> IsPalindrome(ArrayList<String> list)
	{
		
		ArrayList<String> res=new ArrayList<String>();
		res=(ArrayList<String>) list.stream().filter(ele->ele.equals(((new StringBuffer(ele)).reverse()).toString() ) ).collect(Collectors.toList());
		return res;
	}
	
	
	public static void main(String[] args) {
		int n;
		ArrayList<String> list=new ArrayList<String>();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of strings list : ");
		n=sc.nextInt();
		System.out.println("Enter the strings of your choice:");
		for(int i=0;i<n;i++) {	
			list.add(sc.next());
		}
		
		System.out.println("Palindromes are:" + IsPalindrome(list));
		sc.close();
	}
	
	
	
	
	
	
	
	
	

}
