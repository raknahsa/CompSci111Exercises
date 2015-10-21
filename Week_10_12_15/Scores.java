/*
---Scores.java---
What is the problem?
Find average of set of scores except for the lowest and the highest
Input: First number of judges and then each score(ex. first enter 5 and the 5 scores separated by new line)
Output: Average of Scores(Disregard highest and lowest score when finding average)
//Changed sub
*/

public class Scores{
  public static void main(String args[]){

    double sum = 0;
    double average = 0;
    double loScore = 10.1;
    double hiScore = -.1;


    System.out.println("Enter the number of judges:");
    int numberOfJudges = IO.readInt();
/*
    while(numberOfJudges < 1){
      System.out.println("Number of judges must be greater than 0. Enter number again.");
      numberOfJudges = IO.readInt();
    }
    if(numberOfJudges == 1){ //error case of 1 judge
      double score = IO.readDouble();
      System.out.println(); //formatting
      IO.outputDoubleAnswer(score);
      return;
    }
    else if(numberOfJudges == 2){//error case of 2 judges, take the two and find the average
      sum = IO.readDouble();
      sum += IO.readDouble();
      average = sum/2;
      System.out.println(); //formatting
      IO.outputDoubleAnswer(average);
      return;
    }
*/

    while(numberOfJudges < 3){  //Judges less than 3 are now error conditions
      System.out.println("Number of judges must be greater than 2. Enter number again.");
      IO.reportBadInput();
      numberOfJudges = IO.readInt();
    }

    for(int j = 0; j < numberOfJudges; j++){

      double score = IO.readDouble();

      while(score < 0.0 || score > 10.0){
        IO.reportBadInput();
        score = IO.readDouble();
      }

      if(j == 0){
        hiScore = score;
      }
      else if( j == 1){
        if(score > hiScore){
          loScore = hiScore;
          hiScore = score;
        }
        else
        loScore = score;
      }

      else if(score > hiScore){
        hiScore = score;
      }
      else if(score < loScore){
        loScore = score;
      }

      sum += score;
    }

    sum -= (hiScore + loScore);
    average = sum / (double)(numberOfJudges - 2.0);
    System.out.println(); //formatting
    IO.outputDoubleAnswer(average);
  }
}
