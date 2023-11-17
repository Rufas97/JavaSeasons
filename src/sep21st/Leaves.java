package sep21st;

public class Leaves extends Marks {
	int sl,cl;
	public void setLeave(int s1,int c1)
	{
		this.sl=s1;
		this.cl=c1;
	}
	public void getLeave()
	{
		System.out.println("Total No of Leaves taken :"+(sl+cl ));
	}
} 
