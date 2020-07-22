package com.epam.Java8LamdasandStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AverageOfIntegers {
	
	public static double average(List<Integer> list)
	{
		double avg=list.stream().mapToInt(val -> val).average().getAsDouble();  
		if(avg > 0) {
			return  avg;
		}
	return  0; 
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		
			System.out.println("Enter size of list");
			int n = sc.nextInt();
			List<Integer> list = new ArrayList<Integer>(n);
			System.out.println("Enter the numbers :");
			for(int i = 0; i < n; i++)
				list.add(sc.nextInt());
			System.out.println( "Average is: " + average( list ) );
			sc.close();
		}
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	


