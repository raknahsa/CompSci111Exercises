public class StringTest{
  public static void main(String args[]){
  /*  String s = "hello";
    String s2 = IO.readString();

    if(s.equals(s2)){  //use .equals instead of ==
      System.out.println("goodbye");
    }else{
      System.out.println(":(" + s2.length());
    }  */
//== doesn't work for non-primitive types(ie. Strings)
    System.out.println("Enter string to be seperated");
    String s3 = IO.readString();
    //Strings are immutable
    //printLetters(s3);
    System.out.println("There are " + numberOfLetters(s3) + " letters");
    System.out.println("Uppercase is " + makeUpperCaseLetters(s3));
  }

  public static void printLetters(String s){
    for(int i = 0; i < s.length(); i++){
      System.out.println(s.charAt(i));
    }
    return;
  }

  public static int numberOfLetters(String s){
    int count = 0;
    for(int i = 0; i < s.length(); i++){
      if(Character.isLetter(s.charAt(i)) == true){
        count++;
      }
    }
    return count;
  }

  public static String makeUpperCaseLetters(String s){
    String sum = "";
    if(Character.isLetter(s.charAt(0)) && Character.isLowerCase(s.charAt(0))){
      sum = sum + Character.toUpperCase(s.charAt(0));
    }
    else{
      sum = sum + s.charAt(0);
    }

    for(int i = 1; i < s.length(); i++){
      if(Character.isSpaceChar(s.charAt(i))){
        if(Character.isLowerCase(s.charAt(i+1))){
          sum = sum + " ";
          sum = sum + Character.toUpperCase(s.charAt(i+1));
          i++;
        }
      }
      else{
        sum = sum + s.charAt(i);
      //  System.out.println("test");
      }
    }

    return sum;
  }

}
