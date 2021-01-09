import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int num1 , num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Addition of two numbers : "+(num1+num2));
		System.out.println("\nEnter two numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Substraction of two numbers : "+(num1-num2));
		

	}

}
