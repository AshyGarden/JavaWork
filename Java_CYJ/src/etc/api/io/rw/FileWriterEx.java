package etc.api.io.rw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	
	public static void main(String[] args) {
		
		/*
		 - 문자를 써서 저장할 때 사용하는 클래스 FileWriter입니다.
		 - 기본적으로 2바이트 단위로 처리하기에 문자쓰기에 적합 
		 */
		 
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("C:\\WorkOnJava\\file\\hello2.txt");
			
			// \r: 캐리지 리턴 -> 커서를 안쓰면 다른 운영체제에서 오류남
			// \n: 줄 개행(줄바꿈)
			//상황과 환경에 따라 줄 개행시 커서를 맨앞으로 안땡겨주는 경우가 있기에 둘다 적어줌
			String str = "오늘은 3월 14일입니다.\r\n화요일입니다.\r\n근데 왜 아직도 화요일이죠?"; 
			
			fw.write(str);
			System.out.println("파일이 정상적으로 저장되었습니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
