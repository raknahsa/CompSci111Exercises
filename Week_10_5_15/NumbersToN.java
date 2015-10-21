/* Print out numbers from 1 to N*/

public class NumbersToN{
  public static void main(String args[]){
    boolean posInt = false;
    int N = 0;
//    int count = 1;   // for do while version
    System.out.println("Enter the N:");
    do {
      N = IO.readInt();
        if(N <= 0)
          System.out.println ("Enter a number greater than or equal to 1:");
        else
          posInt = true;
    }while(posInt == false);

// another way using a do while loop
  /*  do {
      System.out.print(count + " ");
      count++;
    } while (count != (N +1));
*/
    for ( int count = 1; count < N + 1; count++)
    {
      for (int county = 1; county < N + 1; county++){
        System.out.print(count * county + " ");
      }
      System.out.println("");
    }

  }

}
