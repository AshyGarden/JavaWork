package etc.api.io.folder;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		
		/*
		 - 자바에서 외부경로로 폴더를 생성할떄는 File클래스 사용
		 - 생성자의 매개값으로 폴더를 생성할 경로+ 폴더명을 지정합니다. 
		 */
		
		File file = new File("C:\\WorkOnJava\\wow");
//		File file2 = new File("C:\\WorkOnJava\\wow\\test\\mytest\\apple");
		
		if(!file.exists()) { //선언한 경로에 파일이나 폴더 존재시 true, 존재하지 않는다면 false
			file.mkdir(); //makediretory(1개만 생성!, 만들고자 하는 경로의 사우이 디렉토리가 존재하지 않는 다면 동작 안함.)
//			file.mkdirs(); //makediretories(여러개 모두 생성!)
			System.out.println("폴더 생성 완료!");
		} else {
			System.out.println("해당 폴더가 존재합니다.");
		}
		
	}

}
