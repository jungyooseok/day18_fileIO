package file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) throws Exception {
		File filePath = new File("I:/오전_취업반/test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		Scanner input = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = input.next();
		
		Test05 t = new Test05();
		t.setName(name);
		
		oos.writeObject(t);
		oos.close();
	}
}



