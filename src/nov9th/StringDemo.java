package nov9th;

public class StringDemo {

	public static void main(String[] args) {
		
		String str1="Hello";
		
		System.out.println(str1);
		
		String str2=new String("Hello");
		
		String str3=new String(str1);
		
		System.out.println(str1==str2);//false because it compares the references
		
		System.out.println(str1.equals(str2));
		
		

	}

}
