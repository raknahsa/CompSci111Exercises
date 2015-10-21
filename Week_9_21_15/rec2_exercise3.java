public class rec2_exercise3 {

	public static void main(String[] args){
		double a,b,c, avg;
		String name;
		System.out.println("Enter 3 numbers:");
		a = IO.readDouble();
		b = IO.readDouble();
		c = IO.readDouble();

		avg = (a + b + c) / 3.0;

		System.out.println("Enter your name:");
		name = IO.readString();
		System.out.println(name + ", the average of your numbers is " + avg);

	}

}
