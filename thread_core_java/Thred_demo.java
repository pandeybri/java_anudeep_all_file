//first way to use Thread by using extends with class
package thread_core_java;

public class Thred_demo extends Thread
{

	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println("i = " + i);
			try {sleep(1000);} catch (Exception e) {}//we use sleep with try catch and also use sleep with try catch
		}
	}
	public static void main(String[] args) {
		Thred_demo obj = new Thred_demo();
		obj.start();
		Thred_demo obj1 = new Thred_demo();
		obj1.start();
	
	}

}
