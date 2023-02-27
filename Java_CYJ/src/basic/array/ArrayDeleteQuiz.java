package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] kakao = {"무지","네오","어피치","라이언","춘식이"};
		System.out.println("현재저장된 친구들: "+Arrays.toString(kakao));
		System.out.println("삭제를 원하는 친구를 입력하세요: ");
		String name = sc.next();

		/*
		 1. 삭제할 친구르 입력받아서 삭제진행
		 2. 입력받은 이름이 없다면 없다고 전해주기
		 
		 */
		boolean flag = true;
		int indexNum = 0;
		String[] temp = new String[kakao.length-1];
//		for(int i=0; i<kakao.length-1; i++) {
//		    for(int j=0; j<kakao.length-1; j++) {
//			    if(name.equals(kakao[j])) {
//				   indexNum = j;
//			    }
////			      else{
////			      System.out.println();
////				  break;
////			    }
//		    }
//		    kakao[i] =kakao[i+1];
//		}
		
		 for(int i=0; i<=kakao.length-1; i++) { //겹치는게있다면
		    	if(name.equals(kakao[i])) {
		    		indexNum = i;
		    		flag = false;
		    		break;
		    	}
		 }

		 if(!flag) {
			 for(int i=indexNum; i<kakao.length-1; i++) {
				 kakao[i] =kakao[i+1];
			 }
			 
			 for(int i=0; i<temp.length; i++){
				temp[i] = kakao[i];		
			 }
			 kakao = temp;
		     temp  = null;
				
		     System.out.println(Arrays.toString(kakao));		 
		 }
		 else {
			 System.out.println("그런 이름은 존재하지 않습니다.");
		 }
		
//		System.out.println(Arrays.toString(kakao));
//		System.out.println(Arrays.toString(temp));
		 
		 /*
		boolean flag = false;
		for(int i=0; i<kakao.length; i++) {
			if(name.equals(kakao[i])) {
				flag = true;
				for(int j=i; j<kakao.length-1; j++) { //삭제시 배열값 재정령하고 나오기
					kakao[j] = kakao[j+1];
				}
				break;
			}
		}
		
		
		if(!flag) { // flag == false?
			System.out.println(name + "(은)는 없는 이름입니다.");
		} else {
			String[] temp = new String[kakao.length-1];
			for(int k=0; k<temp.length; k++) {
				temp[k] = kakao[k];
			}
			kakao = temp;
			temp = null;
			
			System.out.println("삭제 후 정보: " + Arrays.toString(kakao));
		} 
		*/

		sc.close();
	}

}
