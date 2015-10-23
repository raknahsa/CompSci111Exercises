public class Palindrome{
  public static void main(String args[]){
      String str = IO.readString();
      System.out.println(checkPalindrome(str));
  }

  public static boolean checkPalindrome(String str){
    String s = "";

    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) != ' '){
        s = s + str.charAt(i);
      }
    }

    //debugging 
    //System.out.println(s);

    for(int i = 0; i < s.length()/2; i++){
      if(s.charAt(i) != s.charAt(s.length() - i - 1)){
        return false;
      }
    }
    return true;
  }
}
