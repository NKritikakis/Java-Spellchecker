package com.Java_Spellchecker_Team_Name;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class EnglishDictionary {
	public static HashMap<Integer,String> map;
	public EnglishDictionary() {
		map = new HashMap<Integer,String>();
		int i = 0;
		try (BufferedReader br = new BufferedReader(new InputStreamReader (new FileInputStream("C:\\Users\\tfaro\\eclipse-workspace\\Java_Spellchecker_Team_Name\\src\\main\\resources\\EnglishDictionary.txt")))) {

	        StringBuilder sb = new StringBuilder();

	        String line;
	        try {
				while ((line = br.readLine()) != null) {

				    sb.append(line);
				    map.put(i,line);
				    i++;

				    if (line != null) {
				        sb.append(System.lineSeparator());
				    }
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      
	        
	        
	    } catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
