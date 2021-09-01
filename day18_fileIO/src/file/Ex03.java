package file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception  {
		File filePath = new File("I:/오전_취업반/test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		for(char i = '1'; i < '9'; i++) {
			//Thread.sleep(1000);
			//fos.write(i);
			bos.write(i);
		}
		bos.close();
		bos.write('a');
		bos.flush();
	}
}
