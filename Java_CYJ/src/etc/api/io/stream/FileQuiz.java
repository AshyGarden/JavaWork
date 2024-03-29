package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz {

	public static void main(String[] args) {
		
		/*
        1. 스캐너를 통해서 파일명을 정확히 입력받습니다.     
        2. file폴더에 해당 파일이 존재한다면 해당 파일을 
        upload폴더로 복사하세요.
        파일이 존재하지 않는다면 "파일명이 없습니다." 예외구문을 출력하세요.
        3. 복사 도중에 에러가 발생하면 "파일 처리 중 예외 발생!" 구문을 출력.
        */
		
		Scanner sc = new Scanner(System.in);
		String targetName = "Planet";
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		boolean flag = false;
		
		while(!flag) {
			System.out.print("파일명을 입력해주세요: ");
			String fileName = sc.next();	
			if(fileName.equals(targetName)) {
				try {
					oldFile = new FileInputStream("C:\\WorkOnJava\\file\\Planet.jpg");
					newFile = new FileOutputStream("C:\\WorkOnJava\\upload\\copy.jpg");
					int result;
					byte[] arr = new byte[100];
//					while(true) {
//						//읽을 데이터가 있다면 읽은 데이터 길이 반환, 없다면 -1반환
//						int result = oldFile.read(arr);
//						if(result ==-1) break;
//						
//						//바이트단위로 0에서부터 읽은 크기까지의 파일을 작성
//						newFile.write(arr,0,result);
//					}
					
					while((result = oldFile.read(arr)) != -1) {						
						newFile.write(arr,0,result);
					}
					
				} catch(FileNotFoundException e) {
					System.out.println("파일이나 경로를 찾을수 없습니다!");
				} catch (IOException e) {
					System.out.println("파일 처리중 예외 발생!");
				} finally {
					try {
						flag = true;
						oldFile.close();
						newFile.close();
						System.out.println("복사가 완료되었습니다.");
					} catch (Exception e) {
						System.out.println("close 과정중 예외 발생!");
					}
				}		
			} else {
				System.out.println("파일명이 존재하지 않습니다. 다시 입력해주세요.");
			}		
		}

		sc.close();

	}

}
