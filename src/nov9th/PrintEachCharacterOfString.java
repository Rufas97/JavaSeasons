package nov9th;

public class PrintEachCharacterOfString {

	public static void main(String[] args) {
		
		String str="malayalam";
		
		System.out.println(str.length());
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i)+"\t");
		}

	}

}
