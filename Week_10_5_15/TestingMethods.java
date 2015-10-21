public class TestingMethods{
  public static void main(String args[]){
/*    System.out.println("Method for multiplying integers, enter two intgers");
    int x = IO.readInt();
    int y = IO.readInt();
    System.out.println("Answer is : " + Methods.multiply(x, y));*/
    System.out.println("Is the Number Prime");
    int z = IO.readInt();
    System.out.println("It is : " + Methods.isPrime(z));

    int n = IO.readInt();
    int p = IO.readInt();
    System.out.println("GCF is of the 2 numbers is : " + Methods.gcdOfNums(n,p));
  }
}
