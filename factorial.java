

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to display it's factorial : ");
		int number = sc.nextInt();
		int factorial = 1;
		for(int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of "+ number + " is : "+ factorial);
		sc.close();
	}	
}
