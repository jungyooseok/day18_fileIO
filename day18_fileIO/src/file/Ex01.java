package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		File filePath = new File("I:/오전_취업반/test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath);
		
		fos.write(100);
		fos.write('E');
		
		String name = "반갑다";
		
		fos.write( name.getBytes() );
		Scanner input = new Scanner(System.in);
		name = input.next();
		String age = input.next();
		String addr = input.next();
		name+="\n";
		fos.write(name.getBytes());
		fos.write(age.getBytes());
		fos.write(addr.getBytes());
	}
}












