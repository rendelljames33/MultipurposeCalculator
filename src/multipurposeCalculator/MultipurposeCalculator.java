package multipurposeCalculator;

import java.util.Scanner;

public class MultipurposeCalculator {

	public static void main(String[] args) {

			int main=0;
			Scanner input= new Scanner(System.in);
			Scanner input1= new Scanner(System.in);
			Scanner input2= new Scanner(System.in);
				do {	
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("~  Rendell's Multipurpose Program   ~");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("1.Wage Calculator");
					System.out.println("2.Pythagorean's Theorem");
					System.out.println("3.Math Calculator");
					System.out.println("4.Statistical Calculator");
					System.out.println("5.Exit");
					main=input.nextInt();
			
						if(main==1) {
							WageCalculator.wage();
						}
						else if(main==2) {
							PythagoreanTheorem.pytha();
							}
						else if(main==3) {
							Calculator.calcu();
						}
						else if(main==4) {
							StatisticalCalculator.stat();
						}
						else {
							System.out.println("Incorrect input!");
						}
					}while(main!=5);
							System.out.println("Thank You!");

		}
	}
