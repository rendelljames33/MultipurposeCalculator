package multipurposeCalculator;

import java.util.Scanner;

public class PythagoreanTheorem {

	public static void pytha() {
		Scanner input= new Scanner(System.in);
		Scanner input1= new Scanner(System.in);
		Scanner input2= new Scanner(System.in);
		int number=0;
		
		do {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~            Pythagorean's Theorem            ~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.print("How many triangles to compute?\n(Enter 0 to go back): ");
		number=input2.nextInt();
		double[] a= new double[number];
		double[] b= new double[number];
		
		for(int i=0;i<number;i++) {
			System.out.print("Type value a: ");
			a[i]=input.nextDouble();
			
			System.out.print("Type value b: ");
			b[i]=input1.nextDouble();
			
			double c= Math.sqrt((a[i]*a[i])+(b[i]*b[i]));
			System.out.println("The value of c is: "+c);
			
		}
		}while(number!=0);
	}

}



