// Program to find the sum of two numbers ( 1 + 2 = 3)

public class Sum {
	public static void main(String[] args){

		System.out.println("Enter the first number:");
		int num1 = IO.readInt();
		System.out.println("Enter the second number:");
		int num2 = IO.readInt();

		int sumOfNumbers = num1 + num2;
		//System.out.println(); // Empty Line
		IO.outputIntAnswer(sumOfNumbers);
	}
}
