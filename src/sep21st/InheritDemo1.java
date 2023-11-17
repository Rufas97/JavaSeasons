package sep21st;

public class InheritDemo1 {

	public static void main(String[] args) {
		 
		//Student s1=new Student();
		//Marks s1=new Marks();
		Leaves s1=new Leaves();
		s1.setDetails(1, "John");
		s1.getDetails();
		s1.setMarks(70,80,90);
		s1.getResults();
		s1.setLeave(5,10);
		s1.getLeave();
		

	}

}
