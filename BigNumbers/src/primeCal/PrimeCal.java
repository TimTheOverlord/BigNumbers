/*
 * Name: Timothy Huff
 * Assignment #: Assignment03
 * Due Date: 1-30-18
 * Course / Section / Semester: IT2045C / 001 / Spring 2018
 * Citations: Stack overflow
 * Description: This program calculates whether or not a number is prime.
 * Anything Else Relevant: 
 * Last Worked on: 1-25-18
 * Partner: Tyler Smith
 */
package primeCal;

import java.math.BigInteger;

/**
 * This Class provides the calculator for the program to determine whether or not a number is prime.
 * @author hufftd
 *
 */

public class PrimeCal {

	public boolean calculatePrime(int inputNum)
	{
		// Start
		// In accordance with the code he wrote, I had to cast the System.in of the main method into a BigInteger. This is that casting.
		BigInteger input = new BigInteger("0");
		input = BigInteger.valueOf(inputNum);
		// check if even
		BigInteger two = new BigInteger("2"); 
		// if input is not 2 and input's mod is equal to 2, then returns false
	    if (!two.equals(input) && BigInteger.ZERO.equals(input.mod(two)))
	    {
	        return false;
	    }

	    // find divisor if any from 3 to 'number'
	    // for-loop where i adds to per cycle and cycles until i*i < input.
	    for (BigInteger i = new BigInteger("3"); i.multiply(i).compareTo(input) < 1; i = i.add(two))
	    { 
	    	// start from 3, 5, etc. the odd number, and look for a divisor if any
	        if (BigInteger.ZERO.equals(input.mod(i))) 
	        {
	        	// check if 'i' is divisor of 'number'
	        	return false;
	        }
	            
	    }
		return true;
		// End
	}

}
