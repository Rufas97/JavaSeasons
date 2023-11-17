package nov9th;

import java.util.Scanner;

public class OccuranceOfEachChar {

	public static void main(String[] args) {
		
		System.out.println("Enter some String ");
		Scanner input=new Scanner(System.in);
		String str=input.next();
		
		toFindOccuranceOfEachCharacterInString(str);
		
	}

	private static void toFindOccuranceOfEachCharacterInString(String str) {

		int[] charCount=new int[256];
		
		for(int i=0;i<str.length();i++)
		{
			charCount[str.charAt(i)]++;
		}
		for(int i=0;i<256;i++)
		{
			if(charCount[i]>0)
			{
			System.out.println((char)i+" occured "+charCount[i]+" times ");
			}
		}
	}

	}
