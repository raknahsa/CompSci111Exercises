/*
Create a class Employee that will represent a worker in some unknown industry. Each employee
should have a name, bank account balance and an hourly rate that is unique to them. So
Worker1 can have a rate of $5 per hour and Worker2 can have $8 per hour. Write 3 methods
for the employee class – a "work(int hours)"" method that adds money to that worker's balance,
a "spend (double money)"" method, and a "printinfo()"" method which prints that workers name,
rate, and balance. Add 2 constructors – one that lets you specify a starting balance and the rate,
and another that only lets you specify the rate and defaults the balance to 0.
Now write a program that creates 3 workers, assigns them to work a few shifts, spend some of
their money, then prints out the information for each worker.
As an extra challenge, you can prompt the user to create a "custom" Employee by asking for
name, starting rate, etc, and storing these in an array.

*/

public class Employee{
  public double balance;
  public double rate;


  public Employee(int b, int r){
    balance = b;
    rate = r;
  }

  public Employee(int r){
    rate = r;
    balance = 0;
  }

  public void work(int hours){
    balance = rate * hours;
  }

  public void spend(double money){
    balance = balance - money;
  }

  public void printInfo(){

  }

}
