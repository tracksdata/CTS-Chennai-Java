package com;

import java.io.File;
import java.io.FileOutputStream;

public class ByteWriteDemo {

	public static void main(String[] args) {

		try {

			File fileLoc = new File("d:/aa/abc.txt");

			if (fileLoc.exists()) {
				FileOutputStream fos = new FileOutputStream(fileLoc, false);

				String msg = "File got changed";

				byte data[] = msg.getBytes();

				for (int i = 0; i < data.length; i++) {
					char temp = (char)data[i];
					if(temp=='g')
						continue; // skips g 
					fos.write((int)temp);

				}
				

				// fos.write(data);// ALl the data

			} else {

				System.out.println("Invalid File location");

			}

			// System.out.println(a);

			/*
			 * for(byte b:data) { System.out.print(b); }
			 */

			System.out.println("--- Writing is Done");

		} catch (Exception e) {
			System.out.println("----- Failed Due to " + e);
		}

	}

}
