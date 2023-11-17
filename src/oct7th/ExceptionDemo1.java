package oct7th;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		System.out.println("Enter Dividend");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		System.out.println("Enter Divisor");
		int y=input.nextInt();
		
		//Thread.sleep(3000);
		
		//new FileInputStream("D:\\xyz.txt");
		
		try
		{
		System.out.println("Quotient is "+x/y);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please enter non-zeto value for Divisor...");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
 
		catch(RuntimeException re)
		{
			
		}
				finally
		{
			System.out.println("This is finally block ");
		}
		System.out.println("End of program");
		

	}

}
