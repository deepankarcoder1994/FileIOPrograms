package com.deepankarPrac;

import java.io.File;
import java.io.IOException;

/**
 * Write a Code to create a file abc.txt in E:xyz folder
 *
 */

public class Example3 {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\xyz","abc.txt");
		f.createNewFile();
	}
	//Assume that E:\\xyz folder is already available in our System.

}
