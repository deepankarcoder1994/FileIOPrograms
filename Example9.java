package com.deepankarPrac;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * 
 * @author deepankars
 *  The below program is to demonstrate the second Overloaded Version of read() method where we read character 
 *  Array.
 */

public class Example9 {

	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		FileReader fr = new FileReader(f);
		System.out.println(f.length());
		char[] ch = new char[(int)f.length()];
		fr.read(ch);
		for(char ch1 : ch){
			System.out.print(ch1);
		}
	}

}
