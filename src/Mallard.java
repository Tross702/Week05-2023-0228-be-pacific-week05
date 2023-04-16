

public class Mallard implements Duck, Comparable<Mallard> {
  private int age;
  private String name;
  
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

//  public int getAge() {
//    return age;
//  }
//  
//  public void setAge(int age) {
//    this.age = age;
//  }
 
  private void goToSleep() {    
  }
  
  @Override
  public void fly() {
    System.out.println("Up, up and away...");
    goToSleep();
  }

  @Override
  public void waddle() {
    System.out.println("Don't laugh at me. I'll get there...");
  }
  
  public void quack() {
    System.out.println("Quack! Quack!");
  }

  @Override
  public int compareTo(Mallard o) {
    // TODO Auto-generated method stub
    return 0;
  }
}
