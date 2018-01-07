package com.Java_Spellchecker_Team_Name;
import java.util.HashMap;
import java.util.Map.Entry;
/*
 * Class implementing Levenshtein algorithm 
 * Creation of Suggestions from a HashMap of words
 * @author AntonisFaros,ZakKalderon,DimitrisPatrikalos
 * */
 
class Suggester {
	private static HashMap<Integer,String> map;
	
	public Suggester(String language) {
		if (language.equals("GR")) {
			Suggester.map = Dictionary.map;
		} else {
			Suggester.map = EnglishDictionary.map;
		}
	}
	static  HashMap<Integer,String> getMap(){
		return map;
	}
	static HashMap<String, String> suggestions = new HashMap<String, String>(); 
	Results obj; 
	public static  HashMap<String,String> getSuggestions(){
		return suggestions;
	}
	public static void createSuggestions(String input) {
		 int res = 100;
	     int current_distance;
	     String similar = null;
	     String value;
	     for (Entry<Integer, String> entry : Suggester.getMap().entrySet()) {
	    	 value = entry.getValue();
	    	 DamerauLevenshtein t = new DamerauLevenshtein(input,value );
	    	 current_distance = t.getSimilarity();
	    	 if (current_distance<res){
	    		 res = current_distance;
	    		 similar =value;
	    		 
	    	 }
			
	     }
	        
	       suggestions.put(input,similar);
	       
		
		
	}
	
	
	

}
