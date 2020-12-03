package com.deepankarPrac;

import java.io.File;
import java.io.IOException;

/*
 * Write a Code to create a file Named with "abc.txt" in current working directory
 * 
 */

public class Example1 {

	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		f.createNewFile();
	}

}
