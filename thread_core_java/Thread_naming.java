//There is two type of method :- setName() and getName()
//default Thread name is given by JVM like Thread-0 , Thread-1, Thread-2 ,like that.
package thread_core_java;

class Nmaing_thread extends Thread{
	public void run() {
	}
}

public class Thread_naming {

	public static void main(String[] args) {
		System.out.print("Hey, main Thread is :- ");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Jia");
		System.out.print("Hey, main Thread after set diffrent name :- ");
		System.out.println(Thread.currentThread().getName());
		
		//creating object
		Nmaing_thread obj = new Nmaing_thread();
		obj.start();
		System.out.print("Hey, defualt Thread is :- ");
		System.out.println(obj.getName());
		
		obj.setName("Alex");//set name for default name
		System.out.print("Hey, defualt Thread after set diffrent name :- ");
		System.out.println(obj.getName());
		
		System.out.println(100/0);
		

	}

}