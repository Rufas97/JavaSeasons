package nov9th;

public class FirstNonRepeatChar {

	public static void main(String[] args) {
		
		String str="abc def edg acb";
		
		System.out.println("First non-repeating character "+toFindFirstNonRepeatChar(str));

	}

	private static char toFindFirstNonRepeatChar(String str) {
	
		String str2=str.replace(" ","");
		
	int[] charCount=new int[256];
		
		for(int i=0;i<str.length();i++)
		{
			charCount[str.charAt(i)]++;
		}
		for(int i=0;i<str2.length();i++)
		{
			if(charCount[str2.charAt(i)]==1)
			{
				return str2.charAt(i);
			}
		}
		
		return '\0';
		
		
		
	}

}
