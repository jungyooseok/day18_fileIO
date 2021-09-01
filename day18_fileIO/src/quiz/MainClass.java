package quiz;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		FileClass fc = new FileClass();
		while(true) {
			System.out.println("1.등록 2.확인 3.종료");
			num = input.nextInt();
			switch(num) {
			case 1:
				StudentClass sc = new StudentClass();
				while(true) {
					System.out.println("학번 입력");
					sc.setStNum( input.next() );
					
					if(fc.fileExists(sc.getStNum() )) {
						System.out.println("존재하는 학번");
						continue;
					}
					System.out.println("이름 입력");
					sc.setName( input.next() );
					fc.outFile(sc);
					break;
				}
				break;
			case 2:
				System.out.println("찾을 학번 입력");
				StudentClass sc01 = fc.inFile( input.next() );
				if(sc01 ==null) {
					System.out.println("해당 학번은 없다");
				}else {
					System.out.println(sc01.getName());
					System.out.println(sc01.getStNum());
				}
				break;
			case 3:return;
			}
		}
	}
}




