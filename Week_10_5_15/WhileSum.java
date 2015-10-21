public class WhileSum{
  public static void main (String[] args){

    int sum = 0;
    int x;
    int count  = 0;
    double average = 0;

    do{
      System.out.println("Enter Number:");
      x = IO.readInt();
      if(x >= 0)
      {
        sum += x;
        count++;
      }
    } while(x >= 0);

    average = (double)sum/(double)count;
    if (count == 0)
      average = 0;
    System.out.println("The sum is: " + sum);
    System.out.println("The average is: "+ average);
  }
}
