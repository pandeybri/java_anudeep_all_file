package thread_core_java;

class Counter extends Thread{
	int count;
	
	public void incerment() {
		count++;
	}
	
	public void run() {
		for(int i = 0; i<=1000; i++) {
			Counter obj2 = new Counter();
			obj2.incerment();
		}
	}
}
//class Counter2 extends Thread{
//	int count;
//	public void increment() {
//		count++;
//	}
//	
//	public void run() {
//		for(int i = 0; i<=1000; i++) {
//			Counter2 obj2 = new Counter2();
//			obj2.increment();
//		}
//	}
//}

public class Thread_synchronized_keyword {

	public static void main(String[] args) {
		Counter obj = new Counter();
		obj.start();
		Counter obj2 = new Counter();
		obj2.start();
		System.out.println("Count "+ obj.count+obj2.count);

	}

}
