package YTFrameworkNew.allAssignmentJava;
//Output should be in the below sequence using this keyword

//3 parameterized constructor
// Default constructor
// 1 parameterized constructor
// 2 parameterized constructor

public class Constructor1 {

	
	public Constructor1()
	{
		System.out.println("default Constructor");
	}
	
	public Constructor1(int a)
	{
		System.out.println("One Parameterized Constructor");
	}

	public Constructor1(int a, int b)
	{
		System.out.println("two Parameterized Constructor");
	}
	public Constructor1(int a, int b, int c)
	{
		System.out.println("three Parameterized Constructor");
	}
	
	public static void main(String[] args) {
		Constructor1 sush=new Constructor1(111, 123, 12);
		Constructor1 sush1=new Constructor1();
		Constructor1 sush2=new Constructor1(111);
		Constructor1 sush3=new Constructor1(111, 123);
	}
}
