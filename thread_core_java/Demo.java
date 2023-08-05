package thread_core_java;

public class Demo extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Thrad is = " +i);
		}
		
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.start();
		A obj2 = new A();
		obj2.start();
	}

}

class A extends Thread{
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("hiii");
		}
	}
}
