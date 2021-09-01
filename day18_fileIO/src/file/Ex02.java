package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) throws Exception  {
		File filePath = new File("I:/오전_취업반/test/aaa.txt");
		FileInputStream fis = new FileInputStream(filePath);
		while(true) {
			int res = fis.read(); 
			if(res < 0) {
				System.out.println("res : "+res);
				break;
			}
			System.out.println((char)res);
		}
	}
}
