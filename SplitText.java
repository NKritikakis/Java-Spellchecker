import java.util.Scanner;

/**
* Some comments for that class ... 
* 
* @author  Author name
* @version 1.0
*/
public class SplitText {
  Scanner input = new Scanner(System.in);
  String text = input.next();
  String inputText[] = text.split(" ");

  /**
  * This method is used ...
  * @return string This returns ... .
  */
  public String[] getTextArray() {
    return inputText;
  }
}
