public class RecSixMethods{
  public static int gcdOfNums(int a, int b){
    int answer = 1;
    for(int x = 1; x <= b; x++){
        if(a % x == 0 && b % x == 0){
            answer = x;
        }
  }
  return answer;
    }

  public static void printTable(int N){
    for ( int count = 1; count < N + 1; count++)
    {
      for (int county = 1; county < N + 1; county++){
        System.out.print(count * county + " ");
      }
      System.out.println("");
    }
    return;
  }

}
