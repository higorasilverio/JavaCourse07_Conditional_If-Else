package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		if(number < 0) System.out.println("It is negative!");
		else System.out.println("It is positive!");
		
		scanner.close();
		
	}

}
