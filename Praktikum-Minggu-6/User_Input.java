import java.util.Scanner;

public class User_Input {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Silahkan input nama, umur, dan gaji: ");
		
		String name = myObj.nextLine();
		int age = myObj.nextInt();
		double salary = myObj.nextDouble();
		
		System.out.println("Nama = " + name);
		System.out.println("Umur = " + age);
		System.out.println("Gaji = " + salary);
	}

}
