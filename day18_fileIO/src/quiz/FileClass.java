package quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileClass {
	private FileInputStream fis;
	private BufferedInputStream bis;
	private ObjectInputStream ois;
	private FileOutputStream fos;
	private BufferedOutputStream bos;
	private ObjectOutputStream oos;
	private File filePath;
	public FileClass() {
		filePath =  new File( "I:/오전_취업반/test/");
	}
	public void outFile(StudentClass sc) {
		try {
			fos = new FileOutputStream(filePath+"/"+sc.getStNum()+".txt");
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			oos.writeObject(sc);
			oos.close();
			System.out.println("저장 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public boolean fileExists(String stNum) {
		File fileCheck = new File(filePath +"/"+ stNum+".txt");
		//System.out.println(filePath + stNum+".txt");
		//System.out.println(fileCheck.exists());
		return fileCheck.exists();//파일이 존재하면 true, 없으면false
	}
	public StudentClass inFile(String stNum) {
		if(fileExists(stNum)) {
			try {
				fis = new FileInputStream(filePath+"/"+stNum+".txt");
				System.out.println(filePath+"/"+stNum+".txt");;
				bis = new BufferedInputStream(fis);
				ois = new ObjectInputStream(bis);
				return (StudentClass)ois.readObject();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}










