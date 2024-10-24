package YTFrameworkNew.allAssignmentJava;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		System.out.println("Please enter value of a");
		
		Scanner ob= new Scanner(System.in);//has a relationship
		int a= ob.nextInt();
		System.out.println("Value of a " +a);
		System.out.println("Please enter value of f");
		float f=ob.nextFloat();
		System.out.println("Value of f"+ f);
	}

}
