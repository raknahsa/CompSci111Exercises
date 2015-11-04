public class WordCount{
  public static int countWords(String original, int minLength){
    int index = 0;
    int count = 0;
    int numberOfWords = 0;
    String tmp = "";
    String tmpp = "";
    boolean isChar = false;

    if(original.equals("")){
      IO.reportBadInput();
      return 0;
    }

    original = original + " ";
    original = original.replaceAll("[^\\w\\s]","");

//    System.out.println(original);

    index = original.indexOf(" ");

    while(index != -1){

      tmp = original.substring(0,index);

      for(int i = 0; i < tmp.length(); i++){
        tmpp = "" + tmp.charAt(i);
        isChar = tmpp.matches("[a-zA-z]{1}");
        if(isChar){
          count++;
        }

      }

      if(count >= minLength){
        numberOfWords++;
      //  System.out.println(tmp.length() + " " + tmp + " added");
      }
/*
      else
      {
        System.out.println(tmp.length() + " " + tmp + " not added");
      }
*/
      original = original.substring(index + 1);
      count = 0;
  //    System.out.println(original);

      index = original.indexOf(" ");

    }

    return numberOfWords;
  }
}
