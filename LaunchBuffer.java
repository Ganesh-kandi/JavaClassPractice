package secondproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class LaunchBuffer {

	public static void main(String[] args) throws IOException {
		BufferedReader br1=new BufferedReader(new FileReader("ganesh.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("abcdf.txt"));
		PrintWriter pw=new PrintWriter("first.txt");
		String line1=br1.readLine();
		String line2=br2.readLine();
		while(line1!=null) {
			System.out.print(line1);
			if(line1!=null) {
			pw.println(line1);
			line1=br1.readLine();
			}
			System.out.println(" ");
			System.out.print(line2);
			if(line2!=null) {
				pw.println(line2);
				line2= br2.readLine();
			}
		}
		pw.flush();
		br1.close();
		br2.close();
		pw.close();	
	}

}
