package com;

import java.io.File;
import java.io.FileWriter;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class FileDemo {
	
	public static void main(String[] args) {
		
		try {
			File f=new File("d:/a/a1/a2/a3/a4/a4.txt");
			/*System.out.println("Length: "+f.length());
			System.out.println("Can Write?: "+f.canWrite());
			System.out.println("Execute?: "+f.canExecute());*/
			
			System.out.println(f.getPath());
			System.out.println(f.getParentFile());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.getName());
			//f.mkdir();
			//f.mkdirs();
			
			//FileWriter fw=new FileWriter(f+"/a4.txt");
			//fw.write("a4 file");
			//fw.close();
			//System.out.println("-- Done");
			
			
			
			
		} catch (Exception e) {
			System.out.println("--- Failed due to "+e);
		}
		
	}

}
