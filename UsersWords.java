import java.util.LinkedList;

/**
* Some comments for that class ... 
* 
* @author  Author name
* @version 1.0
*/
public class UsersWords {
  // describe that variable here ...
  static LinkedList<String> myWords = new LinkedList<String>();

  /**
   * This method is used ...
   * @param input String: what we do with that variable
   * @return LinkedList<String> This returns ... .
   */
  public UsersWords(String input) {
    myWords.add(input);
  }

  /**
   * This method is used ...
   * @return LinkedList<String> This returns ... .
   */
  public static LinkedList<String> getUsersWords() {
    return myWords;
  }

  /**
   * This method is used ...
   * @param wordToSearch String: what we do with that variable
   * @return true This returns ... .
   */
  public static boolean CheckforWord(String wordToSearch) {
    if (myWords.contains(wordToSearch)) {
      return true;
    } else {
      return false;
    }
  }

}
