package com.Java_Spellchecker_Team_Name;
import java.util.ArrayList;

/*Class returning final results to GUI
 * @author AntonisFaros
*/




public class Results {
	public static ArrayList<String> rightWords = new ArrayList<String>() ;
	

	
	public static void addWord(String word) {
		rightWords.add(word);
		
		}
	public static ArrayList<String> getResults() {
		return rightWords;
	}
	
	
	

}
