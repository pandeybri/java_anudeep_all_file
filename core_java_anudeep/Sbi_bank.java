package core_java_anudeep;

public class Sbi_bank extends Rbi_bank implements Interface_demo {

	public static void main(String[] args) {
		Sbi_bank sbi=new Sbi_bank();
				sbi.m1();
				sbi.m2();
				sbi.inter_RBI();
	}
	public void m2() {
		System.out.println("heyy i am SBI Bank. and i am child of RBI bank and father of PMC bank.");
	}
	@Override
	public void inter_RBI() {
		System.out.println("this interface example");
		
	}
}
