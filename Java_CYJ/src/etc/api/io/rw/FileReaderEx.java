package etc.api.io.rw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {

		/*
		 - 문자기반으로 읽어들이는 클래스는 FileReader 입니다.
		 - 2바이트 단위로 읽기 때문에 문자를 읽어들이기 적합합니다.
		 */
		
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\\\WorkOnJava\\\\file\\\\hello2.txt");
			
			char[] arr = new char[100]; //100개 고정갯수는 아님
			
			int result = fr.read(arr);
			System.out.println("문자 갯수: " + result);
			for(char c: arr) {
				System.out.print(c);
				if(c==0) break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
