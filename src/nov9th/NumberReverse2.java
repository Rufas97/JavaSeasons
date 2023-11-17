package nov9th;

import java.util.Scanner;

public class NumberReverse2 {

	public static void main(String[] args) {
		
		System.out.println("Enter some number :");
		
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		
		System.out.println("Reverse of Number is :"+reverseOfNumber(num));
	}

	private static int reverseOfNumber(int n) {
		
		int rev=0;
		while(n>0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		return rev;
		
		
	}

}
