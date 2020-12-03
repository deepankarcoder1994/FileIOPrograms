package com.deepankarPrac;

import java.io.File;

/**
 * Write a Program only to display the file Names and their Count.
 * Exclude the Subdirectories.
 * @author deepankars
 *
 */

public class Example5 {

	public static void main(String[] args) {
		int count=0;
		File f = new File("D:\\Ports_Query");
		String[] s = f.list();
		for(String s2 : s){
			File f1 = new File(f,s2);
			if(f1.isFile()){
				count++;
				System.out.println(s2);	
			}
		}
		
		System.out.println("The total Number of file Count is : " + count);

	}

}
