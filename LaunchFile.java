package secondproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class LaunchFile {

	public static void main(String[] args) throws IOException {
		
//		FileWriter fw= new FileWriter("abcdf.txt");
//		fw.write(8520);
//		fw.write("ganesh kandi ");
//		fw.flush();
//		fw.close();
		
		
		FileReader fr=new FileReader("abcdf.txt");
		int i=fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
		fr.close();
		System.out.println(" ");
		
		File f= new File("ganesh.txt");
		FileWriter fw1= new FileWriter(f);
		fw1.write(546);
		fw1.write("java is very easy progrmamming language to learn........");
		fw1.flush();
		fw1.close();
		FileReader fr1=new FileReader(f);
		int j=fr1.read();
		while(j!=-1) {
			System.out.print((char)j);
			j=fr1.read();
		}
	}

}
