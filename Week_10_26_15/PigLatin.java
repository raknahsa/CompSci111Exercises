public class PigLatin{
  public static String translate(String original){
    String temp = "";

    for(int i = 0; i < original.length(); i++){
      if(Character.isLetter(original.charAt(i)) == false){
        IO.reportBadInput();
        return original;
      }
    }

    if(original.equals("")){
      IO.reportBadInput();
      return original;
    }
    if(original.charAt(0) == 'A' || original.charAt(0) == 'E' || original.charAt(0) == 'I' || original.charAt(0) == 'O' || original.charAt(0) == 'U'){
      temp = original + "way";
      return temp;
    }
    else if(original.charAt(0) == 'a' || original.charAt(0) == 'e' || original.charAt(0) == 'i' || original.charAt(0) == 'o' || original.charAt(0) == 'u'){
      temp = original + "way";
      return temp;
    }
    else{
      temp = original.substring(1) + original.charAt(0) + "ay";
      return temp;
    }
    }
}
