package thread_core_java;

public class Thread_Runnable_interface implements Runnable
{

	public static void main(String[] args) {

		Thread_Runnable_interface obj = new Thread_Runnable_interface();
		Thread obj1 = new Thread(obj);
		obj1.start();
	}

	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println("i = " + i);
			try {
				Thread.sleep(1000);//see here we using Thread before sleep because we using interface  of Runnable but sleep methid are part of Thread class 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
