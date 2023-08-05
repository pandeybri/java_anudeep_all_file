package java_projects;

public class Chained_exception {

	public static void main(String[] args) {

		try {
			divisionNumber(10,0);
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void divisionNumber(int dividend, int divisor) throws Exception {
		try {
			int result = dividend/divisor;
			System.out.println("Result is "+result);
		}catch(ArithmeticException ae ) {
			throw new Exception("error occur during division",ae);
		}
	}
}
