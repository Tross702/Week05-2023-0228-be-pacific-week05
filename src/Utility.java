import java.util.ArrayList;
import java.util.List;

/**
 * A utility / helper class for doing common operations on arrays.
 */
public class Utility {
  
  /**
   * Gets the total of the list.
   * @param numbers The numbers to total
   * @return The total
   */
  public static int getTotal(List<Integer> numbers) {
    int total = 0;
    for(int number: numbers) {
      total += number;
    }
    return total;
  }

  /**
   * Gets the average of the list.
   * @param numbers The numbers to total
   * @return The average
   */ 
  public static double getAverage(List<Integer> numbers) {
    return (double) getTotal(numbers) / numbers.size();
  }

  /**
   * Gets the minimum of smallest number in the list.
   * @param numbers The numbers to search.
   * @return The smallest number
   */
  public static int getMinimum(List<Integer> numbers) {
    int smallest = Integer.MAX_VALUE;
    for(int number: numbers) {
      if (number < smallest) {
        smallest = number;
      }
    }
    return smallest;
  }
  
  /**
   * Gets the maximum of smallest number in the list.
   * @param numbers The numbers to search.
   * @return The largest number
   */
  public static int getMaximum(List<Integer> numbers) {
    int largest = Integer.MIN_VALUE;
    for(int number: numbers) {
      if (number > largest) {
        largest = number;
      }
    }
    return largest;
  }

  /**
   * Displays the values to the screen.
   * @param numbers The values to display.
   */
  public static void display(List<Integer> numbers) {
    display(numbers, " + ");
  }
  
  /**
   * Displays the values to the screen.
   * @param numbers The values to display.
   */
  public static void display(List<Integer> numbers, String delimiter) {
    StringBuilder output = new StringBuilder();
    int index = 0;
    for(int number: numbers) {
      if (index > 0) {
        output.append(delimiter);
      }
      output.append(number);
      index++;
    }
    System.out.println(output);
  }
  
  /**
   * Retrieves a collection of all of the values from the list than are greater than
   * or equal to the minimum value.
   * @param numbers The collection of numbers.
   * @param minimumValue The minimum value.
   * @return The values found.
   */
  public static List<Integer> getGreaterThanOrEqual(List<Integer> numbers, int minimumValue) {
    List<Integer> result = new ArrayList<Integer>();
    for(int number: numbers) {
      if (number >= minimumValue) {
        result.add(number);
      }
    }
    return result;
  }
  
  /**
   * Sample entry point for testing the Utility class.
   * @param args The command line arguments.
   */
  public void run(String[] args) {
    System.out.println("[Start]");
    // ------------------------------------------------------------------

    
    // Declare an array or List<> (a collection) that contains the 
    // following integer values:
    //
    //   72 89 40 58 2 31 29 65 66 61 36 9 7 4 10 33 71 85 22 93
    List<Integer> numbers = new ArrayList<Integer>(
        List.of(72, 89, 40, 58, 2, 31, 29, 65, 66, 61, 36, 9, 7, 4, 10, 33, 71, 85, 22, 93)
    );
    
    // Create a method that will take a collection of integer values 
    // as a parameter and display the values to the screen but 
    // formatting them with the addition (+) sign separating the numbers.
    //   i.e. 72 + 89 + 40 + 58 ...
    display(numbers);
    
    // Create a method that will take a collection of integer values
    // as a parameter and return the total.  
    //   i.e. 72+89+... = 883
    // Store the returned value into a local variable.
    // Output the value to the screen
    // (i.e. Total: 883)
    int total = getTotal(numbers);
    System.out.printf("Total: %d%n", total);
    
    // Create a method that will take a collection of integer values
    // as a parameter and return the average as a double. 
    //     i.e. (72+89+... ) / 20 = 44.15
    // Store the returned value into a floating point value (i.e. decimal).
    // Output the value to the screen
    // (i.e. Average: 44.15)
    double average = getAverage(numbers);
    System.out.printf("Total: %f%n", average);
    
    // Create a method that will take a collection of integer values
    // as a parameter and returns the smallest number found. 
    //     i.e. 2
    // Store the returned value into a local value.
    // Output the value to the screen.
    // (i.e. Minimum: 2)
    int minimum = getMinimum(numbers);
    System.out.printf("Minimum: %d%n", minimum);

    // Create a method that will take a collection of integer values
    // as a parameter and returns the largest number. 
    //     i.e. 93
    // Store the returned value into a local value.
    // Output the value to the screen.
    // (i.e. Maximum: 93)
    int maximum = getMaximum(numbers);
    System.out.printf("Maximum: %d%n", maximum);
    
    // BONUS:
    //
    // Create a method that will search a collection of integer values
    // and return a collection of integer values that are greater than
    // or equal to the second integer parameter.
    // 
    //    For example, if we called our method searching for all values
    //    greater than 55, then it should return a collection with the
    //    following values:
    //
    //         [ 72, 89, 58, 65, 66, 61, 71, 85, 93 ]
    //
    // Store the results into a local variable.
    // Output the contents of the collection to the screen.
    // 
    // REFACTOR: How can you reuse the display method you created earlier
    //           but instead have it separate the numbers with , values?
    List<Integer> result = getGreaterThanOrEqual(numbers, 55);
    display(result, ",");
    
    // ------------------------------------------------------------------
    System.out.println("[End]");
  }
}
