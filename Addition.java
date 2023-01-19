import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// Addition of two number
		Scanner key = new Scanner(System.in);
		System.out.println("Enter First number");
		int num1 = key.nextInt();
		System.out.println("Enter Second number");
		int num2 = key.nextInt();
		int add = num1+num2;
		System.out.println("Result is " + add);

	}

}
