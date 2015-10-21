/*

---NthPrime.java---
What is the problem?
Find the nth prime number
Input: Which number to find(1 is first number , 3 is second number, 5 is fifth number, etc.)
Output: The nth prime number( 1 is 2, 3 is 5, 1000 is 7919, etc)

*/

public class NthPrime {
  public static void main(String args[]){
    int n = IO.readInt();
    int nthPrime = 0;
    int count = 0;
    int i = 2;

    while (n < 1){//Error case when n is less than 1
      System.out.println(); //formatting
      System.out.println("Error : N must be larger than or equal 1 to give prime number");
      IO.reportBadInput();
      n = IO.readInt();
    }

    while(count < n){
      if(isPrime(i)){
        nthPrime = i;
        count++;
      }
      i++;
    }
    System.out.println(); //formatting
    IO.outputIntAnswer(nthPrime);

  }

  public static boolean isPrime(int x){
    for(int count = 2; count < x; count++){
    if ((x % count)== 0){
        return false;
      }
    }
    if( x == 1)
    {
      return false;
    }
    return true;
  }

}
