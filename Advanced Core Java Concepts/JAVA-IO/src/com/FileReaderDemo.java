package com;

import java.io.FileReader;

public class FileReaderDemo {
	
	public static void main(String[] args) {
		try {
			
			FileReader fr=new FileReader("d:/aa/xyz.txt");
			int x=0;
			while((x=fr.read())!=-1){
				System.out.print((char)x);
			}
			
			
		} catch (Exception e) {
			System.out.println("--- Failed due to "+e);
		}
	}

}
