package multipurposeCalculator;
import java.util.Scanner;
public class StatisticalCalculator {

	public static void stat() {
		// TODO Auto-generated method stub
		
		
		int choice=0;
		int sum = 0;
        double average=0;
        double total=0;

		Scanner input= new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~            Statistical Calculator           ~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.print("How many data are you going to enter?\n(Enter 0 to go back):");
		choice=input.nextInt();
        int a[] = new int[choice];
       
        System.out.println("Enter all the data:");
        
       for(int i = 0; i <= choice ; i++) {
            a[i] = input1.nextInt();
            sum = sum + a[i];
            
        }
        

        average = sum / choice;
        for(int i=0;i<=choice;i++) {
        	double num = a[i];
        	double result = Math.pow(num - average, 2);
        	total = total + result;
        	
        }
        double var= (1.0/choice)*total;
        double sd= Math.sqrt(var);
        System.out.println("Total number of data: "+choice);
        System.out.println("Sum:"+sum);
        System.out.println("Average: "+average);
        System.out.println("Standard Deviation: "+sd);   
			
	}

}

