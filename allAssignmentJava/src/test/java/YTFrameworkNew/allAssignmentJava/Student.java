package YTFrameworkNew.allAssignmentJava;

public class Student {
	int age=32;
	int rollNo=9;
	public void Display1()
	{
		System.out.println("age is" + age);
	}
public void Display2()
{
	System.out.println("Roll no is" + rollNo );
}
public static void main(String[] args) {
	Student new1= new Student();

	new1.Display1();
	new1.Display2();
}
}

