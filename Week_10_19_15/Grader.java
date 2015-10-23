public class Grader{
  public static void main(String args[]){

      int choice = 0;
      int counter = 0;
      double[] gradebook = new double[30];
      for(int x = 0; x < gradebook.length ; x ++){
        gradebook[x] = -1;
      }


      while(choice != 5){

        System.out.println();
        System.out.println("Menu");
        System.out.println("1. Change grade");
        System.out.println("2. Add grade");
        System.out.println("3. Average");
        System.out.println("4. Display Grades");
        System.out.println("5. Exit");

        choice = IO.readInt();

        switch(choice){
          case 1:
            System.out.println("Enter which assignment is to be changed(1 = First, 2 = Second, 3 = Third)");
            int x = IO.readInt() - 1;
            if( x < 0 || x >= counter){
              System.out.println("Not in Bounds");
              break;
            }

            System.out.println("Enter what the new grade is: ");
            gradebook[x] = IO.readDouble();
            System.out.println("New grade for the assignment " + (x + 1) + " is " + gradebook[x]);
            break;
          case 2:
              if(counter != gradebook.length){
                System.out.println("Enter what the new grade is: ");
                gradebook[counter] = IO.readDouble();
                System.out.println("New grade for the assignment at " + (counter + 1) + " is " + gradebook[counter]);
              }
              counter++;
            break;
          case 3:
            double sum = 0.0;
            if(counter == 0){
              System.out.println("No Grades");
            }
            for(int j = 0; j < counter; j++){
              sum += gradebook[j];
            }
            System.out.println("Average = " + sum/ (counter + 1));
            break;
          case 4:
            for(int j = 0; j < counter; j++){
              System.out.println("Grade " + (j + 1) + " is " + gradebook[j]);
            }
            break;
          case 5:
            break;
          default:
          System.out.println("ERROR. Not an option");
            break;
        }

      }
  }
}
