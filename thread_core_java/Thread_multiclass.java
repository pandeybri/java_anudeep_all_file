package thread_core_java;

public class Thread_multiclass {

	public static void main(String[] args) {

		Hii obj = new Hii();
		Hello obj2 = new Hello();
		obj.start();
		obj2.start();
	}

}

class Hii extends Thread{
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println("Hii");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}
class Hello extends Thread{
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println("Hello");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}