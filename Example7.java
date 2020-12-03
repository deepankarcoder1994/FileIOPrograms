package com.deepankarPrac;
/**
 * 
 * File Writer Demo
 */

import java.io.FileWriter;
import java.io.IOException;

public class Example7 {

	public static void main(String[] args) throws IOException {
		//The Below line will print the Current working Directory.
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		
		FileWriter fw = new FileWriter("abc.txt");
		fw.write(100); //Adding a Single Character
		fw.write("urga\nSoftwareSolutions");
		fw.write('\n');
		char[] ch1 = {'a','b','c'};
		fw.write(ch1);
		fw.write('\n');
		fw.flush();
		fw.close();
	}
	//In the above example the file writer can perform Overriding an Existing data.
	//Instead of Overriding if we want append operation, then we have to create 
	//File Writer Object as follows
	//FileWriter fw = new FileWriter("abc.txt",true);

}
