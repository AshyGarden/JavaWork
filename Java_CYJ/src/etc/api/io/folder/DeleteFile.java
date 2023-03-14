package etc.api.io.folder;

import java.io.File;
import java.util.Arrays;

public class DeleteFile {

	public static void main(String[] args) {
		
		File file =  new File("C:\\WorkOnJava\\wow");
		//삭제는 일일히 지워줘야함! 여러개 생성 x
		
//		if(file.exists()) {
//			file.delete();
//			System.out.println("삭제 완료!");
//		} else {
//			System.out.println("파일 삭제 실패 or 존재 하지 않음!");
//		}
		
		//여러파일 삭제로직
		if(file.exists()) {
			if(file.isDirectory()) { //파일이 디렉토리인지 확인
				File[] files = file.listFiles();
				for(int i=0; i<files.length; i++) {
					if(files[i].delete()) {
						System.out.println(files[i].getName() + " 삭제 성공!");
					} else {
						System.out.println(files[i].getName() + " 삭제 실패!");
					}
				}
			}
			if(file.delete()) {
				System.out.println("삭제 성공!");
			} else {
				System.out.println("삭제 실패!");
			}
		}
		
		

	}

}
