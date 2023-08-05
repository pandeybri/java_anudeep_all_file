package core_java_anudeep;

abstract class car{
	abstract public void color();
	abstract public void seat();
	abstract public void wheel();
	abstract public void model();
	
	public void car_intro() {
		System.out.println("hey i am car you can modified as you want.");
		System.out.println("abstract method use any another class.");
	}
	
}
class bmw extends car{

	@Override
	public void color() {
		System.out.println("color of bmw car is 'white'");
		
	}

	@Override
	public void seat() {
		System.out.println("four seater car");
		
	}

	@Override
	public void wheel() {
		System.out.println("4 wheel");
		
	}

	@Override
	public void model() {
		System.out.println("Model = BMW101");
		
	}
	
}

class maruti extends car{

	@Override
	public void color() {
		System.out.println("color of maruti car is 'black'");
		
	}

	@Override
	public void seat() {
		System.out.println("four seater car");
		
	}

	@Override
	public void wheel() {
		System.out.println("4 wheel");
		
	}

	@Override
	public void model() {
		System.out.println("Model = maruti 102");
		
	}
	
}

public class Abstract_demo {

	public static void main(String[] args) {
		System.out.println("what is type of your Car"+"\n");
		bmw obj = new bmw();
		obj.car_intro();
		obj.color();
		obj.seat();
		obj.wheel();
		obj.model();
		
		System.out.println("********************************************");

		maruti mar = new maruti();
		mar.car_intro();
		mar.color();
		mar.seat();
		mar.wheel();
		mar.model();
	}

}
