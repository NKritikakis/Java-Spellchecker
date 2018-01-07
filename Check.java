/**
 * 
 */
package com.Java_Spellchecker_Team_Name;



/**
 * @author AntonisFaros
 *
 */
public class Check {
	public static boolean checkIfContained(String value) {
		
		if (Suggester.getMap().containsValue(value)) {
			return true;
			
		} else {
			return false;
		}
		
	}
	
	

}
