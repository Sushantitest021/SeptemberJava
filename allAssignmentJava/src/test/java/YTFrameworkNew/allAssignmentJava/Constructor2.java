package YTFrameworkNew.allAssignmentJava;
//"Assignment 2 (Optional)
//using this keyword default method
//Output should be in the below sequence
//3 parameterized method
//1 parameterized method
//4 parameterized method
//2 parameterized method"

public class Constructor2 {

	public Constructor2(int a)
	{
		this(12,21,23);
		System.out.println("one paramerized Constructor");
	}
	
	
	public Constructor2(int a, int b)
	{ 
		this(12,23,45,90);
		System.out.println("two paramerized Constructor");
	}
	

	public Constructor2(int a, int b, int c)
	{
		
		System.out.println("tthree paramerized Constructor");
	}

	public Constructor2(int a, int b, int c, int d)
	{
	this(12);
		System.out.println("four paramerized Constructor");
	}
	
	public static void main(String[] args) {
		Constructor2  sush= new Constructor2(12,23);
		
	}
	
}
