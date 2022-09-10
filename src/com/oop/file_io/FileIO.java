package com.oop.file_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr1 = {"Rumi","Mos","Jeki"};
		
		try {
			BufferedWriter file1 = new BufferedWriter(new FileWriter("D:\\test\\name.txt"));
			file1.write("All the names");
			for(String name  : arr1) {
				file1.write("\nName: " + name);
			}
			
			file1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			BufferedReader file2 = new BufferedReader(new FileReader("D:\\test\\name.txt"));
			
			String line;
			while((line = file2.readLine()) != null) {
				System.out.println(line);
			}
			
			file2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
