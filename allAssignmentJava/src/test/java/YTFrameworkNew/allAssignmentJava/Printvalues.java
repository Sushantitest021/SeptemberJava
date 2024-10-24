package YTFrameworkNew.allAssignmentJava;
//declare two variables age and roll no, Create two Methods and Print the method and variables 

public class Printvalues {
	
int age;

int rollNo;

public void Display1()
{
	System.out.println("Welcome all of you");

}

public void Display2()
{
	System.out.println("Welcome to this group");

}

public static void main(String[] args) {
	
	Printvalues print =new Printvalues();
	print.Display1();
	print.Display2();
    print.age=102;
    System.out.println("Value of age"+ print.age);
    print.rollNo=12;
    System.out.println("Value of rollNo" + print.rollNo);
}
}