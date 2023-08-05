package core_java_anudeep;

public class Encapsulation_demo {
	private int account_no;
	private int pin_no;
	String bank_name;
	String holder_name;
	
	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public int getPin_no() {
		return pin_no;
	}

	public void setPin_no(int pin_no) {
		this.pin_no = pin_no;
	}

	public void bank_details() {
		System.out.println("this is account number :-" +account_no);
		System.out.println("this is pin number :-" +pin_no);
		System.out.println("this is bank name :-" +bank_name);
		System.out.println("this is holder name :-" +holder_name);
	}
	
	

}
