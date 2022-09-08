package bridgelabz.javapractice.Basics.Day5Assignment;

import java.util.Scanner;

public class EvenOdd {
	static int num;
	void number() {
        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
	}

    public static void main(String[] args) {
    	EvenOdd ev=new EvenOdd();

        Scanner x = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = x.nextInt();
        ev.number();
    }
}
