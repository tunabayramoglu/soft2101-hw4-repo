import java.util.Scanner;

public class RangePrinter{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter first number");
		int number1 = scn.nextInt();

		System.out.println("Enter second number");
		int number2 = scn.nextInt();

		int start = Math.min(number1, number2);
		int end = Math.max(number1, number2);

		System.out.print("Numbers between " + start + " and " + end + ": ");
		for(int i = start + 1 ; i < end; i++){
			if (i % 2 != 0){
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}
