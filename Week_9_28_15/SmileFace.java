/*Recitation exercise to create a smiley face
*/
public class SmileFace{
  public static void main(String[] arg){
    System.out.println("Enter diameter of smiley face:");
    int diameter = IO.readInt();
    Picasso.moveDown(diameter/2 + 1);
    Picasso.moveRight(diameter/2 + 1);
    Picasso.drawCircle(diameter);

    Picasso.moveUp(diameter/4);
    Picasso.moveRight(diameter/3);
    Picasso.drawLineDown(diameter/3);

    Picasso.moveLeft(diameter/2);
    Picasso.drawLineDown(diameter/3);

    Picasso.moveDown(diameter/2);
    Picasso.drawLineRight(diameter/2);

  }

}
