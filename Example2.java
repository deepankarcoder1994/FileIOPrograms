package com.deepankarPrac;

import java.io.File;
import java.io.IOException;

/***
 * Write a Code to create a Directory named with durga123 in current working directory, and create a file named with
 * demo.txt in that directory.
 *
 */
public class Example2 {
	
	public static void main(String[] args) throws IOException {
		//Below line first Constructor is Used
		File f = new File("durga123");
		f.mkdir();
		//Below line second Cons is used
		File f1 = new File("durga123","demo.txt");
		//Below line third Cons is Used
		File f2 = new File(f,"demo.txt");
		
		//Create f1 file in durga123 directory.
		f1.createNewFile();
	}

}
