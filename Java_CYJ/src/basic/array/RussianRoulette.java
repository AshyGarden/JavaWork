package basic.array;

import java.util.Scanner;

public class RussianRoulette {

	public static void main(String[] args) {
		/*
        - 게임 인원은 2 ~ 4명 입니다.
        - 실탄 개수는 6개 미만으로 설정하겠습니다.
        - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
         또한 총알의 위치도 랜덤으로 설정됩니다.
        - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
        ex)  [false, false, false, true, false, false]
        - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 
         랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
         원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
        */
		
		Scanner sc = new Scanner(System.in);
		//게임 인원 입력
		
		
		//플레이어 이름 등록하고
		//배열을 하나 생성해서 플레이어들을 배치하시면 됩니다.
		//배열의 크기는 게임 참가자의 명수와 동일합니다.
				
				
		//실탄 개수 입력(1미만이면 안되고, 5초과도 안됩니다.)
		//실탄을 탄창에 배치
		boolean[] bulletPos = new boolean[6];
		
		
		//실행순서 정하기
		//난수를 이용하여 실행순서 정하기
		//시자긴덱스를 난수로 정해서 돌아가게 하셔도되고
		//아예 배치를 섞어도 상관X
		
		//일부러 입력대기하여 흐름끊어주기
		//이 입력값은 받아서 활용할 것이 아님
		//sc.nextLine();
		
		//최후의 1인or총알을 모두 소모하래까지
		
		
		
		int playerCount = 0;
		String[] playersCreate = new String[playerCount];
		
		//참가자 입력
		while(true) {
			System.out.println("게임인원을 입력해주세요(2~4명)");
			int num = sc.nextInt();
			playerCount = num;
			if(playerCount<2) {
				System.out.println("인원이 너무 적습니다(1명이하). 다시 입력해주세요");	
			} else if(playerCount>4) {
				System.out.println("인원이 너무 많습니다(5명이상). 다시 입력해주세요");					
			} else {//players 2~4
				for(int i=0; i<playerCount-1; i++) {
					System.out.printf("%d번째 참가자 이름을 적어주세요.",i+1);
					String inputPlayer = sc.next(); 
//					inputPlayer = playersCreate[i];
				}
				System.out.println("%d명으로 게임을 시작합니다!");
				break;
			}
		}
		
		String[] players = new String[playerCount];
//		for(int i=0; i<playerCount-1; i++) {
//			players[i] = playersCreate[i];
//		}		
		players = playersCreate;
		playersCreate = null;
		
		
		
		//탄환개수 생성
//		while(true) {
//			System.out.println("탄환 개수를 설정해주세요");
//			
//			int bulletCount  = sc.nextInt();
//			for(int i=0; i<bulletCount; i++) {
//				bulletPos = true;
//			}
//				
//		}
			
			
		}
		
//		while(true) {// 게임시작
////			for(int i = 0; i<bulletPos.length; i++) {		
////				if(bullePos[i]) {
////					}
////					
////				}			
////			
//		}
		
}
	
	

