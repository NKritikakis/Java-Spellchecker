import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
* Some comments for that class ... 
* 
* @author  Author name
* @version 1.0
*/
public class DocumentReader extends Thread {
  @Override
  // Needs an object to run e.x DocumentReader object1 = new DocumentReader();
  // object1.start();
  /**
  * Some comments ..
  * ....
  */
  public void run() {
    System.out.print("Please insert the file's name:");
    Scanner keyboard = new Scanner(System.in);
    String fileName = keyboard.next();
    Scanner inputStream = null;
    try {
      inputStream = new Scanner(new File(fileName));
    } catch (FileNotFoundException e) {
      System.out.println("Error opening the file" + fileName);
      System.exit(0);
    }
    while (inputStream.hasNextLine()) {
      // to our HashMap myMap = class.gethashMap();
      // myMap.add(inputStream.nextLine());
    }

  }
}
