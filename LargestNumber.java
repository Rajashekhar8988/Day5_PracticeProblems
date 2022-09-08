package bridgelabz.javapractice.Basics.Day5Assignment;

import java.util.Scanner;  
public class LargestNumber{
	int x;
	int y;
	int z;
	void display(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		if(x>=y && x>=z)  
			System.out.println(x+" is the largest Number");  
			else if (y>=x && y>=z)  
			System.out.println(y+" is the largest Number");  
			else  
			System.out.println(z+" is the largest number");  
			}  
	public static void main(String[] args) {
  
	LargestNumber l=new LargestNumber();
	Scanner sc = new Scanner(System.in);  
	System.out.println("Enter the first number:");  
	int a = sc.nextInt();  
	System.out.println("Enter the second number:");  
	int b= sc.nextInt();  
	System.out.println("Enter the third number:");  
	int c = sc.nextInt();  
	l.display(a,b,c);
	}
}
