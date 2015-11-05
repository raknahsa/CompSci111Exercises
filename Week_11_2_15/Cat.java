public class Cat{

  private String name;
  private int age;
  private double weight;
  private String color;
  private boolean tail;


  public void Cat(){
    this.name = "Bob";
    this.age = 1;
    this.weight = 3.0;
    this.color = "black";
    this.tail = true;
  }

  public void Cat(String name, int age, double weight, String color, boolean tail){
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.color = color;
    this.tail = tail;
  }

  public void setAge(int age) {
    if(age > 0)
      this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public double getWeight() {
    return this.weight;
  }

  public void setColor(String color){
    this.color = color;
  }

  public String getColor(){
    return this.color;
  }

  public void setTail(boolean tail){
    this.tail = tail;
  }

  public boolean getTail() {
    return this.tail;
  }

  public void dye(String color){
    this.color = color;
  }

  public boolean equals(Cat cat){//System funcion overrride
    if(this.age == cat.age && this.weight == cat.getWeight() && this.color.equals(cat.getColor()) && this.tail == cat.getTail() ){
      return true;
    }
    return false;
  }

  public String toString(){ //System function overrride
    //fill with stuff
    return this.name
  }

}
