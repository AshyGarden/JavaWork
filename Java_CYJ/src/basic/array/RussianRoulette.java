package basic.array;

import java.util.Arrays;
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
		int players = 0;
		int bullets = 0;
		
		//게임 인원 입력
		while (true){
			System.out.println("게임 인원을 입력해주세요");
			players = sc.nextInt();			
			if(players<2) {
				System.out.print("게임인원이 부족합니다. 다시입력해주세요\n");
			} else if(players>4) {
				System.out.print("게임인원이 너무 많습니다. 다시입력해주세요\n");				
			} else
				break;
		}
		
		//플레이어 이름 등록하고
		//배열을 하나 생성해서 플레이어들을 배치하시면 됩니다.
		//배열의 크기는 게임 참가자의 명수와 동일합니다.
		System.out.printf("%d명으로 게임을 시작했습니다.", players);
		String[] playerNames = new String[players];
		for(int i=0; i<playerNames.length; i++) {
			System.out.printf("%d번째 플레이어이름을 입력해주세요.",i+1);
			playerNames[i] = sc.next();	
		}
						
		//실탄 개수 입력(1미만이면 안되고, 5초과도 안됩니다.)
		bul: while (true){
			System.out.println("게임에 쓰일 탄환수를 입력해주세요");
			bullets = sc.nextInt();						
			if(bullets<1) {
				System.out.print("게임에 쓰일 탄환이 너무 부족합니다. 다시입력해주세요\n");
			} else if(bullets>4) {
				System.out.print("게임에 쓰일 탄환이 너무많습니다. 다시입력해주세요\n");				
			} 
			break bul;				
		}//여기까지 끝나면 탄환갯수가 0이 아님
		
		//실탄을 탄창에 배치
		boolean[] bulletPos = new boolean[6];
		
		
		//실행순서 정하기
		//난수를 이용하여 실행순서 정하기 false->true로 바꾸는것이 장전
		//시작인덱스를 난수로 정해서 돌아가게 하셔도되지만 같은위치에 두개의 실탄이 장전x
		//아예 배치를 섞어도 상관X
		int counter = 0;
		int armed = (int) (Math.random() * bulletPos.length);
		bulletIndex: while(true) {
			for(int i=0; i<bullets; i++) {
				if(bulletPos[armed]) { //깔끔한 코드라 본인것보다 강사님코드로 참조
					continue;
				} else {
					bulletPos[armed] = true;
					counter++;
				}
				
				if(counter == bullets)
					break bulletIndex;			
			}
		}
		
		int starter = (int)(Math.random() * players);
		System.out.printf("%s부터 게임을 시작합니다", playerNames[starter]);
		//최후의 1인or총알을 모두 소모할때까지
		
		int curBulletPos = 0; //현재 탄환의 위치
		int fire = 1; //발포횟수
		int deathCounter = 1; //n번째 죽은사람
		while(true) {
			System.out.printf("%s의 %d번째 발포준비.",playerNames[starter],fire);
			System.out.println("<엔터키로 발포!>");
			sc.nextLine();
			//발포시 사망했을때
			if(bulletPos[curBulletPos]) {
				System.out.printf("%s의 %d번째 아웃!",playerNames[starter],deathCounter);
				players--; //사람 줄여주기
				bullets--; //탄환수 줄여주기
				deathCounter++; // 죽은사람 카운트+

				//사람이름수줄이기
				for(int i=starter; i<playerNames.length-1; i++) {
					playerNames[i] = playerNames[i+1];
				}
				
				//사람이름 당기기
				String[] temp = new String[playerNames.length-1];
				for(int i=0; i<temp.length; i++) {
					temp[i] = playerNames[i];
				}
				playerNames = temp; 
				temp = null;
				
				//

				System.out.println("현재 남은 인원과 탄환수: ");
				System.out.println("생존 인원: " + Arrays.toString(playerNames));
				System.out.println("생존 인원: " + bullets);
				
				if(playerNames.length == 1) {
					System.out.println("최종 생존자: " + playerNames[0]); //마지막생존자는 0번 인덱스에 위치
					System.out.println("게임을 종료합니다.");
					break;
				} else if(bullets == 0) {
					System.out.println("총알이 다 떨어졌습니다.");
					System.out.println("최종 생존자: " + Arrays.toString(playerNames)); //남은 인원이 모두승리
					System.out.println("게임을 종료합니다.");
					break;
				} else {
					System.out.println("남은 인원이 게임을 재개합니다.");
					sc.nextLine();
				}
				
				if(starter == players)
					starter =0;
				
				curBulletPos++;
				
			} 
			
			
			
			
		}

		sc.close();
		
	}
				
		//sc.close();
		
		
		
		
		
		
		
		
		
		
		
		//수업시간에 써본코드(졸면서쳐서 참고용만)
//		int playerCount = 0;
//		String[] playersCreate = new String[playerCount];
//		
//		//참가자 입력
//		while(true) {
//			System.out.println("게임인원을 입력해주세요(2~4명)");
//			int num = sc.nextInt();
//			playerCount = num;
//			if(playerCount<2) {
//				System.out.println("인원이 너무 적습니다(1명이하). 다시 입력해주세요");	
//			} else if(playerCount>4) {
//				System.out.println("인원이 너무 많습니다(5명이상). 다시 입력해주세요");					
//			} else {//players 2~4
//				for(int i=0; i<playerCount-1; i++) {
//					System.out.printf("%d번째 참가자 이름을 적어주세요.",i+1);
//					String inputPlayer = sc.next(); 
////					inputPlayer = playersCreate[i];
//				}
//				System.out.println("%d명으로 게임을 시작합니다!");
//				break;
//			}
//		}
//		
//		String[] players = new String[playerCount];
////		for(int i=0; i<playerCount-1; i++) {
////			players[i] = playersCreate[i];
////		}		
//		players = playersCreate;
//		playersCreate = null;
		
		
		
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
			
			
		
		
//		while(true) {// 게임시작
////			for(int i = 0; i<bulletPos.length; i++) {		
////				if(bullePos[i]) {
////					}
////					
////				}			
////			
//		}
}
	
	

