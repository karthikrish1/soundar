package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class f2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * 
		 * 
		 * file  :    reach the desitantion:       pass path f the file as input
		 * filereader : get a file               pass file object as input
		 * bufferedreadeer: read                  pass filereader object as input
		 * 
		 * nonstatic
		 * jva
		 * * 
		 * */

		File f= new File("C:\\Users\\hp\\eclipse-workspace\\sowndar\\src\\filehandling\\a.txt");
		FileReader fw= new FileReader(f);
		BufferedReader br= new BufferedReader(fw);
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		
		// first  br.readline reads hi   store in line     line=hi   line!=null   print hi
		//second  br.readline reads hello                 line=hello              print hello
		// third   br.readline reads bye                  line=bye                print bye
		//fourth   br.readline reads  nothing              line=nulll   null!=null   //terminate 
	}

}
