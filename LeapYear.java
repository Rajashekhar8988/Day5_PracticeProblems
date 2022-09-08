package bridgelabz.javapractice.Basics.Day5Assignment;

import java.util.Scanner;

public class LeapYear {
	int year;
	void show() {
	if(year%100==0 && year%400==0 || year%100!=0 && year%4==0) {
		System.out.println("Leap Year");
	}
	else {
		System.out.println("Not a Leap Year");
	}
	}
public static void main(String[] args) {
	LeapYear l=new LeapYear();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter four digit number : ");
	int year=sc.nextInt();
	l.show();
	
}
}
