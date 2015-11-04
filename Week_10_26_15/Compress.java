public class Compress{
  public static String compress (String original){

  //  String tmp;
    String str = "";
    char tmpp;
    int count = 1;
    boolean continu = false;
    int i = 0;

    if(original.equals("")){
      IO.reportBadInput();
      return "";
    }

    while (continu == false){
      tmpp = original.charAt(i);
      for(int j = i+1; j < original.length(); j++){
        if(tmpp == original.charAt(j)){
          count++;
      //    System.out.println("Adding " + tmpp);
        }
        else{
          break;
        }
      }
  //    System.out.println(count + " " + tmpp);
      if(count == 1){
        str = str + "" + tmpp;
      }
      else
        str = str + count + tmpp;

      i = i + count;
  //    System.out.println(i + " " + original.length());


      if(i == original.length()){
        continu = true;
      }
      count = 1;
    }

    return str;


  }
}
