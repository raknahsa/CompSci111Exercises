public class rec11_1{
  public static void main(String [] args){
    int [] arr = new int [10];
    for(int i = 0; i < 10; i++){
      arr[i] = (int) (Math.random() * 1000) + 1;
      System.out.println(arr[i]);
    }

    System.out.println("Enter number to be found:");
    int input = IO.readInt();

    for(int i = 0; i < 10; i++){
      if(arr[i] == input){
        System.out.println("Found, index is " + i);
        return;
      }
    }

    System.out.println("Not Found");


  }
}
