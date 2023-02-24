package basic.array;

import java.util.Scanner;

public class ArrayInsertQuiz {

	public static void main(String[] args) {
		/*
        1. String 배열을 생성하세요. (foods)
        크기는 넉넉하게 50개로 지정하겠습니다.

        2. 사용자에게 음식 이름을 입력받아서 배열에
         삽입해 주세요.
         사용자가 음식 입력창에 '배불러' 라고 작성하면
         입력을 종료해 주세요.

        3. 입력이 종료되면 사용자가 입력한 음식을
        가로로 출력해 주세요. (null은 출력하지 마세요.)

         추가 문제 
        - 입력을 받았는데 이미 배열에 존재하는 음식이라면
        '이미 존재하는 음식입니다.' 를 출력하고
        다시 새로운 음식을 입력받을 수 있도록 코드를 제어해 보세요.

        */
		
		String[] foods = new String[50]; //
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		for(int i=0; i<foods.length; i++) {
			System.out.print("아 배고프다: "); //
			String food = sc.next();
			
			if(food.equals("먹고싶다")){                //탈출문
//				System.out.println("입력종료");
				System.out.println("이런거 먹고싶었네");
				break;
			}			
			
			for(int j=0; j<=i; j++) {                //중복문구 판별
				if(food.equals(foods[j])) {
					flag =false;
					System.out.println("는 이미 적은 음식.");
					break;
				} 
			}	    
			if(flag)
				foods[i] = food;    //중복이 없으니 		
		}
		
		for(String n : foods) {
			if(n==null) break;	
			System.out.print(n+" ");
		}
		sc.close();
		
		/*
		 String[] foods = new String[50];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("먹고싶은 음식을 입력하세요.");
		System.out.println("'배불러' 를 입력하시면 종료됩니다.");
		for(int i=0; i<foods.length; i++) {
			
			System.out.print("> ");
			String name = sc.next();
			
			if(name.equals("배불러")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			
			foods[i] = name;
		}
		
		System.out.println("-------------------------------");
		System.out.print("내가 먹고싶은 음식들: ");
		for(String f : foods) {
			if(f == null) break;
			System.out.print(f + " ");
		}
		
		sc.close();
		  
		  
		 */
		
	}

}
