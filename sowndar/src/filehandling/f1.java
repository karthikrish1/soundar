package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class f1 {
//control+shift + o
	public static void main(String[] args) throws IOException {
		/*
		 * 
		 * 
		 * file  :    reach the desitantion:       pass path f the file as input
		 * filewriter: create a file               pass file object as input
		 * bufferedwriter: write                   pass filewriter object as input
		 * 
		 * nonstatic
		 * jva
		 * * 
		 * */

		File f= new File("C:\\Users\\hp\\eclipse-workspace\\sowndar\\src\\filehandling\\a.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("hi");
		bw.newLine();
		bw.write("hello");
		bw.newLine();
		bw.write("bye");
		bw.close();
	}

}
