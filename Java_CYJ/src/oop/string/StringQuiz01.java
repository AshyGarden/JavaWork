package oop.string;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {
		/*
		 1. 스캐너로 id입력
		 2. id에 공백을 입력할수도있음
		 3. 공백을 제거한 아이디가 5글자 미만이라면 다시입력
		 4. 5글자이상입력시 "id등록" 출력후 종료
		 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		String comId;
		System.out.print("아이디를 입력해주세요: ");
		id: while(true) {
			String inputId= sc.next();	
			String firstStep = inputId.trim();
			String[] noBlanks = firstStep.split(" "); //무엇으로구분
			String noBlank = ""; 
			for(int i=0; i<noBlanks.length; i++){
				noBlank += noBlanks[i];
			}
			
			System.out.println(noBlank);
			if(noBlank.length()<5) {
				System.out.println("입력받은 아이디가 5글자 미만입니다. 다시 입력해주세요!");				
			} else {
				comId = inputId;
				break id;				
			}
			
		}
		
		/*
		while(true){
		     System.out.print("아이디를 입력해주세요: ");
		     String id =sc.nextLine();    //next = 공백에서 짤림, Nextline으로 받아야함
		     id = id.trim();
		     id = id.replace(" ","");
		     
		     if(id.length()<5){
		       System.out.print("아이디는 5글자 이상이여야 합니다.");
		     } else{
		       System.out.print("ID가 등록되었습니다");
		       break;
		     }
		}
		 		  
		 		  
		 		  
		 		  
		 		  
		 		  */
		
		
		
		
		
		
		
		System.out.printf("등록된 ID: %s",comId);
		sc.close();

	}

}
