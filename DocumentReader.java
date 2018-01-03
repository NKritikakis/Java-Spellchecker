package com.Java_Spellchecker_Team_Name;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DocumentReader extends Thread {
	private Scanner keyboard;

	
	
	
	@Override
	public void run() {
		System.out.print("Please insert the file's name:");
		keyboard = new Scanner (System.in);
		String fileName = keyboard.next();
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new File(fileName));
		} catch(FileNotFoundException e) {
			System.out.println("Error opening the file" +fileName);
			System.exit(0);
		}
		while(inputStream.hasNextLine()) {
			// to our HashMap
		}


	}
}