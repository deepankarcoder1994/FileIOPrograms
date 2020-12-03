package com.deepankarPrac;

import java.io.File;

/*
 * Write a Program to display the Names of all files and Subdirectories present in
 * D:\\Ports_Query
 */

public class Example4 {

	public static void main(String[] args) throws Exception {
		int count=0;
		File f = new File("D:\\Ports_Query");
		String[] s = f.list();
		for(String s1 : s){
			count++;
			System.out.println(s1);
		}
		
		System.out.println("The Total Number :" + count);
	}

}
