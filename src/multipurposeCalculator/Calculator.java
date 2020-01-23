package multipurposeCalculator;

import java.util.Scanner;

public class Calculator {

	public static void calcu(){
		// TODO Auto-generated method stub
		
		double a=0;
		double b=0;
		int choice=0;
		
		Scanner input= new Scanner(System.in);
		Scanner input1= new Scanner(System.in);
		Scanner input2= new Scanner(System.in);
		
		do {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~               Math Calculator               ~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Please Select Your Desired Math Operation:");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Back");
		choice=input.nextInt();
		
		if(choice==1) {
			System.out.println("Addition");
			System.out.print("Type the first variable:");
			a=input1.nextDouble();
			System.out.print("Type the second variable:");
			b=input2.nextDouble();
			System.out.println("The answer is: "+(a+b));
			
		}
		else if(choice==2) {
			System.out.println("Subtraction");
			System.out.print("Type the first variable:");
			a=input1.nextDouble();
			System.out.print("Type the second variable:");
			b=input2.nextDouble();
			System.out.println("The answer is: "+(a-b));
		}
		else if(choice==3) {
			System.out.println("Multiplication");
			System.out.print("Type the first variable:");
			a=input1.nextDouble();
			System.out.print("Type the second variable:");
			b=input2.nextDouble();
			System.out.println("The answer is: "+(a*b));
		}
		else if(choice==4) {
			System.out.println("Division");
			System.out.print("Type the first variable:");
			a=input1.nextDouble();
			System.out.print("Type the second variable:");
			b=input2.nextDouble();
			System.out.println("The answer is: "+(a/b));
		}
		}while(choice!=5);
		
		
		
		
		

		
	}

}

