package core_java_anudeep;

abstract class Abstract_car {

	public void a1() {
        System.out.println("Hi, I am a simple method.");
    }

    abstract public void a2();
}

abstract class car_maruti extends Abstract_car {
    @Override
    public void a2() {
        System.out.println("Hey, I am the a2 method called in another class.");
    }
}

class b2 extends car_maruti {
	public static void main(String[] args) {
        b2 obj = new b2();
        obj.a1();
        obj.a2(); // Call the a2() method
    }

}
