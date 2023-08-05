package thread_core_java;
import java.util.Scanner;
public class TaxCalculator {
	Scanner sc=new Scanner(System.in);
	
	public void Calcu_tax() {
		
		
		
		double taxAmount;
		System.out.println("Are you Indian write :- 'true' or 'false'");
		boolean isIndian = sc.nextBoolean();
		
		if(isIndian== true) 
		{
			System.out.println("You are an indian");
		}
		else
		{
			throw new IllegalArgumentException("Country not valid:The employee should be an Indian citizen for calculating tax");
		}
		System.out.println("Whats your name:" );
		String empName= sc.next();
		if(empName==null) 
		{
			throw new IllegalArgumentException("Employee name not valid:The employee name cannot be empty");
		}
		
		System.out.println("How much is your salary:");
		double empSal = sc.nextDouble();
		  
	
		if(empSal>100000)
		{
			
			  taxAmount =empSal *8/100;
			  System.out.println("Your tax amount is" +taxAmount);
		}
		else if(empSal<100000||empSal>50000)
		{
			taxAmount =empSal *6/100;
			System.out.println("Your tax amount is" +taxAmount);
		}
		else if(empSal<50000||empSal>30000)
		{
			 taxAmount =empSal *5/100;
			 System.out.println("Your tax amount is" +taxAmount);
		}
		else if(empSal<30000||empSal>10000)
		{
			 taxAmount =empSal *4/100;
			 System.out.println("Your tax amount is" +taxAmount);
		}
		else
		{
			throw new IllegalArgumentException("Not eligible for Tax calculation:“The employee does not need to pay tax");
		}
	}
		
		
	


public static void main(String[] args) {
	// TODO Auto-generated method stub

	TaxCalculator obj=new TaxCalculator();
	obj.Calcu_tax();
	
	
	}

	
}