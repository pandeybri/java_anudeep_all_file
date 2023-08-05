package thread_core_java;

public class Thread_priority_yield {

	public static void main(String[] args) {
		Priority_one obj = new Priority_one();
		Priority_second obj2 = new Priority_second();
		
		obj.setPriority(8);//same priority
		obj2.setPriority(8);//same priority
		
		obj.start();
		obj2.start();
		
		//but in output they execute second thread because

	}

}

class Priority_one extends Thread{
	public void run() {
		for(int i = 0; i <=10; i++) {
			System.out.println("hii i am first priority");
			Thread.yield();//this use to pause the current thread and execute second thread with same priority of thread
			//we using thread before yield because yield is static method so always use Thread when method is static
		}
	}
}

class Priority_second extends Thread{
	public void run() {
		for(int i = 0; i <=10; i++) {
			System.out.println("hii i am second priority");
		}
	}
}
