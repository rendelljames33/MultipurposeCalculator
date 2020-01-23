package multipurposeCalculator;

import java.util.Scanner;

public class WageCalculator {

	public static void wage(){
		// TODO Auto-generated method stub
		int rw = 110;
		int otr = 150;
		int hrs = 0;
		
		
		int rr =880;
		int number =0;
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		do {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~               Wage Calculator               ~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.print("How many people do you want to know the wage?\n(Enter 0 to go back):");
		number = input2.nextInt();
		
		String[] name = new String [number];
		int[] hours = new int[number];
		
		
		for(int i=0;i<number;i++) {
		System.out.print("Please input your name :");
		name[i] = input.nextLine();
		
		System.out.print("How many hours you've worked? ");
		hours[i] = input1.nextInt();
		
		if(hours[i]<=8) {
			hrs = hours[i];
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~               Wage Calculator               ~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Name: " + name[i]);
			System.out.println("Hours: " + hours[i]);
			System.out.println("Wage: " +hrs*rw);
		}
		else if (hours[i]>8) {
			hrs = hours[i] - 8;
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~                Wage Calculator              ~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Name: " + name[i]);
			System.out.println("Hours: " + hours[i] + "(" + hrs + " overtime)");
			System.out.println("Wage: " + (hrs*otr+rr));
			}
		}
		}while(number!=0);

	}

}


