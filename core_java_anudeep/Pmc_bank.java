package core_java_anudeep;

public class Pmc_bank extends Sbi_bank {
	public static void main(String[] args) {
		Pmc_bank pmc=new Pmc_bank();
				pmc.m1();
				pmc.m2();
				pmc.m4();
	}
	public void m4() {
		System.out.println("hey i am PMC bank and child of SBI bank.");
	}
}
