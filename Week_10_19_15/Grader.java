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
            changeGrade(gradebook, counter);
            break;
          case 2:
            counter = addGrade(gradebook, counter);
            break;
          case 3:
            averageGrade(gradebook, counter);
            break;
          case 4:
            printGradebook(gradebook, counter);
            break;
          case 5:
            System.out.println();
            System.out.println("Exiting");
            break;
          default:
            System.out.println();
            System.out.println("ERROR. Not an option");
            break;
        }

      }
  }

  public static void printGradebook(double[] gb, int index ){
    System.out.println();
    if(index == 0){
      System.out.println("There are no grades.");
    }
    for(int j = 0; j < index; j++){
      System.out.println("Grade " + (j + 1) + " is " + gb[j]);
    }
    return;
  }

  public static int addGrade(double[] gb, int index){
    double x = 0;
    System.out.println();
    if(index != gb.length){
      System.out.println("Enter what the new grade is: ");
      x = IO.readDouble();   //allowed since the reference of the array is passed,
                                     //allowing the array to be changed outside of the scop since
                                     //both are being passed to the same memory location
      if(checkGrade(x)){
        gb[index] = x;
      }
      else{
        return index;
      }
      System.out.println("New grade for the assignment at " + (index + 1) + " is " + gb[index]);
    }
    return index + 1;
    //counter can not be changed since int variable is not in scope, index needs to be passed to counter
  }

  public static void averageGrade(double[] gb, int index){
    double sum = 0.0;
    if(index == 0){
      System.out.println("No Grades");
    }
    for(int j = 0; j < index; j++){
      sum += gb[j];
    }
    System.out.println("Average = " + sum/ (index + 1));
  }

  public static void changeGrade(double[] gb, int index){
    System.out.println("Enter which assignment is to be changed(1 = First, 2 = Second, 3 = Third)");
    int x = IO.readInt() - 1;
    if( x < 0 || x >= index){
      System.out.println("Not in Bounds");
      return;
    }

    System.out.println("Enter what the new grade is: ");
    gb[x] = IO.readDouble();
    System.out.println("New grade for the assignment " + (x + 1) + " is " + gb[x]);
  }

  public static boolean checkGrade(double x){
    if(x < 0 || x > 100){
      System.out.println("Grade has to be between 0 and 100");
      return false;
    }
    else
      return true;
  }

}
