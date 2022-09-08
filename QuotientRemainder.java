package bridgelabz.javapractice.Basics.Day5Assignment;

import java.util.Scanner;

public class QuotientRemainder {
	static int dividend;
	static int divisor;
	static int quotient;
	static int remainder;
	void mathematics() {
		 quotient = dividend / divisor;
	     remainder = dividend % divisor;

	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);
	}

	  public static void main(String[] args) {
		  QuotientRemainder q=new QuotientRemainder();
		  Scanner sc=new Scanner(System.in);
			System.out.println("Enter first number");
			dividend=sc.nextInt();
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter second number");
			divisor=sc1.nextInt();
			q.mathematics();
	  }
	}