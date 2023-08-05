package thread_core_java;

public class Thread_rwoMethosDisplayInfiniteTimes extends Thread2 {
	
	Thread_rwoMethosDisplayInfiniteTimes(){
		System.out.println("exit the programming press 'ctrl+c'");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Thread1{
	public void run() {
		System.out.println("hiii");
	}
}

class Thread2 extends Thread1{
	public void run() {
		System.out.println("hiii");
	} 
}
