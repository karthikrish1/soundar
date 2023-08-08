package exceptionhandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class e2 {
	// throws exceptionname

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f= new File("C:\\Users\\hp\\eclipse-workspace\\sowndar\\src\\filehandling\\a.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		
	}

}
