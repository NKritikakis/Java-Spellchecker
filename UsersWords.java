import java.util.LinkedList;
public class UsersWords {
	static LinkedList<String> myWords = new LinkedList<String>();
	public UsersWords(String input) {
		myWords.add(input);
	}
	public static LinkedList<String> getUsersWords() {
		return myWords;
	}
	public static boolean CheckforWord(String wordToSearch) {
		if (myWords.contains(wordToSearch)) {
			return true;
		}else {
			return false;
		}
	}



}
