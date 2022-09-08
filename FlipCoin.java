package bridgelabz.javapractice.Basics.Day5Assignment;

import java.util.Scanner;

public class FlipCoin {
	
	public static void main(String[] args) {
	int heads=0;
	int tails=0;
	int count=1;
	double random=0.0;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No of flips : ");
	int flips=sc.nextInt();
		while(count<=flips) {
		random=Math.random();
		System.out.println(count+" "+random);
		
		if(random <0.5) {
			heads++;
			System.out.println("heads");
		}
		else {
			tails++;
			System.out.println("tails");
		}	
		count++;
	}
		System.out.println("No of heads : "+heads);
		System.out.println("No of tails : "+tails);
		
		double headpercent=(double)heads/flips*100;
		double tailpercent=(double)tails/flips*100;
		
		System.out.println("Percentage of heads : "+headpercent);
		System.out.println("percentage of tails : "+tailpercent);
	}
}
