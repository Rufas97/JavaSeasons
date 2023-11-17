package nov9th;

public class FirstNonRepeatChar2 {

	public static void main(String[] args) {
		
		String str="india is my country";
		
		System.out.println("First non-repeating character "+toFindFirstNonRepeatChar(str));

	}

	private static char toFindFirstNonRepeatChar(String str) {
	
		String str2=str.replace(" ","");
	
		for(int i=0;i<str2.length();i++)
		{
			if(str2.indexOf(str2.charAt(i))==str2.lastIndexOf(str2.charAt(i)))
			{
				return str2.charAt(i);
			}
		}
		
	return '\0';
		
		
		
	}

}
