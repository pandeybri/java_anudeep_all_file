package thread_core_java;

public class Thread_join_isAlive {

	public static void main(String[] args) throws InterruptedException {
		//it is part of default Thread
		//creating object
		T1 obj = new T1();
		T2 obj2 = new T2();
		
		System.out.println(obj.isAlive());
		obj.start();
//		System.out.println(obj.isAlive());//show true 
		obj2.start();
		
		//Add join() method 
		obj.join(200);//we using join() method for waiting for another thread
		obj2.join(200);
		
		//it is part of main Thread
		System.out.println("bye");
		System.out.println(obj.isAlive());//show false because we not using give any time in join method 
		//NOTE: isAlive have only two values :- 'True' and 'False'.
	}

}

class T1 extends Thread{
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println("Hii");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}

class T2 extends Thread{
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println("Hello");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
} 
