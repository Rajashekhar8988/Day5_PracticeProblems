package bridgelabz.javapractice.Basics.Day5Assignment;

import java.util.*;

public class SwapingNumbers {

	public static void main(String[] args) {  
	       int x, y, t;
	       Scanner sc2= new Scanner(System.in);  
	       System.out.println("Enter the value of X");  
	       x = sc2.nextInt(); 
	       System.out.println("Enter the value of y");  
	       y = sc2.nextInt();  
	       System.out.println("before swapping the numbers are");
	       System.out.println("the value oF X is : "+x);
	       System.out.println("the value oF X is : "+y);

	       t = x;  
	       x = y;  
	       y = t;  
	       
	       System.out.println("After swapping the numbers are");
	       System.out.println("the value oF X is : "+x);
	       System.out.println("the value oF X is : "+y);

	    }    
	}  
