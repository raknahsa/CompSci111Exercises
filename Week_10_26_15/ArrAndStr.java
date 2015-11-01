/*
Write a program that will take a string and separate the characters in the string into an array.
So if the user enters Puppies, create an array of length 7 with P at index 0, u at index 1,
and so on. With this array, reverse the string and print it
Reciation 8 Exercise 1

*/
public class ArrAndStr{
  public static void main(String args[]){

    System.out.println("Enter the string to be reversed.");

    String str = IO.readString();

    System.out.println("The reversed string is " + reverseString(str));
  }

  public static String reverseString(String str){
    String revStr = "";
    char[] arr = new char[str.length()];

    for(int i = 0; i < str.length(); i++){
        arr[i] = str.charAt(i);
    }

    for(int i = 0; i < str.length(); i++){
        revStr = revStr + arr[arr.length -1 - i];
    }
    return revStr;
  }

}
