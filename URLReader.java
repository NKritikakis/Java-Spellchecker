package com.Java_Spellchecker_Team_Name;




import java.net.*;
import java.io.*;
import java.util.Scanner;

public class URLReader {
    private static Scanner input;

	public static void main(String[] args) throws Exception {
		input = new Scanner(System.in);
		System.out.println(" Please insert the url's name /the_file_you_want_to_read_from.txt: ");
		String myURL = input.next();
        URL oracle = new URL(myURL);
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}