public class GraderNew{
  public static void main(String args[]){

      int choice = 0;
      int counter = 0;
      double[][] gradebook = new double[100][30];
      String[] students = new String[100];
    /*  for(int x = 0; x < gradebook.length ; x ++){
        gradebook[x] = -1;
      }
      */

      while(choice != 7){

        System.out.println();
        System.out.println("Menu");
        System.out.println("1. Change Student Grade");
        System.out.println("2. Add Student");
        System.out.println("3. Find Student");
        System.out.println("4. Average Student");
        System.out.println("5. Average Class");
        System.out.println("6. Print Grades");
        System.out.println("7. Exit");

        choice = IO.readInt();

        switch(choice){
          case 1:
            //changeGrade(gradebook, counter);
            break;
          case 2:
            //counter = addGrade(gradebook, counter);
            break;
          case 3:
          //  averageGrade(gradebook, counter);
            break;
          case 4:
            //printGradebook(gradebook, counter);
            break;
          case 5:
            break;
          case 6:
            break;
          case 7:
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

  public static void printGradebook(double[][] gb, String [] roster){
    for(int i = 0; roster[i]!= null && i < roster.length; i++){
      System.out.println(roster[i]+ ": ");

      for(int j = 0; j < gb[i].length; j++){
        System.out.print(" " + gb[i][j]);
      }
    }
  }

  public static int addStudent(String[] roster, String name, int index){
    if (index < roster.length){
      roster[index] = name;
      return index+1;
    }
    else{
      System.out.println("Gradebook Full!");
      return index;
    }
    //counter can not be changed since int variable is not in scope, index needs to be passed to counter
  }

  public static int findStudent(String[] roster, String name){

    for(int i = 0; roster[i] != null && i < roster.length; i++){
      if(roster[i].equals(name)){
        return i;
      }
    }
      return -1;
  }


  public static void changeGrade(double [][] gb,String [] roster,  String name, double grade, int assignnment){

      if(grade < 0  || grade > 100){
        System.out.println("Grade should be between 0 and 100");
        return;
      }

      if(findStudent(roster, name) == -1){
        System.out.println("Student not in records");
        return;
      }
  /*
      if(assignment < 0 || assignment > gb[findStudent(roster, name)].length){
        System.out.println("")
      }
  */
      gb[findStudent(roster, name)][assignnment] = grade;
      return;
    }


  public static double assignAvg(double[][] gb, int assign){
    /*stuff */
  }


}
