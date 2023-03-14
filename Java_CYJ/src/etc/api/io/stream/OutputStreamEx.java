package etc.api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx {

	public static void main(String[] args) {
		
		/*
		 
		 1. 파일 작성시 사용하는 클래스는 FileOutputStream입니다.
		 2. 생성자의 매개값ㅇ로 파일을 쓸 전체경로를 지정합니다.
		 3. io패키지의 모든클래스들은 생성자에 throws 키워드가 있기 때문에  
		    try-catch블록을 항상 작성해줘야한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명: ");
		String fileName = sc.next();
		FileOutputStream fos = null;
		                                                                 
		try {                                                                //백슬래시 1개만 작성시 탈출코드로 인식, 그래서 file뒤에 2개작성
			fos = new FileOutputStream("C:\\WorkOnJava\\file\\" + fileName + ".txt"); //파일 만들 경로
	        System.out.print("문장을 입력하세요: ");           //또는 정슬래시1개도 상관x
	        sc.nextLine(); //위에 next의 엔터 라인으로
	        String str = sc.nextLine();
	        
	        byte[] arr = str.getBytes(); //문제열 데이터를 바이트데이터로 변환.
	        fos.write(arr); //파일을 바이트 단위로 써 내리기;
	        System.out.println("파일이 정상적으로 저장되었습니다.");
	        
	        
		} catch (Exception e) {                
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		                                              
		
		
		
	}

}
