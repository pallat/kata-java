/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{

	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<Integer> p = new ArrayList<Integer>();
		p = primes(4);
		System.out.println(p.toString());
	}

    public static ArrayList<Integer> primes(int number){
    	ArrayList<Integer> p = new ArrayList<Integer>();
    	for(int countDown = 2; countDown <= number ; countDown++){
			if((number % countDown) == 0){
				p = primes(number/countDown);
				p.add(countDown);
				break;
			}
    	}
    	return p;
    }    
}