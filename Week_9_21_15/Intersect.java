/*Program to find the intersection of a line and a quadratic
equations are in format :
y = dx^2 + fx + g
y = mx + b

result is none, 1 , or 2 intersection point(s)
*/

public class Intersect {
  public static void main(String[] args){

//Coefficents for Quadtratic
    System.out.println("Enter the constant d:");
    int d = IO.readInt();
    System.out.println("Enter the constant f:");
    int f = IO.readInt();
    System.out.println("Enter the constant g:");
    int g = IO.readInt();

//Coefficents for line
    System.out.println("Enter the constant m:");
    int m = IO.readInt();
    System.out.println("Enter the constant b:");
    int b = IO.readInt();

    double tempPowVar = f - m;
    double quadPowVar = Math.pow(tempPowVar , 2);
    double quadSqrtInside = quadPowVar - 4 * d * (g - b);
    double quadSqrtVar = Math.sqrt(quadSqrtInside); //Temp vars so that problems with expressions inside Math.pow and Math.sqrt don't occur

    double interOneX = (- ( f - m) + quadSqrtVar) / ( 2 * d);
    double interTwoX = (- ( f - m) - quadSqrtVar) / ( 2 * d);

    double interOneY = (m * interOneX) + b;
    double interTwoY = (m * interTwoX) + b;

    double interDifference = interOneX - interTwoX;
    interDifference = Math.abs(interDifference);

    String interOne = "(" + interOneX + "," + interOneY + ")";
    String interTwo = "(" + interTwoX + "," + interTwoY + ")";

    System.out.println("The intersection(s) is/are:");

    if (d == 0)
      {
        if( (f - m) == 0 && ( b - g) != 0){
          System.out.println("None");
          return;
        }
        else if ( (f - m) == 0 && ( b - g) == 0){
          System.out.println("Infinite Intersections");
          return;
        }
        else {
          interOneX = ( b - g ) / (f - m);
          interOneY = (m * interOneX) + b;
          interOne = "(" + interOneX + "," + interOneY + ")";
          System.out.println(interOne);
        }
    }
    else {
      if(quadSqrtInside < 0)
      {
        System.out.println("None");
        return;
      }
      else if (interDifference > .0001){
        System.out.println(interOne);
      }
      System.out.println(interTwo);
    }
  }
}
