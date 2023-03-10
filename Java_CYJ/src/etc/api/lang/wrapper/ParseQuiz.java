package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String input = "";
		while(true) {			
			System.out.print("주민등록번호를 입력해주세요: ");
			input = sc.next();			
			//7번쨰에 하이픈
			//8번째숫자는 1,2,3,4
			//14자리
			StringBuilder sb = new StringBuilder(input);
			
			StringBuilder str1 = sb.delete(0, 7);
			str1 = sb.delete(1, 8);	

			StringBuilder str2 = sb.delete(0, 8);
			str2 = sb.delete(1, 7);	
			
			if(sb.length()!=14) {
				System.out.println("주민등록번호는 14자리입니다.");
			} else if(!str1.equals("-")) {
				System.out.println("주민번호 하이픈 미포함");
			} else if(!(str2.equals("1"))&&!(str2.equals("2"))&&!(str2.equals("3"))&&!(str2.equals("4"))){
				System.out.println("주민번호 뒷자리는 1,2,3,4이야야합니다");
			} else {	
				StringBuilder sb1 = sb.delete(3, 15);
				sb1.reverse();
				sb1.append("91");
				sb1.reverse();
				String str3 = sb1.toString();
				int age = 2023 - Integer.parseInt(str3)+1;
					
				sb.insert(0, "19");
				sb.insert(5, "년 "); //19xx년 
				sb.insert(9, "월 ");
				sb.insert(12, "일 ");
				sb.insert(14, age);
				sb.append("세 성별");

				break;	
			}
		}


		sc.close();

	}

}
