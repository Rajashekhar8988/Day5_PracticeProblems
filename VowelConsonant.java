package bridgelabz.javapractice.Basics.Day5Assignment;

import java.util.Scanner;

public class VowelConsonant {
	 void vowelOrNot(char ch){
		 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	    	{
	    	System.out.println("Entered character "+ch+" is  Vowel"); 
	    	}
	        else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
	    		System.out.println("Entered character "+ch+" is Consonant");
	    	      else
	    		System.out.println("Not an alphabet");
		 
	 }
    public static void main(String[] args) {
    	VowelConsonant vc=new VowelConsonant();
    	Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char in=sc3.next().charAt(0);
        vc.vowelOrNot(in);
         
}
}