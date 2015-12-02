public class Recursion{
  public static void main (String [] args){
    //claculates and returns the nth fibonacci number
    System.out.println("Enter the nth fibonacci number to be found.");
    int x = IO.readInt();
    System.out.println(fibonacciNumber(x));
  }

  public static int fibonacciNumber(int n){
    //need to have a base case in reduction
    if(n < 1){
      return -1;
    }
    if(n == 1){
      return 1;
    }
    if(n == 2){
      return 1;
    }

    return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);

  }
}
