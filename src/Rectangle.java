
public class Rectangle extends Shape {
  private int length;
  private int width;
  
  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  @Override
  public void draw() {
    System.out.println("Four points... parallel and perpendicular...");
  }
  
  public int calculateArea() {
    return getLength() * getWidth();
  }
}
