package com;

import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("d:/aa/abc.txt");

			int len = fis.available();
			
			for (int i = 0; i < len; i++) {
				char ch=(char)fis.read();
				//if(ch=='g' || ch=='o' || ch=='d')
					//continue;
				System.out.print(ch);
				
			}

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
