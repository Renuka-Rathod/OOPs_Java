package com.fileapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.stream.Stream;

public class TestFileIO {

	public static void main(String[] args) {

		System.out.println("1 Create File 2: operations on file 3: read file 4: write 5:copy data into ");

		try {
			Scanner sc = new Scanner(System.in);
			int ch;
			String fileName = null;
			do {
				System.out.println("Enter Choice:");
				ch = sc.nextInt();

				switch (ch) {
				case 1:
					System.out.println("Enter File Name ");
					fileName = sc.next();

					File file = new File(fileName);

					if (file.exists())
						System.out.println("Exist");
					else {
						file.createNewFile();
						System.out.println("Created");

					}
					break;

				case 2:
					System.out.println("Enter File Name ");
					fileName = sc.next();
					file = new File(fileName);
					if (file.exists()) {
						System.out.println("Exist");

						System.out.println("Length:" + file.length());
						System.out.println("Path:" + file.getPath());

						System.out.println("Abs Path:" + file.getAbsolutePath());

						System.out.println("Read:" + file.canRead());

						System.out.println("Write:" + file.canWrite());

						// file.delete();
					} else
						System.out.println("not exist");

					break;
				case 3:
					System.out.println("----Reading File-------");
					System.out.println("Enter File Name ");
					// fileName = sc.next();

					// FileReader fileReader=new FileReader(file);

					// FileReader fileReader=new FileReader(fileName);

					// BufferedReader reader=new BufferedReader(fileReader);

					// or
					BufferedReader reader = new BufferedReader(new FileReader(sc.next()));

					String line=null;
					
					
//					while((line=reader.readLine())!=null)
//					{
//						 		
//					 
//						System.out.println(line);
//					}
					
				 
//					Stream<String> myStream=reader.lines();
//					
//					myStream.forEach(null);
//					
 					reader.lines().forEach(s->System.out.println(s));
//					
					
					reader.close();
					
					break;
				case 4:
					System.out.println("----Writing File-------");
					System.out.println("Enter File Name ");
					fileName=sc.next();
					
					
					BufferedWriter writer=new BufferedWriter(new FileWriter(fileName));
					
					//
					writer.write("This is From Application To Write Into file");
					
					writer.close();

					break;
				case 5:
					//accept source file and destination file name
					//copy data from source to destination
					
					
					//Lab
					break;
				case 6:
					break;

				default:
					break;

				}

			} while (ch != 0);
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}

	}

}
