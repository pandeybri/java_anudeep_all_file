package java_projects;

import java.util.Scanner;

public class Working_of_atm_machine {

	static int user_pin = 1234;
	static int atm_amt = 5000;
	static int user_amt = 4000;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		starting_atm();
		
	}
	//welcome part start
	public static void starting_atm() {
		System.out.println("Welcome to Pandey Bank");
		
		System.out.println("Insert your card either debit card or credit card");
		
		System.out.println("Select your langauge:- English or Hindi");
		String lang = sc.nextLine();
		if(lang.equalsIgnoreCase("english")){
			System.out.println("you selecting "+lang+" langauge");
			pin_part();
		}
		else {
			System.out.println("Try again");
			starting_atm();
		}
	}
	//end welcome part
	
	//start pin part
	public static void pin_part() {

		System.out.println("#########################################");
		System.out.println("Enter your pin using keyboard");
		int pin = sc.nextInt();
		if(pin==user_pin) {
			transaction_option();
		}
		else {
			System.out.println("Sorry,please enter valid pin");
			pin_part();
		}
	}
	//end pin part
	
	//start transaction option
	public static void transaction_option() {
		System.out.println("#########################################");
		System.out.println("Please select the Transaction :- 'Withdrawal cash' or 'Deposit cash' ");
		String tran = sc.next();
		if (tran.equalsIgnoreCase("Withdrawal cash") || tran.equalsIgnoreCase("withdrawal")) {
	        withdrawal_cash();
	    } 
		else if (tran.equalsIgnoreCase("Deposit cash") || tran.equalsIgnoreCase("deposit")) {
	        deposit_cash();
	    }
		else {
			System.out.println("Please enter valid one");
			transaction_option();
		}
	}
	//end transaction option
	
	//start withdrawal part
	public static void withdrawal_cash() {
		System.out.println("#########################################");
		System.out.println("Withdraw your cash"+"\n");
		System.out.println("Enter the amount of cash");
		int with_cash = sc.nextInt();
		if(with_cash<=user_amt) {
			if(with_cash<=atm_amt) {
				System.out.println("Please collect your cash "+with_cash);
				with_tran_receipt(with_cash);
			}
			else {
				System.out.println("sorry,please select upto "+atm_amt);
				System.out.println("Try again");
				withdrawal_cash();
			}
		}
		else {
			System.out.println("sorry,your limit is to withdraw upto "+user_amt);
			System.out.println("Try again");
			withdrawal_cash();
			
		}
		
		
	}
	//start print withdrawal receipt
	public static void with_tran_receipt(int with_cash) {
		System.out.println("#########################################");
		System.out.println("you want print the receipt or skip the receipt");
		System.out.println("Print receipt press 'Yes' and Skip receipt press 'No'");
		String receipt = sc.next();
		if(receipt.equalsIgnoreCase("Yes")||receipt.equalsIgnoreCase("yes")) {
			System.out.println("#########################################");
			System.out.println("\n"+"Pandey Bank"+"\n"+"\n");
			System.out.println("Withdrawal  Rs.   "+with_cash);
			System.out.println("Available balance  Rs.     "+(user_amt-with_cash)+"\n"+"\n");
			System.out.println("Visit again");
		}
		else {
			System.out.println("#########################################");
			System.out.println("\n"+"Pandey Bank"+"\n"+"\n");
			System.out.println("Visit again");
		}
	}
	//end print withdrawal receipt
	//end withdrawal part
	
	//start Deposit part
	public static void deposit_cash() {
		System.out.println("#########################################");
		System.out.println("Please choose option : cash,check,both");
		String depo_cash = sc.next();
		if(depo_cash.equalsIgnoreCase("cash")||depo_cash.equalsIgnoreCase("check")||depo_cash.equalsIgnoreCase("both")) {
			insert_depo_cash(depo_cash);
		}
		else {
			System.out.println("please select again");
			deposit_cash();
		}
	}
	//start insert deposit cash
	public static void insert_depo_cash(String depo_case) {
		System.out.println("#########################################");
		System.out.println("Please deposit your "+depo_case);
		System.out.println("Enter the amount you want to deposit");
		int depo_amt = sc.nextInt();
		System.out.println("Please confirm your amount");
		int conf_demo_amt = sc.nextInt();
		if(conf_demo_amt==depo_amt) {
			depo_tran_receipt(depo_amt);
		}
		else {
			System.out.println("Not verify, please try again.");
		}
	}
	//end insert deposit cash
	
	//start print deposit receipt
	public static void depo_tran_receipt(int depo_amt) {
		System.out.println("#########################################");
		System.out.println("you want print the receipt or skip the receipt");
		System.out.println("Print receipt press 'Yes' and Skip receipt press 'No'");
		String receipt = sc.next();
		if(receipt.equalsIgnoreCase("Yes")||receipt.equalsIgnoreCase("yes")) {
			System.out.println("#########################################");
			System.out.println("\n"+"Pandey Bank"+"\n"+"\n");
			System.out.println("Deposit  Rs.   "+depo_amt);
			System.out.println("Available balance  Rs.     "+(user_amt+depo_amt)+"\n"+"\n");
			System.out.println("Visit again");
		}
		else {
			System.out.println("#########################################");
			System.out.println("\n"+"Pandey Bank"+"\n"+"\n");
			System.out.println("Visit again");
		}
	}
	//end print deposit receipt
	//end Deposit part

}
