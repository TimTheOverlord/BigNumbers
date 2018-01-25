/*
 * Name: 
 * Assignment #: Assignment0X
 * Due Date: X-XX-XX
 * Course / Section / Semester: IT2045C / 001 / Spring 2018
 * Citations: X
 * Description: XXXXX
 * Anything Else Relevant: 
 * Last Worked on: X-XX-XX
 */
package main;

import java.util.Scanner;
import primeCal.PrimeCal;

public class Main {

	public static void main(String[] args) {
	
		PrimeCal pc = new PrimeCal();
		// set pc
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		
		// Changed the method call from pc.setpc to pc.calculatePrime.
		System.out.println(pc.calculatePrime(in.nextInt()));
		
		
		//private int pc;
		//public int getpc() {return pc;} // the 'getter' for pc
		//public void setpc(int nextInt) {this.pc = nextInt;}		
		
		// Prime Calculation code for testing purposes.
		
		//for(int i = 3, i < pc, i++)
		//{
		//	if(pc % i ==0)
		//	{
		//		System.out.println("pc is not prime");
		//	}
		//}
		//
		//if(pc < 2)
		//{
		//	System.out.println("Not Prime");
		//}
		//
		//System.out.println(pc.getpc());
		
	}

}