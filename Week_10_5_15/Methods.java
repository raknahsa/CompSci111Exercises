public class Methods {
// format of method public static *output type *name of function (*parameters){}
public static int multiply(int x, int y){  //method signature
//  int num1 = x;
//  int num2 = y;
  int answer = 0;
  boolean isNegative = false;
  if(x < 0 && y < 0)
    {
      x = 0 - x;
      y = 0 - y;
    }
  else if(x < 0){
      x = 0 - x;
      isNegative = true;
  }

  for(int count = 0; count < x; count++){
    answer += y;
  }
  if(isNegative){
    answer = 0 - answer;
  }

  return answer;
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

public static int gcdOfNums(int a, int b){
  int answer = 0;
  for(int x = 1; x <= b; x++){
      if(a % x == 0 && b % x == 0){
          answer = x;
      }
  }
/*  while (b > 0)
  {
      int temp = b;
      b = a % b; // % is remainder
      a = temp;
  }
  return a;*/
  return answer;
}
}
