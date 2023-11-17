package nov9th;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		System.out.println("Enter some String ");
		Scanner input=new Scanner(System.in);
		String str=input.next();
		
		System.out.println(reverseOfString(str));

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
