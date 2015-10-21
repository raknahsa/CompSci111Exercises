/*Program to find the polynomial when given 3 roots(ex, if roots are 1,2,3 ,
polynomial is (x-1)(x-2)(x-3) or x^3 - 6x^2 + 11x - 6)
*/
public class Poly {
	public static void main(String[] args){

		System.out.println("Enter the first root:"); // reminder: check for syntax
		int firstRoot = IO.readInt();
		System.out.println("Enter the second root:");
		int secondRoot = IO.readInt();
		System.out.println("Enter the third root:");
		int thirdRoot = IO.readInt();

		int firstCoe, secondCoe, thirdCoe; //Coe = Coefficent
		firstCoe = -(firstRoot + secondRoot) - thirdRoot;
		secondCoe = (firstRoot * secondRoot) + ((firstRoot + secondRoot) * thirdRoot);
		thirdCoe = - (firstRoot * secondRoot * thirdRoot);

		String firstCoeSign = "+ ";    // To fix problem of + - (x) to be - X
		String secondCoeSign = "+ ";
		String thirdCoeSign = "+ ";


		if(firstCoe < 0){
			firstCoeSign = "- ";
			firstCoe = firstCoe * -1;
		}

		if(secondCoe < 0){
			secondCoeSign = "- ";
			secondCoe = secondCoe * -1;
		}

		if(thirdCoe < 0){
			thirdCoeSign = "- ";
			thirdCoe = thirdCoe * -1;
		}

		String finalPoly = "x^3 " + firstCoeSign + firstCoe + "x^2 " + secondCoeSign + secondCoe + "x " + thirdCoeSign + thirdCoe;

		System.out.println(finalPoly);
	}
}
