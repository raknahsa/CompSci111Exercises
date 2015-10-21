/*
---TwoSmallest.java---
What is the problem?
Find the two smallest numbers from a list of numbers
Input: First enter the terminating number and then enter the list of numbers(separated by new line) and then the terminating number
ex. 6(terminating number), 34, 23, 78, 90 , 6(end of list)
Output: Two smallest numbers

*/

public class TwoSmallest{
  public static void main(String args[]){

    double terminValue = 0;
    double inputNum = 0;
    int count = 0;
    double smallValue = 0;
    double secondSmallValue = 0;


    System.out.println("Enter the terminating number:");
    terminValue = IO.readDouble();
    System.out.println("Enter the numbers:");
    inputNum = IO.readDouble();


    while(Math.abs(terminValue - inputNum) < .0001){
      System.out.println("Error! There has to be at least 2 numbers before the terminating number. Enter Number again");
      IO.reportBadInput();
      inputNum = IO.readDouble();
    }

    while(Math.abs(terminValue - inputNum) > .0001){

      if (count == 0){
        smallValue = inputNum;
      }
      else if(count == 1){
        if(inputNum < smallValue){
          secondSmallValue = smallValue;
          smallValue = inputNum;
        }
        else{
          secondSmallValue = inputNum;
        }
      }
      else if(inputNum < smallValue){
        secondSmallValue = smallValue;
        smallValue = inputNum;
      }
      else if(inputNum < secondSmallValue){
        secondSmallValue = inputNum;
      }

      count++;
      inputNum = IO.readDouble();
      if(count == 1){
        while(Math.abs(terminValue - inputNum) < .0001){
          System.out.println("Error! There has to be at least 2 numbers before the terminating number. Enter Number again");
          IO.reportBadInput();
          inputNum = IO.readDouble();
        }
      }
    }

    System.out.println(); //formatting
    IO.outputDoubleAnswer(smallValue);
    IO.outputDoubleAnswer(secondSmallValue);

  }
}
