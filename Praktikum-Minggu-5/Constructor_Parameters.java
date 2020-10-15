public class Constructor_Parameters {
	int modelYear;
	String modelName;
	
	public Constructor_Parameters(int year, String name) {
		modelYear = year;
		modelName = name;
	}
	
	public static void main(String[] args) {
		Constructor_Parameters myCar = new Constructor_Parameters(1969, "Mustang");
		System.out.println(myCar.modelYear + " " + myCar.modelName);
	}
	
}