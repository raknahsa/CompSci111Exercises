public class Elevator{

  private int topFloor;
  private int currentFloor;
  private int capacity;
  private int numRiders;

  public Elevator(int topFloor, int capacity){
    this.topFloor = topFloor;
    this.capacity = capacity;
    this.currentFloor = 0;
    this.numRiders = 0;
  }

  public void printInfo(){
    System.out.println("Elevator on floor: " + currentFloor + ", there are " + numRiders + " riders.");
  }

  public int getFloor(){
    return this.currentFloor;
  }

  public int getNumRiders(){
    return this.numRiders;
  }

  public void moveUp(int floor){
    if(floor > 0 && (currentFloor + floor <= this.topFloor)){
      currentFloor = floor;
    }
    else{
      currentFloor = topFloor;
    }
  }

  public void moveDown(int floor){
    if(floor > 0 &&  (currentFloor - floor >= 0)){
      currentFloor = floor;
    }
    else{
      currentFloor = 0;
    }
  }

  public void addRiders(int peeps){
    if(numRiders+peeps <= capacity){
      numRiders+=peeps;
    }
    else{
      numRiders = capacity;
    }
  }

  public void removeRiders(int peeps){
    if(numRiders-peeps >= 0){
      numRiders-=peeps;
    }
    else{
      numRiders = 0;
    }
  }


  public static void main(String[] args){
    Elevator e = new Elevator(10,25);
    e.printInfo();

    e.addRiders(20);
    e.addRiders(6);

    e.moveUp(7);
    e.moveDown(5);

    e.printInfo();

    e.removeRiders(30);

    System.out.println("Current Floor is " + e.getFloor() + " with " + e.getNumRiders() + " riders.");


  }
}
