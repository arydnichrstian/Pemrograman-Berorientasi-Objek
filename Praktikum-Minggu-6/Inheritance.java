public class Inheritance {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.honk();
		System.out.println(myCar.brand + " " + myCar.modelName);
	}

}

class Vehicle{
	protected String brand = "Ford";
	public void honk() {
		System.out.println("Tut, tuut!");
	}
}

class Car extends Vehicle{
	String modelName = "Mustang";
}