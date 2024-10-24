package YTFrameworkNew.allAssignmentJava;

import java.util.Scanner;

public class ReverseNumberbyScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num= sc.nextInt(); //1234- 4321
		/*
		int rev=0;
		while(num!=0)
		{
			rev = rev*10 +num%10;
			num=num/10;
			*/
		//Using String Buffer method class
		StringBuffer reverse;
		StringBuffer sb= new StringBuffer(String.valueOf(num));
		reverse= sb.reverse();
		System.out.println("Reverse of number : " + reverse);
		}
		
	}

