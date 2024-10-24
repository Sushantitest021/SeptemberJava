package YTFrameworkNew.allAssignmentJava;

import java.util.Scanner;

//"Assignment 2 
//Solve below expressions
//((((x1+x2)-x3)+x4)*x5)/x6)
//take the value of x1,x2,x3,x4,x5,x6 using scanner class, create four methods---sum,sub,multi,division"
public class ScannerClassAssignment {
	
	public int sum(int x1, int x2) {

		
		int c;
		c= x1+x2;
		System.out.println("Value of sum is" +c );
		return c;
	}
	
	public int sub() {
		
		System.out.println("Value of sub is"  );
		return 0;
	}
	
public int multi() {
		
		System.out.println("Value of Multi is"  );
		return 0;
	}
	
public void div() {
	
	System.out.println("Value of div is"  );
}
	public static void main(String[] args) {
		Scanner ob= new Scanner (System.in);
	System.out.println("Value of x1 is");
		int x1= ob.nextInt();
		System.out.println("Value of x2 is");
		int x2= ob.nextInt();
		System.out.println("Value of x3 is");
		int x3= ob.nextInt();
		System.out.println("Value of x4 is");
		int x4= ob.nextInt();
		System.out.println("Value of x5 is");
		int x5 =ob.nextInt();
		System.out.println("Value of x6 is");
		int x6=ob.nextInt();
		
	}
	

}
