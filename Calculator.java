package test1;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[])
	{
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		num1 = sc.nextInt();
		System.out.println("Enter 2nd Number");
		num2 = sc.nextInt();
		/**/
		int choice;
		System.out.println("Enter your choice:");
		System.out.println("1.Add");
		System.out.println("2.Sub");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			int result;
			result = add(num1,num2);
			System.out.println("Addition: "+result);
			break;
		case 2:
			int result1 = sub(num1,num2);
			System.out.println("Substraction: "+result1);
			break;
			
		}
}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	private static int sub(int i,int j) {
		
		return i-j;
	}

}
