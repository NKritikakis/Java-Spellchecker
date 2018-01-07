package com.Java_Spellchecker_Team_Name;

import java.util.LinkedList;

/*
 * @author AntonisFaros
 */
import java.util.Scanner;

class SplitText {
    private static Scanner scanner;
    private static LinkedList<String> inputText = new LinkedList<String>() ;

	static LinkedList<String> split(String input) {
		String text ;
		scanner = new Scanner (input);
		while (scanner.hasNext()) {
			text = scanner.next();
			inputText.add(text.replaceAll("[.,\\\\/#!$%\\\\^&\\\\*;:{}=\\\\-_`~()?]", "").toLowerCase());
		}
		
		
	return 	inputText;
    }

}


