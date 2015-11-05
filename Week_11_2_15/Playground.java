public class Playground{
  public static void main(String args[]){
    Cat one = new Cat();
    Cat two = new Cat();

  //  one.setAge(1000);
    if(one.equals(two)){
      System.out.println("They are twins");
    }
    else
      System.out.println("They are not twins");

    one.dye("green");

  }
}
