import java.util.Scanner;

public class Import_Class {
	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.print("Masukkan Username = ");
		
		String userName = myObj.nextLine();	
		System.out.println("Username-nya adalah: " + userName);
		}

}