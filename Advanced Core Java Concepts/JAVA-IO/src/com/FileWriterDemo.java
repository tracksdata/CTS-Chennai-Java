package com;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	
	public static void main(String[] args) {
		FileWriter fw=null;
		
		try {
			
			fw=new FileWriter("d:/aa/xyz.txt");
			String msg="Its Character Stream type";
			
			fw.write(msg);
			System.out.println("-- Writing is done");
			
			fw.close();
		} catch (Exception e) {
			System.out.println("-- Failed due to "+e);
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
