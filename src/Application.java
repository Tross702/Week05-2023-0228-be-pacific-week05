import java.util.ArrayList;
import java.util.List;

/**
 * The default application / runner.
 */
public class Application {
  /**
   * The main entry point for the application.
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    // new Utility().run(args);
    
    Mallard duck = new Mallard();
    duck.fly();
    duck.waddle();
    duck.quack();
    //duck.goToSleep();
    duck.setAge(3);
    System.out.println("My duck " + duck.getName() + " is " + duck.getAge() + " years old.");
    
    // primitive (int, float, ...)
    // interface
    // class
    List<Integer> numbers = new ArrayList<Integer>();
    //numbers.
    Integer number1 = new Integer(10);
    //number1. // we have intellisense here.
    int number2 = number1;
    //numbers2. // no intellisense. primitive / simple type.

    //Shape shape = new Shape();
    Triangle triangle = new Triangle();
    triangle.draw();
    
    Rectangle rectangle = new Rectangle();
    rectangle.draw();
    rectangle.calculateArea();
    
    Square square = new Square();
    square.draw();
    square.calculateArea();
    
    Circle circle = new Circle();
    circle.draw();
    
    List<Shape> shapes = new ArrayList<Shape>();
    shapes.add(circle);
    shapes.add(square);
    shapes.add(triangle);
    shapes.add(rectangle);

    System.out.println("-------------------------------------");
    for(Shape shape: shapes) {
      shape.draw();
      // shape.calculateArea(); // Can't do this. Not defined on Shape
    }
  }
}
