package nov9th;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter some String ");
		Scanner input=new Scanner(System.in);
		String str=input.next();
		
		 if(str.equalsIgnoreCase(reverseOfString(str)))
		 {
			 System.out.println(str+ " Is a palindrome");
		 }
		 else
		 {
			 System.out.println(str+ " Is not a palindrome");
		 }

	}

	private static String reverseOfString(String str) {
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		return rev;


		
	}

}
