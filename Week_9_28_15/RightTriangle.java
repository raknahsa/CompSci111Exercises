/*
  Program to see if a triangle is a right triangle
*/
public class RightTriangle{
  public static void main(String[] args){

    System.out.println("Enter length of first line:");
    double lineOne = IO.readDouble();
    System.out.println("Enter length of second line:");
    double lineTwo = IO.readDouble();
    System.out.println("Enter length of third line:");
    double lineThree = IO.readDouble();

    if( lineOne <= 0 || lineTwo <= 0 || lineThree <= 0)
    {
      System.out.println("Can't have a line with a length less than or equal to zero");
      return;
    }
    if()

    double caseOne = (lineOne * lineOne + lineTwo * lineTwo ) - lineThree;
    double caseTwo = (lineTwo * lineTwo + lineThree * lineThree ) - lineOne;
    double caseThree = (lineOne * lineOne + lineThree * lineThree) - lineTwo;
    if()
  }
}
