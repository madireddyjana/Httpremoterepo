package com.project1.enitittes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_handling {

	public static void main(String[] args) {

		File ob = new File("C:\\Users\\DELL\\Desktop");
		File arrya[] = ob.listFiles();

		for (int i = 0; i < arrya.length; i++) {

			System.out.println(arrya[i]);
		}

		File ob1 = new File("C:\\Users\\DELL\\Desktop\\myproject\\first_file.txt");
		try {
			FileWriter fw = new FileWriter(ob1);
			fw.write("hello from janardhana");

			fw.close(); // save before exiting
		} catch (IOException e1) {

			e1.printStackTrace();
		}

		if (ob1.exists()) {
			System.out.println("already file exists");
		}

		try {
			ob1.createNewFile();
		} catch (IOException e) {

			e.printStackTrace();
		}

		File ob11 = new File("C:\\Users\\DELL\\Desktop\\myproject\\myproject.txt");

		if (ob11.exists()) {

			ob11.delete();
		} else {
			System.out.println("there is nothing to delete");
		}
		System.out.println(ob1.getAbsolutePath());
		System.out.println(ob1.getPath());
		System.out.println(ob1.getParent());

	}

}
