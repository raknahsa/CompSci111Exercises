public class SelectionSort{

  public static void main(String [] args){
    int [] arr ={5,1,3,9,0,2,4};

  //  int[] sarr = ssort(arr);

    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }


  }


public static void ssort(int [] arr){

  //int smallest = arr[i];
  int tmp;
  int index;

  for(int i = 0; i < arr.length -1; i++){
    //smallest = arr[i];
    index = i;
    for(int j = i + 1; j < arr.length; j++){
      if(arr[j] < arr[index]){
        //smallest = arr[j];
        index = j;
      }
    }
    tmp = arr[i];
    arr[i] = arr[index];
    arr[index] = tmp;
  }

//  return arr;

}


}
